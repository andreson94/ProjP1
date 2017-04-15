package Lista1;

import javax.swing.JOptionPane;

public class exe2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"CALENDÁRIO SEMANAL");
        int dia;
        dia =Integer.parseInt(JOptionPane.showInputDialog(null,"Dia da Semana:"));
        
            switch (dia) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Domingo, Fim de Semana");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Segunda - Feira, Dia útil ");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Terça- Feira, Dia útil");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Quarta - Feira, Dia útil");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Quinta - Feira, Dia útil");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Sexta - Feira, Dia útil");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Sabado, Fim de Semana");
                    break;
                default:
                JOptionPane.showMessageDialog(null,"Dia Invalido"); 
                    break;
            }
    }
}    


    

