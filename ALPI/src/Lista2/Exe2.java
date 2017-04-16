package Lista2;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        /*Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE*/
        Scanner leitor = new Scanner(System.in);
        int n,i = 0,soma = 0;
        System.out.print("Digite um numero: ");
        n = leitor.nextInt();
        while (i < n){
            i = i+1;
            soma = soma+i;
        }
        System.out.println("Soma = "+soma);
    }
}
