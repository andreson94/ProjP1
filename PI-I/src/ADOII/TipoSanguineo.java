package ADOII;

import javax.swing.JOptionPane;

/*Escreva um algoritmo que lê o seu tipo sanguíneo e mostra:

Para quais tipos você pode fazer uma doação de sangue
De quais tipos você pode receber uma doação de sangue
Exemplo:
Qual seu tipo sanguíneo: A-
Você pode doar para: A+, A-, AB-, AB+
Você pode receber de: A-, O- */
public class TipoSanguineo {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Tipos Sanguineos Compativeis");
        String ts = JOptionPane.showInputDialog(null, "Tipo Sanguineo");
        switch (ts) {
            case "a-":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: A+, A-, AB+ e AB-");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: A- e O-");
                break;
            case "a+":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: A+ e AB+");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: A+, A-, O+ e O-");
                break;
            case "b-":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: B+, B-, AB+ e AB-");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: B- e O-");
                break;
            case "b+":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: B+ e AB+");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: B+, B-, O+ e O-");
                break;
            case "ab-":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: AB+ e AB-");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: A-, B-, AB- e O-");
                break;
            case "ab+":
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: AB+ ");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: A+, A-, B+, B-, AB+, AB-, O+ e O-");
                break;
            case "O-":  
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: A+, A-, B+, B-, AB+, AB-, O+ e O-");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: O-");
                break;
            case "O+":  
                JOptionPane.showMessageDialog(null, "Você pode Doar Para: A+, B+, AB+ e O+");
                JOptionPane.showMessageDialog(null, "Você pode Receber de: O+ e O-");    
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incompativel");
                    
        }
    }
}
