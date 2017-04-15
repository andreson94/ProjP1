package execicios;

import java.util.Scanner;
/*Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos.*/
public class exe4 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n,soma = 0,media,i = 0;
        System.out.println("digite um numero: ");

        while ( i <= 6){
                            
            System.out.println("digite um numero: ");
            n = as.nextInt();
            soma = soma + n;
            System.out.println("soma: " + soma);
            
        }

    }
}
