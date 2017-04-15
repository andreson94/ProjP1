package Lista1;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num,r;
        System.out.print("Digite um numero: ");
        num = Integer.parseInt(leitor.nextLine());
        r = num % 3;
        
        switch (r){
            case 0:
               
                System.out.println("Numero é divisivel por 3");
                break;
            default:
                
                System.out.println("Numero não é divisivel");
                break;
        }
    }
}

