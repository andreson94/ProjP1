package Lista2;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        /*Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as
divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
*/
        Scanner console  = new Scanner(System.in);
        
        double soma = 1,n = 0,numero;
        System.out.print("Numero: ");
        
        numero = console.nextInt();
         
        for (int i= 0; i <= numero;i= i++){
            
            i = i+1;
            
                n = n+ (1/i);
                soma = soma + n;
            }
             System.out.println(n);

         
        System.out.println("A soma das frações é = " + soma);
    }
  }
