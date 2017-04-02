package ADOII;

import java.util.Scanner;

public class MediaComFreq {
    /*Melhore o exercício anterior de forma que ele também tenha a frequência do aluno como entrada.
    O aluno só passa se sua frequência for maior ou igual a 75%*/
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double p1,p2,m,p3,f ;
        System.out.print("Nota da P1: ");
        p1 = Double.parseDouble(leitor.nextLine());
        System.out.print("Nota da P2: ");
        p2 = Double.parseDouble(leitor.nextLine());
        m = (p1 + p2) / 2;
        System.out.print("Frenquencia: ");
        f = Double.parseDouble(leitor.nextLine());
        if (f >= 75){
            if (m >= 6 ){
                System.out.printf("Média:%.1f\nVocê foi Aprovado!\n",m);
            }else{
                System.out.print("Nota da P3: ");
                p3 = Double.parseDouble(leitor.nextLine());
                if (p1 < p2){
                p1 = p3;
                }else{
                p2 = p3;
                }
                m = (p1 + p2) / 2;
                if (m >= 6 && f >= 75){
                System.out.printf("O Aluno foi Aprovado com Média %.1f\n ",m);
                }else
                System.out.println("Aluno Reprovado");
                }
        }else{
            System.out.println("Reprovado por Falta!");
        }
    }
}

