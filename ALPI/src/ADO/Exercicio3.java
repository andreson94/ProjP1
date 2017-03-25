package ADO;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    /*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
    quadrado de um número A é representado por A2 = A * A.
    */
        Scanner leitor = new Scanner(System.in);
        float a, b, r;
        System.out.print("Numero1: ");
        a = leitor.nextFloat();
        System.out.print("numero2: ");
        b = leitor.nextFloat();
        a = a * a;
        b = b * b;
        r = a + b; 
        System.out.println("resultado: " + r);
        
        
    }
}
