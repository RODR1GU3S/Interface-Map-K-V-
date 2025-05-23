package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.csv"; // Caminho do arquivo

		Map<String, Integer> votes = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				Integer quantity = Integer.parseInt(fields[1]);

				
				// Acumula os votos no Map

//				Estrutura tradicional com containsKey
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, quantity + votesSoFar);
				}
				else {
					votes.put(name, quantity);
				}
				
//				Estrutura compacta com getOrDefault
//				votes.put(name, votes.getOrDefault(name, 0) + quantity);
				
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		// Exibe os resultados
		for (String candidato : votes.keySet()) {
			System.out.println(candidato + ": " + votes.get(candidato) + " votes");
		}
	}
}
