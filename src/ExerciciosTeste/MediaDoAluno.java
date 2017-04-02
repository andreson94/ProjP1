package ExerciciosTeste;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double p1,p2,m,p3 = 0;
        System.out.print("Nota da P1: ");
        p1 = Double.parseDouble(leitor.nextLine());
        System.out.print("Nota da P2: ");
        p2 = Double.parseDouble(leitor.nextLine());
        m = (p1 + p2) / 2; 
        if (m >= 6){
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
        if (m >= 6){
            System.out.printf("O Aluno foi Aprovado com Média %.1f ",m);
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
    }
}


