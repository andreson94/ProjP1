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
   
            System.out.print("Informe o lado a: ");
            la = Integer.parseInt(leitor.nextLine());
            System.out.print("Informe o lado b: ");
            lb = Integer.parseInt(leitor.nextLine());
            System.out.println("Informe o lado c:");
            lc = Integer.parseInt(leitor.nextLine());
            areatr = (la * lc)/2;
            System.out.println("Area do triangulo Retangulo é: " + areatr );

    }
}
