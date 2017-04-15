package Lista1;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\t\t*** TABELA DE PAGAMENTO PLANO DE SAÚDE ***\n");
        int idade,r,valor = 100,opcao;
        System.out.println("");
         System.out.print("\n\t\t1 - Crianças Menores de 10 anos "
                + "\n\t\t2 - Conveniados com idade entre 10 e 30 anos "
                + "\n\t\t3 - Conveniados com idade entre 40 e 60 anos"
                + "\n\t\t4 - Conveniados com mais de 60 anos\n"
                + "\nEscolha a Opção: ");
        opcao = Integer.parseInt(leitor.nextLine());
                System.out.print("Digite a idade: ");
        idade = Integer.parseInt(leitor.nextLine());

        switch (opcao) {
            case 1:
                if (opcao == 1 && idade < 10){    
                    r = valor + 80;
                    System.out.printf("Idade: %d\nValor do Plano: R$%d\n", idade, r);
            }else{
                System.out.println("Idade Invalida ");
            }
            break;
            case 2:
                if (opcao == 2 && idade >= 10 && idade <= 30){
                    r = valor + 50;
                    System.out.printf("Idade: %d\nValor do Plano: R$%d\n", idade, r);
                }else{
                    System.out.println("Idade Invalida ");
                }
                    break;
            case 3:
                if (opcao == 3 && idade >= 40 && idade <= 60){
                    r = valor + 95;
                    System.out.printf("Idade: %d\nValor do Plano: R$%d\n", idade, r);
                }else{    
                    System.out.println("Idade Invalida ");
                }    
                    break;
            default:
                if (opcao != 1 || opcao != 2 || opcao != 3 && idade > 60){                
                    r = valor + 130;
                    System.out.printf("Idade: %d\nValor do Plano: R$%d\n", idade, r);
                }else{
                    System.out.println("Idade Invalida ");

                }
            break;
        }
    }
}


