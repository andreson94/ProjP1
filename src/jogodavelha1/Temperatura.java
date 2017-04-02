package jogodavelha1;

import java.util.Scanner;

public class Temperatura {
    

    public static void main(String[] args) {
      //Entrada
        Scanner leitor = new Scanner (System.in);

        System.out.println("Entre com temp");
        double x = leitor.nextDouble();
        System.out.println("Entre com seu nome");
        String nome = leitor.next();
        
        System.out.println("Meu nome é " + nome);
        
        double f = 20;
        double c = (5.0 / 9.0)*(f - 32);  
    //Processamento

        f = leitor.nextDouble();
        c = leitor.nextDouble();
        
    //Saida
        System.out.println (f + "°F =" + c + "°C");
        System.out.println(f + " " + c );
            
    }

}
