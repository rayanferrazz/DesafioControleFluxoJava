# Desafio de Controle de Fluxo — Java

![Java](https://img.shields.io/badge/Java-11%2B-orange?logo=openjdk&logoColor=white)
![Console](https://img.shields.io/badge/aplica%C3%A7%C3%A3o-console-lightgrey)

Exercício de **controle de fluxo e tratamento de exceções** em Java. O programa lê dois números inteiros e imprime uma contagem a partir da diferença entre eles. Se o primeiro número for maior ou igual ao segundo, uma exceção personalizada é lançada e tratada.

Projeto desenvolvido durante os estudos de Java, com base no desafio de controle de fluxo da **DIO (Digital Innovation One)**.

---

## Sumário

- [Como funciona](#como-funciona)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Como compilar e executar](#como-compilar-e-executar)
- [Exemplos de execução](#exemplos-de-execução)
- [Conceitos praticados](#conceitos-praticados)
- [Limitações e próximos passos](#limitações-e-próximos-passos)

---

## Como funciona

O fluxo é simples:

1. O programa solicita o **primeiro parâmetro**;
2. Solicita o **segundo parâmetro**;
3. Chama o método `contar(primeiro, segundo)`;
4. Se `primeiro >= segundo`, lança `ParametrosInvalidosException`;
5. Caso contrário, calcula `contagem = segundo - primeiro` e imprime os números de `1` até `contagem`.

Exemplo: entradas `12` e `30` → saída com os números de `1` a `18`.

## Estrutura do projeto

```text
src/
└── controlefluxo/
    ├── Contador.java                    # Classe principal e lógica da contagem
    └── ParametrosInvalidosException.java # Exceção personalizada
```

| Classe | Responsabilidade |
| --- | --- |
| `Contador` | Lê os dados do console, valida e imprime a contagem |
| `ParametrosInvalidosException` | Exceção de negócio para parâmetros inválidos |

> O projeto não usa Maven/Gradle: são apenas dois arquivos `.java`. A compilação é feita diretamente com `javac`.

## Pré-requisitos

- **JDK 11** ou superior instalado (`javac -version` e `java -version`).

## Como compilar e executar

No diretório raiz do projeto:

### Windows (PowerShell/CMD)

```bash
javac -d out src\controlefluxo\*.java
java -cp out controlefluxo.Contador
```

### Linux/macOS

```bash
mkdir -p out
javac -d out src/controlefluxo/*.java
java -cp out controlefluxo.Contador
```

### Usando uma IDE

1. Importe a pasta `src` como projeto Java;
2. Execute a classe `controlefluxo.Contador` (método `main`).

## Exemplos de execução

### Caso válido

```text
Digite o primeiro parâmetro: 12
Digite o segundo parâmetro: 30

Imprimindo o número: 1

Imprimindo o número: 2
...
Imprimindo o número: 18
```

### Caso inválido

```text
Digite o primeiro parâmetro: 30
Digite o segundo parâmetro: 12

O segundo parâmetro deve ser maior que o primeiro
```

## Conceitos praticados

- Leitura de dados com `Scanner`;
- Estruturas de repetição (`for`);
- Métodos estáticos;
- Criação e lançamento de **exceções personalizadas**;
- Tratamento de exceções com `try/catch`;
- Organização em pacotes (`package controlefluxo`).

## Limitações e próximos passos

- O programa **não valida entradas não numéricas** — digitar texto gera `InputMismatchException`.
- O `Scanner` não é fechado explicitamente.
- Não há testes automatizados.
- Melhorias possíveis:
  - Validar a entrada com `scanner.hasNextInt()`;
  - Fechar o `Scanner` com `try-with-resources`;
  - Extrair a lógica para uma classe de serviço testável;
  - Adicionar testes com JUnit.

## Autor

Desenvolvido por **Rayan Ferraz** para fins de estudo.

- GitHub: [@rayanferrazz](https://github.com/rayanferrazz)
