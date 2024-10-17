# Operadores 🧮

Geralmente as primeiras palavras que ouvimos em um curso de programação são: um programa é um conjunto de instruções lógicas que, quando executadas, produzem algum resultado. Com isso em mente, ao começar a criar a primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma lógica para processá-los e então apresentar o resultado desse processo.

## Atribuição 🟰

O processador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variavel. Em Java definimos um tipo, nome e opcionalmente atribuimos um valor à varivel atravez do operador de atribuição. Exemplos abaixo:

```java
String nome = "KEVEN";
int idade = 20;
double altura = 1.72;
boolean estaVivo = true;
Date dataNascimento = new Date();
```

## Aritméticos ➕➖

O perador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: + (adição), -(subtração), *(multiplicação), /(divisão).

```java
double soma = 10.5 + 15.7;
int subtracao = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20 / 4);
```

## Operadores Unários

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

* **(+) Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;
* **(-) Operador unário de valor negativo** – nega um número ou expressão aritmética;
* **(++) Operador unário de incremento de valor** – incrementa o valor em 1 unidade;
* **(--) Operador unário de decremento de valor** – decrementa o valor em 1 unidade;
* **(!) Operador unário lógico de negação** – nega o valor de uma expressão booleana;

```java
int numero = 5;
boolean verdadeiro = true;

System.out.println(-numero);

numero++;

System.out.println(numero);

System.out.println(++numero);
```