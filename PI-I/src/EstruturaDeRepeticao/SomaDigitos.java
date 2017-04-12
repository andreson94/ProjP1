package EstruturaDeRepeticao;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o numero: ");  
        String n = leitor.nextLine() ;
        int soma = 0;
        for (int i = 0; i < n.length() ; i++){
            String digito = n.substring(i,i+1);
            int di = Integer.parseInt(digito);
            soma = soma + di;
        }
        System.out.println("Soma = "+soma);
   
    }
}