package ADOII;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a,b,c,d = 0,x1,x2;
            System.out.print("informe o valor do coeficiente A: ");
            a = Double.parseDouble(leitor.nextLine());
            System.out.print("informe o valor do coeficiente B: ");
            b = Double.parseDouble(leitor.nextLine());
            System.out.print("informe o valor do coeficiente C: ");
            c = Double.parseDouble(leitor.nextLine());
 
        if (a > 0){
            d = Math.pow(b,2)-(-4*a*c);
        }else{
            System.out.println("coeficiente A inválido");
        } if (d > 0){
                
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.printf("X¹: %.0f,X²:%.0f\n ",x1,x2);
        }else{
            System.out.println("delta é negativo");
       }
    }
}   
