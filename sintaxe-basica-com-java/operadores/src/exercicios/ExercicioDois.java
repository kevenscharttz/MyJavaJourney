package exercicios;

public class ExercicioDois {
    public static void main(String[] args){
        int numero = 5;
        boolean verdadeiro = true;

        System.out.println(-numero);
        // -5, pois o operador - apenas nega o número na impressão, mas não altera a variável. Para torná-lo verdadeiramente negativo, seria necessário fazer "numero = -numero;"

        numero++;
        //6, pois o valor acima foi apenas imprimido como negativo, seu valor não foi alterado. Aqui o valor foi incrementado.

        System.out.println(numero);
        //6, pois apenas foi impresso o valor normalmente.

        System.out.println(numero++);
        //7, pois houve o incremento do valor pelo operador ++;

        System.out.println(numero);
        //7, o número não foi alterado após o incremento anterior

        System.out.println(++numero);
        //8, pois o número sofreu outro incremento.

        System.out.println("Inverteu " + !verdadeiro);
        //Inverteu false, pois o valor true da variavel foi negada pelo !
    }
}
