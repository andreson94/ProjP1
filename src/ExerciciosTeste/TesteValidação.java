package ExerciciosTeste;

import java.util.Scanner;

public class TesteValidação {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int num;
        System.out.print("Digite o numero entre 1 e 12:");
        num = leitor.nextInt();
        if (num >= 1 && num <= 12){
          System.out.printf("resultado:%d\n",num * 2);
      }else{
          System.out.println("Número invalido!");
      }
    }
}
