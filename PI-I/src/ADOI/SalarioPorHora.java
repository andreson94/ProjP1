package ADOI;

import java.util.Scanner;

public class SalarioPorHora {
    public static void main(String[] args) {
        /*Escreva um algoritmo que lê o nome de um funcionário,
        o valor da sua hora de trabalho e a quantidade de horas que ele trabalhou.
        O algoritmo deve calcular o valor do salário a ser pago e mostrar a seguinte mensagem:
        “O funcionário Nome do Funcionário trabalhou Horas Trabalhadas horas
        por R$ Valor da Hora e deve receber R$ Valor do Salário“.*/
        Scanner leitor = new Scanner(System.in);
        String nome;
        double valorhora, salario,qhora;
            System.out.println("Demostrativo de Pagamento");
            System.out.print("Nome: ");
            nome = leitor.nextLine();
            System.out.print("Horas Trabalhadas: ");
            qhora = leitor.nextDouble();
            System.out.print("Valor da Hora: ");
            valorhora = leitor.nextDouble();
            salario = (double) qhora * valorhora;
            System.out.printf("O Funcionário %s trabalhou %.0f horas por R$ %.2f e deve receber R$ %.2f\n ",nome,qhora,valorhora,salario);
    }
}
