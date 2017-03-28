package ADOII;

import java.util.Scanner;

    public class HelloWord {
        public static void main(String[] args) {
            /*Escreva um programa que lê o nome de uma pessoa e mostra a seguinte mensagem: "Olá, nome da pessoa!".
            Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".*/
            Scanner leitor = new Scanner(System.in);
            String nome;
            System.out.print("Digite seu Nome: ");
            nome = leitor.nextLine();
            if (nome.equals ("")){
            System.out.println("Olá, Mundo!");    

            } else {
                System.out.println("Olá, " + nome + "!");    
            }
        }            
}
