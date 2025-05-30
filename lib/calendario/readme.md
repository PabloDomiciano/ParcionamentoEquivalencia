# Calendário em Modo Texto (Estilo `cal` do Linux)

Este projeto implementa um visualizador de calendários em modo texto, inspirado no comando `cal` do Linux. O programa permite exibir o calendário atual, de um ano completo ou de um mês específico, com base nos parâmetros fornecidos.

## ✨ Funcionalidades

- Exibe o calendário do **mês atual** se nenhum parâmetro for passado.
- Exibe o calendário de **todos os meses de um ano** se apenas o ano for informado.
- Exibe o calendário de **um mês específico de um ano** se mês e ano forem informados.
- Suporte a anos de `1` a `9999`.
- Implementa regras históricas do calendário gregoriano, como a **Reforma Gregoriana de 1582**.

## 🛠 Assinaturas dos Métodos

```java
String getCalendario()                      // Mês atual
String getCalendario(String ano)            // Todos os meses do ano informado
String getCalendario(String mes, String ano) // Mês específico de um ano
```

> 📌 Nota: `getCalendario("22")` retorna o calendário do ano **22**, não de 2022.

## 📅 Regras de Exibição

- O ano se inicia em **1º de janeiro**.
- A **Reforma Gregoriana** é respeitada:
  - O **dia 4 de outubro de 1752** é seguido diretamente pelo **dia 15 de outubro de 1752**.
- Exibe mensagens de erro conforme padrão de exceções especificado.

## 🚫 Padrões de Exceção

O programa lança exceções `NumberFormatException` com mensagens descritivas para entradas inválidas:

```java
throw new NumberFormatException("getCalendario: " + ano + ": ano inválido.");
throw new NumberFormatException("getCalendario: " + mes + ": mês inválido.");
throw new NumberFormatException("getCalendario: " + mes + ": entrada inválida.");
```

## 🧪 Exemplos de Uso

```java
getCalendario();                 // Mês atual do ano atual
getCalendario("2025");           // Todos os meses de 2025
getCalendario("3", "2025");      // Mês de março de 2025
getCalendario("13", "2025");     // Exceção: 13 mês inválido
getCalendario("2022a");          // Exceção: 2022a entrada inválida
```