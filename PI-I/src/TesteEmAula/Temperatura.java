package TesteEmAula;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tipo;
        double t;
        System.out.println("\t\t***TABELA DE TEMPERATURA***\n");
        System.out.print("Digite o tipo: ");
        tipo = leitor.nextLine();
        System.out.print("Digite temperatura: ");
        t = Double.parseDouble(leitor.nextLine());
        
        switch (tipo.toUpperCase()){
            case "a":
                if (t >= 10 && t <= 17){
                    System.out.print("pode transportar");
                }else{
                    System.out.println("Ñ pode transportar");
                }
          
        }
        
    }
}
