package ADOII;

import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float a, p;
        double imc;
        System.out.print("Altura: ");
        a = leitor.nextFloat();
        System.out.print("peso: ");
        p = leitor.nextFloat();
        imc = p / Math.pow (a, 2);
        if (imc < 18.5){
            System.out.println("Abaixo do peso!");
        }else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Normal!");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Acima do Peso!");
        }else{
           System.out.println("Obeso!");      
        }
    }
}


