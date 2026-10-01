# Estruturas de Controle - Exercícios em Java

Este repositório contém uma série de exercícios práticos em Java focados no aprendizado e aplicação de **Estruturas de Controle** (condicionais e laços de repetição).

## 🚀 Exercícios Resolvidos

O código fonte de todos os exercícios está localizado na pasta `src/`. Abaixo está a descrição de cada um deles:

### 1️⃣ Exercício 1: Tabuada (`exercicio1.java`)
**Objetivo:** Criar um gerador de tabuada.
- O programa solicita ao usuário que digite um número inteiro.
- Utilizando um laço de repetição (`for`), o programa calcula e exibe a tabuada de 1 a 10 do número informado.

### 2️⃣ Exercício 2: Calculadora de IMC (`exercicio2.java`)
**Objetivo:** Calcular o Índice de Massa Corporal (IMC).
- O programa pede ao usuário seu peso (em kg) e sua altura (em metros).
- Realiza o cálculo matemático do IMC.
- Utiliza estruturas condicionais (`if`, `else if`, `else`) para classificar e exibir o resultado (Abaixo do peso, Peso ideal, Sobrepeso, Obesidades).

### 3️⃣ Exercício 3: Pares ou Ímpares em um Intervalo (`exercicio3.java`)
**Objetivo:** Listar números pares ou ímpares dentro de um intervalo definido pelo usuário.
- Solicita um número inicial e um número final.
- Valida com um `while` se o número final é realmente maior que o inicial, repetindo a pergunta caso seja menor.
- Pergunta ao usuário se ele deseja ver os números "Ímpares" ou "Pares".
- Usa a estrutura `switch case` e o operador ternário para ajustar o ponto de partida e o laço `for` para imprimir os números com um passo de 2.

### 4️⃣ Exercício 4: Validação Lógica com Laços (`exercicio4.java`)
**Objetivo:** Praticar a validação de entrada de dados contínua.
- O programa pede um primeiro número.
- Pede um segundo número e verifica com um `while` se ele é maior que o primeiro, garantindo a integridade dos dados inseridos.
- Contém também um laço de repetição extra para validação com o operador de módulo (`%`), garantindo que o programa continue perguntando até o usuário inserir um valor válido.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE Recomendada:** IntelliJ IDEA / Eclipse / VS Code
- **Conceitos abordados:** `Scanner`, `if/else`, `switch/case`, `for`, `while`, operadores matemáticos e lógicos.

## 💻 Como executar os projetos

1. Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/GustavoMaiaAmorim/Estruturas_de_controle.git
   ```
3. Abra o projeto na sua IDE favorita.
4. Navegue até a pasta `src/`.
5. Execute a classe `main` do exercício desejado.
