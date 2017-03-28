package ADOI;

import java.util.Scanner;

    public class ContaTelefonica {
        public static void main(String[] args) {
             /*Uma conta telefônica é composta pelos seguintes itens:
            Assinatura: R$ 23,32
            Ligações Locais: R$ 0,09 / min
            Ligações Interurbanas (DDD): R$ 0,26 / min
            Ligações Internacionais (DDI): R$ 0,86 / min
            Escreva um algoritmo que lê os minutos gastos em cada tipo de ligação e 
            que mostra o valor a ser pago em cada um dos itens e, 
            também, o valor total.*/
            Scanner leitor = new Scanner(System.in);
            double assinatura = 23.32,locais, ddd ,ddi , valor;
            System.out.println("Conta telefônica");
            System.out.println();
            System.out.print("Minutos utilizados(Locais): ");
                locais = Double.parseDouble(leitor.nextLine()) * 0.09d;
            System.out.print("Minutos utilizados(DDD): ");
                ddd = Double.parseDouble(leitor.nextLine()) * 0.26d ;
            System.out.print("Minutos utilizados(DDI): ");
                ddi = Double.parseDouble(leitor.nextLine()) * 0.86d;
            valor = locais + ddd + ddi + assinatura;
            System.out.println();
            System.out.printf("Assinatura: R$%.2f\nLigações locais: R$%.2f/min\nLigações Interurbanas: R$%.2f/min\nLigações Internacionais: R$%.2f/min\nValor da Conta: R$%.2f\n",assinatura,locais,ddd,ddi,valor);
            
        }
}
