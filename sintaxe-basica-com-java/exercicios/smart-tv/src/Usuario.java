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

        System.out.println("\nEstado atual: ");
        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("\nEstado atual: ");

        smartTv.desligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}.
