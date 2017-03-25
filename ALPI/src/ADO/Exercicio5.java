package ADO;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       //Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
        Scanner leitor = new Scanner (System.in);
        int l;
        double a;
        System.out.print("Digite o valor de L: ");
        l = leitor.nextInt();
        a = Math.pow(l, 2);
        System.out.println("Área do Quadrado: " + a + "m²");
        
    }
}
