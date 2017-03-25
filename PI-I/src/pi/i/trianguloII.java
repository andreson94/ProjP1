package pi.i;

import java.util.Scanner;

public class trianguloII {
    public static void main(String[] args) {
         double ca, cb, h, p, a;

        Scanner leia = new Scanner (System.in);

        System.out.print("Informe o cateto a: ");

        ca = leia.nextDouble();

        System.out.print("Informe o cateto b: ");

        cb = leia.nextDouble();

        ca = Math.pow(ca, ca);

        cb = Math.pow(cb, cb);

        h = Math.sqrt(ca + cb);

        System.out.println("hipotenusa: " + h);

    }
}
