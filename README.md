```markdown
# 🗳️ Contador de Votos em Java com Map

Este projeto demonstra como utilizar a interface `Map<K, V>` em Java para contar votos a partir de um arquivo `.csv`.
 Ele é um exemplo prático do uso da implementação `HashMap` da interface `Map`.

## 📋 Descrição

O programa lê um arquivo localizado em `C:\temp\in.csv`, onde cada linha contém o nome de um candidato e a quantidade de votos separados por vírgula.
 A aplicação acumula os votos por candidato e exibe o resultado total de cada um no console.

### 📄 Exemplo de entrada (CSV)

```

João Pedro,5
Maria Ferreira,3
João Pedro,2
Carlos Silva,4

```

### 📤 Saída esperada

```

João: 7 votes
Maria: 3 votes
Carlos: 4 votes

````

## 🛠 Tecnologias Utilizadas

- Java SE
- `HashMap` (`Map<String, Integer>`)
- Leitura de arquivos com `BufferedReader` e `FileReader`

## 🚀 Como Executar

1. Crie um arquivo chamado `in.csv` com os dados de votação.
2. Salve o arquivo no caminho: `C:\temp\in.csv`
3. Compile e execute o código Java:

```bash
javac -d bin src/application/Program.java
java -cp bin application.Program
````

> 📝 Certifique-se de que a estrutura de diretórios esteja correta, com o pacote `application` dentro de `src`.

## ⚠️ Observações

* O caminho do arquivo está fixo como `C:\temp\in.csv`. Altere no código se necessário.
* O programa trata exceções de entrada/saída (`IOException`) com mensagens simples no console.

## 📁 Estrutura do Projeto

```
project-root/
├── src/
│   └── application/
│       └── Program.java
├── C:/temp/in.csv  <-- (Arquivo de entrada)
└── README.md
```
