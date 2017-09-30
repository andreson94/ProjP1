
package ADOII;

import java.util.Scanner;

/**
 *
 * @author Andreson
 */
public class TestePessoa {
    public static void main(String[] args) {
    Pessoa pessoa = lerPessoa();
    pessoa.calcularIMC();
    pessoa.statusIMC();
    
    }

public static Pessoa lerPessoa(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Nome: ");
    String nome = input.nextLine();
    
    System.out.print("Idade: ");
    int idade = Integer.parseInt(input.nextLine());
    
    System.out.print("Peso: ");
    float peso = Float.parseFloat(input.nextLine());
    
    System.out.print("Altura: ");
    float altura = Float.parseFloat(input.nextLine());

    return new Pessoa(nome, idade, peso, altura);

}
}