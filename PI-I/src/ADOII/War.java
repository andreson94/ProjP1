package ADOII;

import java.util.Random;
import java.util.Scanner;

public class War {
    public static void main(String[] args) {
        
            Scanner leiotr = new Scanner(System.in);
        Random rng = new Random ();
        int atq, def,da1,da2,da3,dd1,dd2,dd3;
        System.out.print("Exercitos no Ataque: ");
            atq = Integer.parseInt(leiotr.nextLine());
        System.out.print("Exercitor na Defesa: ");
            def = Integer.parseInt(leiotr.nextLine());
            
            switch (atq){
            case 1:
                da1 = rng.nextInt(6);
                System.out.printf("Dado de ataque 1:%d\n ",da1);
                dd1 = rng.nextInt(6);
                System.out.printf("Dado de Defesa 1:%d\n",dd1);
                dd2 = rng.nextInt(6);
                System.out.printf("Dado de Defesa 1:%d\n",dd2);
                break;
            case 2:
                da1 = rng.nextInt(6);
                System.out.printf("Dado de ataque 1:%d\n ",da1);
                da2 = rng.nextInt(6);
                System.out.printf("Dado de ataque 2:%d\n ",da2);
                dd1 = rng.nextInt(6);
                System.out.printf("Dado de Defesa 1:%d\n",dd1);
                break;
            case 3:
                da1 = rng.nextInt(6);
                System.out.printf("Dado de ataque 1:%d\n ",da1);
                da2 = rng.nextInt(6);
                System.out.printf("Dado de ataque 2:%d\n ",da2);
                da3 = rng.nextInt(6);
                System.out.printf("Dado de ataque 3:%d\n ",da3);
            break;
            }
            
            if (atq <= def){
                 System.out.println("Defesa Venceu!!!");

            }else{
            System.out.println("Ataque Venceu!!!");
        }
    }
}
