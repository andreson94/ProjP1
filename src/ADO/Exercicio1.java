package ADO;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
      //1. Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números
        Scanner leitor = new Scanner(System.in);
        float number1, number2, r;
        System.out.println("Multiplicação");
        System.out.print("numero 1: ");
        number1 = leitor.nextFloat();
        System.out.print("numero 2: ");
        number2 = leitor.nextFloat();
        r = (number1)*(number2);
        System.out.println("Resultado: " + r );
                
    }
    
}
