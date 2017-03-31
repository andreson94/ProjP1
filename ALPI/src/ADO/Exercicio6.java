package ADO;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.
*/
        Scanner leitor = new Scanner(System.in);
        int la, lb, lc;
        double areatr, areac, areat, areaq ,arrear, perimetror;
            
            System.out.println("Ára do TR\n");
            System.out.print("Informe o lado a: ");
            la = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe o lado b: ");
            lb = Integer.parseInt(leitor.nextLine());
            lc = (int) (Math.pow(la, 2) + Math.pow(lb, 2)); 
            areatr = (la * lc)/2;
            System.out.printf("Área do triangulo Retangulo é: %.0f\nbase:%d\nAltura: %d\n ",areatr,la,lb );
            System.out.println("");

            System.out.println("Área do círculo\n");
            double r = 3.14159, a;
            a = Math.PI * r * r;
            System.out.printf("Área do circulo: %f \n\n",a);
            
            
            System.out.println("Área do Trapézio\n");
            int b,B,alt,area;
            System.out.print("Informe a Base Maior: ");
            B = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe a Base menor: ");
            b = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe a Altura: ");
            alt = Integer.parseInt(leitor.nextLine());
            area = (int) ((( B * b )/2 *alt));
            System.out.println("Area do Trapézio:\n" + area);
            
            System.out.println("Área do Quadrado\n");
            int ladob,areaquadrado;
            System.out.print("informe o Lado: ");
            ladob = Integer.parseInt(leitor.nextLine());
            areaquadrado = (int) Math.pow(ladob,2);
            System.out.printf("Área do Quadrado: %d\n\n",areaquadrado);
            
            System.out.println("Área do Retangulo\n");
            int aretangulo;
            System.out.print("Informe Base: ");
            b = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe Altura:");
            alt = Integer.parseInt(leitor.nextLine());
            aretangulo = b * alt;
            System.out.println("Área do retangulo: " + aretangulo);
            System.out.println("");
            
            System.out.println("Perimetro Retangulo\n");
            int p;
            System.out.print("Informe o lado A: ");
            la = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe o lado B: ");
            lb = Integer.parseInt(leitor.nextLine());
            p = 2*(la + lb);
            System.out.printf("Perimetro:%d\n",p);
            
    }
}
