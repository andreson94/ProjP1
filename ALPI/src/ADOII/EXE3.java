package ADOII;

import java.util.Scanner;

public class EXE3 {
    public static void main(String[] args) {
        /*Crie um programa para informar quais e quantas notas são necessárias para entregar 
o mínimo de cédulas para um determinado valor informado pelo usuário, Considere notas de
R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar apenas as notas utilizadas.*/
        Scanner leitor = new Scanner (System.in);
        int n1 = valor / 1,n5 = valor - 5, n10 = valor - 10,n50 = valor - 50,n100 = valor - 100, valor,r,notas;
        System.out.print("Digite o Valor: ");
        valor = Integer.parseInt(leitor.nextLine());
        
        switch (valor){
            case 1:
                notas = valor / n1;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d",notas,n1);
                break;
            case 2:
                notas = valor / n1;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d",notas,n1);
                break;
            case 3:
                notas = valor / n1;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d",notas,n1);
                break;
            case 4:
                notas = valor / n1;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d",notas,n1);
            case 5:
                notas = valor / n5;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d",notas,n5);
            case 6:
                notas = (valor / n5) + n1;
                System.out.printf("notas utilizadas:\n%d nota(s) de R$ %d\n%d nota(s) de R$ %d",notas,n1,n1,n5);
            
        }
    
    }
   
}
