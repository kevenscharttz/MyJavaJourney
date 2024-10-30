public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        if (smartTv.ligada) {
            System.out.println("Estado da Tv: Ligada");
        }
        else {
            System.out.println("Estado da Tv: Desligada");
        }
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.escolherCanal(32);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("\nNovo estado da Tv\n");
        
        if (smartTv.ligada) {
            System.out.println("Estado da Tv: Ligada");
        }
        else {
            System.out.println("Estado da Tv: Desligada");
        }
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
