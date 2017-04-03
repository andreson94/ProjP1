    package ADOII;

import java.util.Scanner;
/*Escreva um algoritmo que lê quantos km/l seu carro faz com gasolina e com álcool.
Além disso, o algoritmo também deve ler o preço do litro da gasolina e do álcool.
Ao final, o algoritmo deve mostrar qual a melhor opção de combustível para abastecer*/
public class GastoCombustivel {
    public static void main(String[] args) {
        double gasolina,alcool, km, l;
        double alcoolv,gasolinav,total;

        Scanner leitor = new Scanner (System.in);
        System.out.println("\t\t***CALCULO DE COMBUSTIVEL***\n\n");
        System.out.print("KM: ");
        km = Double.parseDouble(leitor.nextLine());
       
        System.out.print("Litros de Combustivel: ");
        l = Double.parseDouble(leitor.nextLine());        
        
        gasolina = km/l;
        alcool = km/l;

        System.out.print("valor da Gasolina: ");
        gasolinav = Double.parseDouble(leitor.nextLine());
        
        System.out.print("Valor do Alcool: ");
        alcoolv = Double.parseDouble(leitor.nextLine());
        
        total = alcoolv/gasolinav;
       
        if (total <= 0.7){
            System.out.printf("Consumo de Alcool:%.2f km/l\nValor do Alcool:%.2f /litro\n",alcool,alcoolv);
            System.out.println("\nABASTEÇA COM ALCOOL!");
       }else{
            System.out.printf("Consumo de Gasolina:%.2f km/l\nValor da Gasolina:%.2f /litro\n",gasolina,gasolinav );
            System.out.println("\nABASTEÇA COM GASOLINA!");
        }
    }
    
}
