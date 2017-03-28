package ADOI;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        //C = \frac{5}{9} \cdot (F - 32)
        Scanner leitor = new Scanner (System.in);
        float tf ,tc;
        System.out.print("Graus°F: ");
        tf = leitor.nextFloat();
        tc = 5/9f *(tf - 32f);
        System.out.println("Temperatura: " + tc + "°C");
        
    }
    
}
