package execicios;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
    /*Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço while.*/
    int i = 0;

    while ( i < 100){
        i = i + 2;
        
        if ( i >= 2){
            
            System.out.println(" Numero par: " + i );
        }else{
            System.out.println("numero impar: " + i );
        }
        
   
    }
    
    }
}
