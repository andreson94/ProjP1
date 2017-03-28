package ADOI;

import java.util.Scanner;

public class BhaskaraAsAvessas {
    public static void main(String[] args) {
        /*Escreva um algoritmo que lê os os pontos onde uma parábola intercepta
        o eixo x (as raízes) e o ponto onde ela intercepta o eixo y (o coeficiente c)
        e que mostra os coeficientes a, b e c de uma equação de 2º grau que gera essa parábola.*/
       
        Scanner leitor = new Scanner ( System.in);
        float x1,x2,c,a,b,p,s;
        System.out.print("Digite o x¹: ");
        x1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite o x²: "); 
        x2 = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite o coeficiente c: ");
        c = Float.parseFloat(leitor.nextLine());
        s = x1+ x2;
        p = x1 * x2;
        a = c / p;
        b = -(a * s);
        System.out.printf("Pontos do eixo X: {%.0f,%.0f}\nPonto do Y: {%.0f}\nCoeficientes \nA: %.0f\nB: %.0f\nC:%.0f\n",x1,x2,c,a,b,c);
    }
}
    

