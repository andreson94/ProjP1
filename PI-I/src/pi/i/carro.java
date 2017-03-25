package pi.i;

import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
        float cm, km, l;

      Scanner leitor = new Scanner (System.in);

      System.out.print("KM: ");

      km = leitor.nextFloat();

      System.out.print("Litros de gasolina: ");

       l = leitor.nextFloat();        cm = km/l;

      System.out.println("Consumo Médio: " + cm + " km/l");

    }
 
}
