public class OperadoresRelacionais {
    public static void main(String[] args) {
    
        String nomeUm = "Keven"; 
        String nomeDois = new String("Keven");
        //caso apenas houvesse o nome, ao inves desse "new String", que é um objeto, o método abaixo serviria para verificar a igualdade dos elementos, mas como não é o caso, devemos usar outro método de verificação.
        
        //System.out.println(nomeUm == nomeDois);
        
        System.out.println(nomeUm.equals(nomeDois));
        //Esse método vai realizar uma comparação para a verificação de igualdade dos objetos.
    
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("O primeiro valor é menor que o segundo valor");
        }

        System.out.println("Os numeros são iguais: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Os numeros são iguais: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("O primeiro valor é maior que o segundo: " + simNao);
    }
}
