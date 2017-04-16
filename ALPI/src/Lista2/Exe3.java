package Lista2;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        /*Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve
determinar e imprimir o maior deles. Use o laço FOR*/
        Scanner leitor = new Scanner (System.in);
        int n,maior = 0;
        for (int i=0;i < 10;i++){
            System.out.print("Digite um numero: ");
            n = leitor.nextInt();
                       i = i++;

            if (n>=0){
                maior = n;

              if(n > maior){
                    maior =n ;
                }else{
                    maior = maior;
                }
            }else{
                System.out.println("Numero invalido");
            break;
            }
        }
        System.out.println("maior numero inteiro digitado: " + maior);

    }
}
