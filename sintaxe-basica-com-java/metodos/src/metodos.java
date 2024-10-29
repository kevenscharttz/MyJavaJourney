public class metodos {
    
    //método publico, que retornará um valor double, sua função é somar usando dois numeros
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
            return ...;
    }

    //método publico, que não retornará nada, com a função de imprimir algo, usando uma String. Como não retorna nada, não precisa de return
    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
    }

    //método publico, que retorna um tipo double, com a função de dividir utilizando dois valores, porém, como é possivel dividir um numero por zero, o que não pode acontecer, é lançado uma excessão, isso graças ao throws Exeception
    public double dividir(int dividendo, int divisor) throws Exception{}


    //método privado, ou seja, não pode ser visto por outras classes no projeto, tipo void, então não retornará nada
    private void metodoPrivado(){

    }

    //apesar do método estar correto, por lógica, uma validação serve para retornar algo, ou seja, deveria ser um método tipo boolean, com retorno de true ou false
    public void validar(){

    }
}
