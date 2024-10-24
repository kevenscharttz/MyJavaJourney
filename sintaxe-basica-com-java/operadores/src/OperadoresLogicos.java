public class OperadoresLogicos {
    public static void main (String[] args){
        boolean condicao1 = true;

        boolean condicao2 = false;


        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        else {
            System.out.println("Ao menos uma das condições não é verdadeira");
        }

        if(condicao1 || condicao2){
            System.out.println("Ao menos uma condição é verdadeira");
        }
        else {
            System.out.println("Nenhuma condição é verdadeira");
        }
    }
}
