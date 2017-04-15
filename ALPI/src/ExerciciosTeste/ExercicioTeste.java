package ExerciciosTeste;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class ExercicioTeste {
    
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner leitor = new Scanner (System.in);
        float n1, n2;
        float P1, P2;
//atribuição ou inicialização
        P1 = 0.4f;
        P2 = 0.6f;
        System.out.println("Média");
        System.out.print("Nota 1: ");
        n1 = leitor.nextFloat();
        System.out.print("Nota 2: ");
        n2 = leitor.nextFloat();
        float media = (n1*P1)+(n2*P2);
        System.out.println("Média: " + media);
        if (media <= 6) {
        System.out.println("Aprovado");
       
        }
        
        
    }
}
