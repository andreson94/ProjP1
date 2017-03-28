package ExerciciosTeste;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int n1,r;
        System.out.println("Digite o numero: ");
        n1 = leitor.nextInt();
        if (n1 > 100){
            r = n1 + 150;
            System.out.printf("Resultado: %d \n ",r);
        }
    }
}
