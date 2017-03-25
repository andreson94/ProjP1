package ExerciciosTeste;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, r;
        System.out.print("Digite n1: ");
        n1 = leitor.nextInt();
        System.out.print("Digite n2: ");
        n2 = leitor.nextInt();
        r = n1 % n2;
         if (r == 0){    
        System.out.println("A divisão é Exato");
        }else{
             System.out.println("Não exato");   
         }
    }
}
