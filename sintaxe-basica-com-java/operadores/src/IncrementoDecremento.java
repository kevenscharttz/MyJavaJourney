public class IncrementoDecremento {
    public static void main(String[] args){
        boolean variavel = true;
        int numero = 5;
        
        //numero = numero + 1;

        numero++;
        //da mesma forma que a opção acima que foi comentada, com o operador unario de incremento "++", ocorre a mesma coisa.

        System.out.println(numero++);
        //O resultado aqui será 6, pois, seguindo a lógica do sistema, ele primeiro irá imprimir o valor, que será 6, e depois ele irá ser incrementado. Para incrementá-lo primeiro, o certo seria "System.out.println(++numero);""
        System.out.println(numero);


        System.out.println(numero--);
        //Seguindo a mesma lógica, o numero não será alterado, após ser impresso ele sofrerá um decremento.

        System.out.println(numero);
        //Agora sim o numero que sofreu decremento será impresso.


        System.out.println(!variavel);
        //O valor anteriormente atribuido como true, vai ser impresso como "false", mas, se tratando de uma variavel de memória, ele apenas será impresso como falso, ele continuará sendo verdadeiro. Para mudar isso, seria necessário usar com antecedencia "variavel = !varivel", graças ao operador de inversão.
    }
}
