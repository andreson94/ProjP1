package ExerciciosTeste;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float a, p;
        double m;
        System.out.print("Altura: ");
        a = leitor.nextFloat();
        System.out.print("peso: ");
        p = leitor.nextFloat();
        m = p / Math.pow (a, 2);
        if (m < 26){
            System.out.println("Normal");
        }else if (m >= 26 && m < 30) {
            System.out.println("Obeso");
        }else{
           System.out.println("Obeso Mórbido");      
        }
    }
}
