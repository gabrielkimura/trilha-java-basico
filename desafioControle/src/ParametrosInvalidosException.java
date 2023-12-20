public class ParametrosInvalidosException extends RuntimeException{
    public ParametrosInvalidosException(String msg){
        super(msg);
    }

       public ParametrosInvalidosException(){
        super("Parâmetro inválido");
    }
}
