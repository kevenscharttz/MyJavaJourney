public class TiposVariaveis {
    public static void main(String[] args) {

        int anoFabricacao = 2021;
        double salarioMinimo = 2.500; // não é 2500.

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, e valores do tipo long devem terminar com 'L' ou 'l'
		float pi = 3.14F; //float deve terminar com 'F' ou 'f'
		double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; // está errado pois short não pode receber int.


    }
}