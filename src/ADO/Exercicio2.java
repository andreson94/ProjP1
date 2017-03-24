
package ADO;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
     /*Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
    expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
    Math.pow(5, 3) . Você pode trocar esses números por variáveis
     */ 
        Scanner leitor = new Scanner(System.in);
        double b,e,r;
        System.out.print("Base: ");
        b = leitor.nextDouble();
        System.out.print("Exp: ");
        e = leitor.nextDouble();
        
        r = Math.pow(b,e);
        System.out.print("resultado: "+r);
       
        
        
        
        
        
        
    }
    
}
