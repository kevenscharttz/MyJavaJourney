package exercicios;

public class Exercicio {
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        String concatenacao = "?";

        System.out.println(nomeCompleto);
        //o resultado será "LINGUAGEMJAVA".

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        //31, pois enquanto houver uma sequência numérica, o compilador irá somar normalmente até chegar no texto, porque depois ocorre o processo de concatenação.

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        //1111, pois ao chegar no texto, ocorre o processo de concatenação, então o conteúdo passa a ser considerado texto, então ele não consegue mais realizar operações aritméticas.

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        //1111, mesma coisa, ao chegar no texto ocorre concatenação, então não é possivel realizar as operações aritméticas.

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        //1111, mesmo motivo

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        //13, pois nesse caso a soma dos três 1, pois estão em evidência, e posteriormente ocorre a concatenação com o caractere.
    }
}
