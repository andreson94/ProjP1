package Lista2;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        /*Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados
como nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE*/
        Scanner leitor = new Scanner(System.in);
        String nome,sexo;
        int idade,velho=0,i = 0;
        do {
            System.out.print("nome: ");
            nome = leitor.next();
            System.out.print("idade: ");
            idade = leitor.nextInt();
            System.out.print("sexo: ");
            sexo = leitor.next();
            
            i= i+1;
        if (idade > velho ){
            velho = idade;
        }else{
            velho = velho;
        }
        }while(i<5);
        
        System.out.println(velho + nome + sexo);
    }
}
