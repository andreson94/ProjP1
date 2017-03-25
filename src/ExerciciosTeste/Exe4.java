package ExerciciosTeste;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double consumo, v1 = 0.20d, v2 = 0.25d ,v3 = 0.30d,m = 11.90d ;
        System.out.print("Consumo: ");
        consumo = leitor.nextDouble();
        if (consumo < 150d){
            System.out.println("Valor: " + consumo * v1);
        }else if (consumo >= 150d && consumo < 500d){
            System.out.println("Valor: " + consumo * v2);
        }else if (consumo >= 500d){
            System.out.println("Valor: " + consumo * v3);
        }else{
            System.out.println("Conta Minima: " + m );
        }
    }
}    

