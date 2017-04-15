package execicios;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        /*Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for.*/
        Scanner as = new Scanner(System.in);
        int numero;
        
        System.out.println("digite um numero: ");
        numero = as.nextInt();
        
        for (int i = 1; i <= numero; i = i+2 ){
            System.out.println("numerros impares: " + i );
            
            }
        }
    }
    

