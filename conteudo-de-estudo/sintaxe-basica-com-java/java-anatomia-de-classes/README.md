# Aprendendo Sintaxe Java ☕
A escrita de códigos de um programa é feita através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome dos nossos atquivos, classes, atributos e métodos.

é muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que reconhecem e recomendam que toda a implementação do seu programa seja escrita na linguagem inglesa.

## Sintaxe de Declaração de uma nova Classe 📃

``` 
Public class MinhaClase{
  //seu código aqui
}
```

Se a classe é executavel, ou seja, com capacidade de iniciar um projeto, usamos um método especifico:
```
Public static void main (String [] args){

}
```

Para teste, podemos criar uma classe system dentro dessa classe main, cuja a função é imprimir alguma coisa:

```
System.out.print("Hello World");
```

## Padrões de Nomeclaturas ✍️
Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de nomenclatura. Esses padrões estão expressos nos tópicos abaixo:

* **Arquivo .java:** Todo arquivo *.java* deve começar com a letra **MAIÚSCULA**, se houver mais palavras, elas também deverão começar com a letra maiúscula:

```
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica{

}
```

**Nome de variáveis:** Toda variável deve ser escrita com letra **MINÚSCULA**, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser **MAIÚSCULA**, o nome desse tipo de prática para nomear variáveis dessa forma se chama "camelCase"

Existe uma regra adicional para variáveis quando queremos identificar que ela não 
sofrerá alteração de valor, por exemplo, queremos determinar que uma variável de nome 'br'
sempre representará "Brasil" e nunca mudará seu valor, logo, determinasse como abaixo

```
public class NomeclaturasJava {
    
    public static void main(String[] args) {
        String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;
    }
```

## Boas Práticas para Nomear Variáveis 💎

* Conter apenas letras, números, _(underline) e $(sifrão);
* Começar com letras(preferencialmente), ou _ / $, jamais com números;
* Não conter espaços;
* Sem palavras chave/reservadas;
* Nome único no escopo.

```
public class NomeclaturasJava {
    
    public static void main(String[] args) {
        
        //declarações inválidas

        int numero&um = 1; // Usar apenas _ e $
        int 1numero = 1; // Não começar com número
        int numero um = 1; // Não conter espaços
        int long = 1; // Não usar palavras chave/reservadas

        //declarações válidas

        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
    }
```
## Declaração de Variaveis e métodos 🛠️

Como identificar o que é o que entre declarações de variáveis e métodos em nosso programa? Existe uma estrutura comum para ambas as finalidades. Vamos explorar cada uma:

* Declarar uma variavel em Java segue sempre a seguinte estrutura:

```
//estrutura

    tipo nomeBemDefinido = atribuição (opcional em alguns casos)

//exemplo

    int idade = 23;
    double altura = 1.80;
    String nome = "Keven";

    dog spike; //observe que aqui a variavel não tem valor, por que? (exercicio mental)
```

* Declaração de métodos em Java segue uma estrutura bem simples:

```
//estrutura

    tipoRetorno nomeObjetivoNoInfinitivo parametro(s)

//exemplo

    int somar(int numeroUm, int numeroDois)
    String formatarCep(long cep)
```
## Identação ⛓️
Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

Abaixo, veja um exemplo de um algoritmo de validação de aprovação de uma estudante. Em uma aba, temos um código sem identação nenhuma, na outra aba, temos o mesmo código seguindo um padrão de identação. Observe como é muito mais fácil entender a hierarquia do código na segunda aba:

* Não identado

```java
//aquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6){
System.out.println("REPROVADO");    
}
else if(mediaFinal==6){
System.out.println("PROVA MINERVA");
}
else{
System.out.println("APROVADO"); 
}
}
}
```
* Identado

```java
//aquivo BoletimEstudantil.java | IDENTADO

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal<6){
            System.out.println("REPROVADO");    
        }
        else if(mediaFinal==6){
            System.out.println("PROVA MINERVA");
        }
        else{
            System.out.println("APROVADO"); 
        }
    }
}
```
## Java Beans 🫘

Uma das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.


### Variaveis

Mais cedo já aprendemos algumas regras de declaração de variaveis, mas agora iremos conhecer algumas sugestões de nomeclatura:

* Uma variável deve ser clara, sem abreviações ou definição sem sentido;
* Uma variável é sempre no singular, **exceto quando de referir a um array ou coleção**;
* Defina um idioma único para suas variáveis. Se você declarar variáveis em inglês, defina todas em inglês.

Não recomendado

```Java
double salMedio = 1500.23; // variável abreviada
String emails = "aluno@escola.com"; // confuso, a variável está no plural mas remete a apenas um valor
String myName = "ANDREW"; //se o idioma é pt-BR, o valor deve ser também.

```

recomendado
```java
double salarioMedio = 1500.23;
String [] emails = {aluno@escola.com, "professor@escola.com"};
String meuNome = "ANDRÉ";
```

### Métodos

Os métodos deverão se nomeador como verbos, através de um mistura de letras minúscular e maiúsculas. Em preincípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

Exemplos sugeridos para nomeclatura de métodos:

```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento(){}

findById(int id){}

calcularImprimir(){} //Preste atenção, apesar dele estar escrito corretamente, qual a função desse método? Calcular ou imprimir? Pois é.
```

