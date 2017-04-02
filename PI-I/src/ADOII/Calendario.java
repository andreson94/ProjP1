package ADOII;

import javax.swing.JOptionPane;

public class Calendario {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"CALENDÁRIO");
        /*Escreva um programa em Java que lê um número entre 1 e 12, representando os meses do ano 
        (1 para janeiro, 2 para fevereiro, etc.) e mostra quantos dias há no mês que o usuário escolheu (ignore anos bissextos)
        */
        int mes;
        mes =Integer.parseInt(JOptionPane.showInputDialog(null,"mes:"));
        
        if (mes >= 1 && mes <= 12){
            if (mes == 1){
                JOptionPane.showMessageDialog(null,"Janeiro, tem 31 dias");
            }else if (mes == 2){
                JOptionPane.showMessageDialog(null,"Fevereiro, tem 28 dias");
            }else if (mes == 3){
               JOptionPane.showMessageDialog(null,"Março, tem 31 dias");
            }else if (mes == 4){
                JOptionPane.showMessageDialog(null,"Abril, tem 30 dias");
            }else if (mes == 5){
                JOptionPane.showMessageDialog(null,"Maio, tem 31 dias");
            }else if (mes == 6){
                JOptionPane.showMessageDialog(null,"Junho , tem 30 dias");
            }else if (mes == 7){
                JOptionPane.showMessageDialog(null,"Junlho, tem 31 dias");
            }else if (mes == 8){
                JOptionPane.showMessageDialog(null,"Agosto, tem 31 dias");
            }else if (mes == 9){
                JOptionPane.showMessageDialog(null,"Setembro, tem 30 dias");
            }else if (mes == 10){
                JOptionPane.showMessageDialog(null,"Outubro, tem 31 dias");
            }else if (mes == 11){
                JOptionPane.showMessageDialog(null,"Novembro, tem 30 dias");
            }else if (mes == 12){
                JOptionPane.showMessageDialog(null,"Dezembro, tem 31 dias");
            }
            }else{
                JOptionPane.showMessageDialog(null,"Mês Invalido"); 
        }
    }
}    