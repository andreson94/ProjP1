package pi.i;

import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner ( System.in);
        //Entrada
        
        System.out.print("x1: ");
        float x1 = Float.parseFloat(leitor.nextLine());
        System.out.print("x2: "); 
        float x2 = Float.parseFloat(leitor.nextLine());
        System.out.print("c: ");
        float c = Float.parseFloat(leitor.nextLine());
        
        //Processamento
        float s = x1+ x2;
        float p = x1 * x2;
        float a = c / p;
        float b = -(a * s);
        
        //SAÍDAS
        
        System.out.println( a + "x² + " + b + " x" + c + " = 0");
    }
}
