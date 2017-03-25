package ADOI;

import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        System.out.println ("Hipotenusa triangulo retangulo");
            Scanner leia = new Scanner (System.in);

            int ca, cb, p, a;
            double h;
            System.out.print("Informe o cateto a: ");
            ca = leia.nextInt();
            System.out.print("Informe o cateto b: ");
            cb = leia.nextInt();
            ca = (int) Math.pow(ca, 2);
            cb = (int) Math.pow(cb, 2);
            h = (ca + cb);
            System.out.println("Hipotenusa: " + h);

         }
    }


