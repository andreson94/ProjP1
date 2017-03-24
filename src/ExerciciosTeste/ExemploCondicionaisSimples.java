package ExerciciosTeste;

import java.util.Scanner;

public class ExemploCondicionaisSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int n1, n2, n3;
        System.out.print("Digite n1: ");
        n1 = leitor.nextInt();
        System.out.print("Digite n2: ");
        n2 = leitor.nextInt();
        System.out.print("Digite n3: ");
        n3 = leitor.nextInt();
        if ((n1 > n2)&&(n1 > n3)){
            System.out.printf("O numero %d é o Maior",n1);
        }
        else if ((n2 > n3)&&(n2 > n1)){
            System.out.printf("O numero %d é o Maior",n1);
        }else{
            System.out.printf("O numero %d é o Maior \n ",n3);
        }
    }
}

        

