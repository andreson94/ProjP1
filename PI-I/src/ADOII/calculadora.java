package ADOII;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("\n\t\t***Calculadora***\n");
        Scanner leitor = new Scanner (System.in);
        int opcao,n1,n2,r;
        System.out.print("\n\t\t1 - para ADIÇÃO"
                + "\n\t\t2 - para SUBTRAÇÃO"
                + "\n\t\t3 - para DIVISÃO"
                + "\n\t\t4 - para MULTIPLICAÇÃO\n"
                + "\nEscolha a Opção: ");
        opcao = Integer.parseInt(leitor.nextLine());
       
            
        switch (opcao){
            case 1:
                System.out.println("\n\t\tADIÇÃO");
                System.out.print("Digite o Primeiro numero:");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o Segundo numero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 + n2;
                System.out.println("Resultado: " + r);
                break;
            case 2:
                System.out.println("\n\t\tSUBTRAÇÃO");
                System.out.print("Digite o Primeiro numero:");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o Segundo numero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 - n2;
                System.out.println("Resultado: " + r);
                break;
            case 3:
                System.out.println("\n\t\tDIVISÃO");
                System.out.print("Digite o Primeiro numero:");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o Segundo numero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 / n2;
                System.out.println("Resultado: " + r);
                break;
            case 4:
                System.out.println("\n\t\tMULTIPLICAÇÃO");
                System.out.print("Digite o Primeiro numero:");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o Segundo numero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 * n2;
                System.out.println("Resultado: " + r);
                break;
                default:
                    System.out.println("Opçao Invalida");
                    break;
                    
            
            }
    }
        
}

