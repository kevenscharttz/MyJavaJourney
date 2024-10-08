package exemplos;
public class DeclaracaoVariaveisMetodos {
    public static void main(String[] args) {

        String meuNome = "Keven";
        int anoFabricacao = 2024;
        //tipo, nome bem definido = valor correspondente com a tipagem especifica.

        boolean chovendo = true;
        //É possivel usar valores lógicos também, como um "boolean", definindo que a variavel chovendo é verdadeira
        //ou seja, está chovendo. Caso eu coloque "false", irei definir que o status chovendo não está acontecendo.


        anoFabricacao = 1999;
        //É possivel também a manipulação de uma variavel, mudando a variavel anoFabricacao de 2024, para 1999.


        String primeiroNome = "Keven Willians";
        String segundoNome = "Scharttz de Melo";
        //declaração das variaveis

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        //declaração que a variavel nomeCompleto recebe o método com mesmo nome nomeCompleto

        System.out.println(nomeCompleto);
        //Realização da leitura da variavel nomeCompleto.
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
    //Esse método faz retorno de uma String, seu nome é nomeCompleto e usa os parametros também String primeiroNome e segundoNome,
    //de forma concatenada com o ".concat(" ")" e o ".concat(segundoNome);". E o texto "Resultado do método: " utiliza outro tipo de concatenação
    //utilizando +;
}
