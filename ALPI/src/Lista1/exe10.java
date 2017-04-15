package Lista1;

import java.util.Scanner;

public class exe10 {
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
                System.out.println("\n\t\tADIÇÃO\n");
                System.out.print("Digite o 1ºnumero: ");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o 2ºnumero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 + n2;
                System.out.printf("\n\t\t%d + %d = %d\n",n1,n2,r);

                break;
            case 2:
                System.out.println("\n\t\tSUBTRAÇÃO\n");
                System.out.print("Digite o 1ºnumero: ");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o 2ºnumero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 - n2;
                System.out.printf("\n\t\t%d - %d = %d\n",n1,n2,r);
                break;
            case 3:
                System.out.println("\n\t\tDIVISÃO\n");
                System.out.print("Digite o 1ºnumero: ");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o 2ºnumero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 / n2;
                System.out.printf("\n\t\t%d / %d = %d\n",n1,n2,r);
                break;
            case 4:
                System.out.println("\n\t\tMULTIPLICAÇÃO");
                System.out.print("Digite o 1ºnumero: ");
                n1 = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite o 2ºnumero: ");
                n2 = Integer.parseInt(leitor.nextLine());
                r = n1 * n2;
                System.out.printf("\n\t\t%d * %d = %d\n",n1,n2,r);
                break;
                default:
                    System.out.println("Opçao Invalida");
                    break;
                    
         
                
        }
    }
        
}