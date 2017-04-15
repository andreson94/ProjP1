package Lista1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class exe6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n\t\t***CALENDÁRIO SEMANAL***\n");
        int dia;
        System.out.print("Digite o dia Desejado: ");
        dia =Integer.parseInt(leitor.nextLine());
        
            switch (dia) {
                case 1:
                    System.out.println("Domingo, Fim de Semana");
                    break;
                case 2:
                    System.out.println("Segunda - Feira");
                    break;
                case 3:
                    System.out.println("Terça- Feira");
                    break;
                case 4:
                    System.out.println("Quarta - Feira");
                    break;
                case 5:
                    System.out.println("Quinta - Feira");
                    break;
                case 6:
                    System.out.println("Sexta - Feira");
                    break;
                case 7:
                    System.out.println("Sabado, Fim de Semana");
                    break;
                default:
                    System.out.println("Dia Invalido"); 
                    break;
            }
    }
}    
