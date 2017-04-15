package Lista1;

import javax.swing.JOptionPane;

public class exe4 {
    public static void main(String[] args) {
                int mes,ano;
                JOptionPane.showMessageDialog(null, "CALENDARIO");
                mes =Integer.parseInt(JOptionPane.showInputDialog(null,"Mês:"));
                ano =Integer.parseInt(JOptionPane.showInputDialog(null,"Ano:"));
        
           
            switch (mes) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Janeiro, tem 31 dias");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Fevereiro, tem 28 dias");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Março, tem 31 dias");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Abril, tem 30 dias");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Maio, tem 31 dias");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Junho , tem 30 dias");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Junlho, tem 31 dias");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Agosto, tem 31 dias");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Setembro, tem 30 dias");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null,"Outubro, tem 31 dias");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null,"Novembro, tem 30 dias");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null,"Dezembro, tem 31 dias");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Mês Invalido"); 
                    break;
            }
        }
    }
  
    
    

