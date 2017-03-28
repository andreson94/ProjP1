
package ADOII;

import java.util.Scanner;

public class SalarioComPlanoDeCarreira {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome;
       double valorhora = 0, salario,qhora; int nivel;
            System.out.println("Demostrativo de Pagamento");
            System.out.print("Nome: ");
            nome = leitor.nextLine();
            System.out.print("Horas Trabalhadas: ");
            qhora = leitor.nextDouble();
            System.out.print("Nivel: ");
            nivel = Integer.parseInt(leitor.next());
            if(nivel == 1){
            valorhora = 15.00;
            }else if(nivel == 2){
                    valorhora = 18.00;
            }else if( nivel == 3){
                    valorhora = 22.00;
            }else if (nivel == 4){
                    valorhora = 27.00;
            }else if(nivel == 5){
                    valorhora = 33.00;
            }
            salario = (double) qhora * valorhora;
            System.out.printf("O Funcionário %s trabalhou %.0f horas por R$ %.2f (Nivel %d) e deve receber R$ %.2f\n ",nome,qhora,valorhora,nivel,salario);
    }
    
}