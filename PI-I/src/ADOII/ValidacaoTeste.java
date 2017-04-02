 package ADOII;

import javax.swing.JOptionPane;
public class ValidacaoTeste {    
    public static void main(String[] args) { 
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: "));
        int r = num * 2;
        if (num >= 1 && num <= 12){ 
            JOptionPane.showConfirmDialog(null,String.valueOf(r));
        }else{
            JOptionPane.showMessageDialog(null, "Número Invalido!");
        }
    }
}

