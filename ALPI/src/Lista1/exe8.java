package Lista1;

import java.util.Scanner;

/*Criar um programa para calcular o valor da multa a ser paga de anuidade de uma associação.
A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros 
(com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro, custa R$ 100;
em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro, R$171,03*/
public class exe8 {
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        double anuidade,multa = 0,juros,juros2,r;
        int mes; 
        System.out.println("digite o mes:");
        mes= Integer.parseInt(leitor.nextLine());
        System.out.print("Digite o Valor da anuidade:");
        anuidade = Double.parseDouble(leitor.nextLine());
        juros =(anuidade * 5)/100; 
        juros2 = ((anuidade + juros)*5)/100;
        switch (mes){
            case 1:
                multa = anuidade; 
                System.out.printf("Janeiro\nAnuidade: R$%f\nValor da Multa: R$ %f\n",anuidade,multa);
            case 2:
                multa = anuidade + juros;
                System.out.printf("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n",anuidade,multa);
            case 3:
                multa = anuidade + juros + juros2;
                System.out.printf("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n",anuidade,multa);
            case 4:
                r = multa + anuidade + juros + juros2; 
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 5:
                multa = (((anuidade + juros + juros2)*5)/100)*5/100; 
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 6:
                multa = anuidade + juros + juros2;
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 7:
                multa = anuidade; 
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 8:
                multa = anuidade + juros;
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 9:
                multa = anuidade + juros + juros2;
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 10:
                multa = anuidade; 
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 11:
                multa = anuidade + juros;
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");
            case 12:
                multa = anuidade + juros + juros2;
                System.out.print("Janeiro\nAnuidade: R$%.2f\nValor da Multa: R$%.2f\n");        
        }
    }
}
