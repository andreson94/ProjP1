package ADO;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
consecutivo de –9)*/
        Scanner leitor = new Scanner (System.in);
        int n1, n2;
        System.out.print("Digite o 1º numero: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o 2º numero: ");
        n2 = leitor.nextInt();
        System.out.printf("Sequencia do Numero 1: %d \nSequencia do Numero 2: %d \n",(n1+1) ,(n2+1) );
        
    
    }
}
