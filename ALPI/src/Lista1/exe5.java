package Lista1;

import javax.swing.JOptionPane;

public class exe5 {
    public static void main(String[] args) {
        String mes;
                JOptionPane.showMessageDialog(null, "CALENDARIO TEMPORADAS");
                mes =JOptionPane.showInputDialog(null,"Mês:");
                mes = mes.toLowerCase();
           
            switch (mes) {
                case "janeiro":
                    JOptionPane.showMessageDialog(null,"Alta Temporada");
                    break;
                case "fevereiro":
                    JOptionPane.showMessageDialog(null,"Alta Temporada");
                    break;
                case "junho":
                    JOptionPane.showMessageDialog(null,"Alta Temporada");
                    break;
                case "julho":
                    JOptionPane.showMessageDialog(null,"Alta Temporada");
                    break;
                case "dezembro":
                    JOptionPane.showMessageDialog(null,"Alta Temporada");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Baixa Temporada"); 
                    break;
            }
        }
    }
  
    
