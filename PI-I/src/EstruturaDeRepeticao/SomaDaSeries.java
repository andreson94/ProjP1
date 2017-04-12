package EstruturaDeRepeticao;
public class SomaDaSeries {
    public static void main(String[] args) {
        /*Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte série:
        soma = 1 + 3 + 5 + 7 + 9 + ...*/
        int n = 1,soma=0;
       
        for(int i = 1; i <= 10000; i++){
           soma = soma + n;
           n = n+2;
        }
            System.out.println("a Soma da Serie é = " + soma);

    }
   
}
