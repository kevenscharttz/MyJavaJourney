public class VariaveisConstantes {
    public static void main(String[] args) {
        
        final int VALOR_DE_PI = 20;
        VALOR_DE_PI = 40; //dá erro, pois o VALOR_DE_PI está determinado para não ser alterado.
        System.out.println(VALOR_DE_PI);
    }
}
