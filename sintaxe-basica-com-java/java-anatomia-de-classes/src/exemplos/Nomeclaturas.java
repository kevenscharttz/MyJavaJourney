package exemplos;
public class Nomeclaturas {
    
    public static void main(String[] args) {
        
        int anoAtual = 2024; //variavel que pode ser alterada
        
        final String BR = "Brasil"; //variavel que não pode ser alterada


        //declarações inválidas

        //int numero&um = 1; // Usar apenas _ e $
        //int 1numero = 1; // Não começar com número
        //int numero um = 1; // Não conter espaços
        //int long = 1; // Não usar palavras chave/reservadas

        //declarações válidas

        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
    }

}
