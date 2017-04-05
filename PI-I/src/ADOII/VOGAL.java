package ADOII;

import java.util.Scanner;

public class VOGAL {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite letra: ");
        String letra = leitor.nextLine();
        switch (letra.toUpperCase()){
            case "A":
                System.out.println("letra A é uma Vogal");
                break;
            case "E":
                System.out.println("letra E é uma Vogal");
                break;
            case "I":
                System.out.println("letra I é uma Vogal");
                break;
            case "O":
                System.out.println("letra O é uma Vogal");
                break;
            case "U":
                System.out.println("letra U é uma Vogal");
                break;
            default:
                System.out.printf("Letra %s É Consoante\n",letra);
        }
    }
}
