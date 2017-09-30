package Exercicios;



 public class Contador {

    
    private int valor;
    
    public Contador() {
        valor = 0 ;
    }

    public  int  getValor () {
        return valor;
    }
    public  void  zerar () {
        valor = 0 ;
    }
    public  void  incrementar () {
        valor ++ ;
    }
}