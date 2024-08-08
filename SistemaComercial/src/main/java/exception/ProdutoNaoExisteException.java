package exception;

public class ProdutoNaoExisteException extends Exception{
    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
