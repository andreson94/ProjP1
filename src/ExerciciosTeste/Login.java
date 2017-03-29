package ExerciciosTeste;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String login,senha;
        login = JOptionPane.showInputDialog(null, "Login");
        senha= JOptionPane.showInputDialog(null, "Senha");
            if ("Guilherme".equals(login) && "0f5".equals(senha) || "Jair" .equals(login) && "0705" .equals (senha) ){
                System.out.println("Autorizado!");
    } else{
                System.out.println("Vou Chamar a Policia seu Hacker Safado!");
            }
        
        
    }
}
