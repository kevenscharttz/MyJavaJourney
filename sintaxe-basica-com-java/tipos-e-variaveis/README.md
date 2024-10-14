# Tipos e Variáveis 🫴

No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

## Tipos de dados 🎲

> Os oito tipos primitivos em Java são:
int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

| Tipo | Memória | Valor Mínimo | Valor Máximo |
| -------- | ----- | ----------- | ----------- | 
| byte | 1 byte | -128 | 127 |
| short | 2 byte | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

| Tipo | Memória | Mínimo | Máximo | Precisão |
| -------- | ----- | ----------- | ----------- | ----------- |
| float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |

Apesar de o tipo float ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos short e byte, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes utilizaremos o tipo int para representar números inteiros ou double para representar números fracionados.

>*O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?*

## Declaração de Variáveis 🧭

Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

Exemplos abaixo:

```java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```

Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

```java
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
```

> Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação. Java é fortemente "tipado"

Veja o cenário abaixo:

```java
// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```
No cenário acima, apesar de parecer que o que foi feito está correto, não está. Isso ocorre porque, ao atribuir o valor da variável do tipo `int` chamada numeroNormal à variável numeroCurto2 do tipo short, ocorre um erro. A variável numeroCurto2, sendo do tipo `short`, não pode receber um valor int diretamente, pois o tipo `int` pode conter valores maiores do que o limite permitido para o tipo `short`.

## Variaveis Constantes 🚧

Uma variavel constante é aquela que seu valor não pode ser alterado. Em Java, esses valores sçao representados pela palavra chave `final`, seguida do tipo.
Por **convenção**, variveis constantes sempre são escritas em caixa alta, ou seja, maiúsculas.

```java
public class ExemploVariavel {
	public static void main(String[] args) {
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação! Não é possível alterar um valor constante
	}
}
```