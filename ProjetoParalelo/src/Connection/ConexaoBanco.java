/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreson
 */
public class ConexaoBanco {
    
    private final String driver = "com.mysql.jdbc.Driver";  //responsavel por identificar o serviço de banco de dados
    private final String caminho = "jdbc:mysql://localhost:3306/Cadastro";  //responsavel por setar o local do banco de dados
    private final String usuario = "root"; //responsavel por identificar o usuario
    private final String senha = ""; //responsavel por identificar a senha 
    public Statement stat; // responsavel por preparar e realisar pesquisas no banco.
    public ResultSet result; //responsavel por armazenar o resultado de uma pesquisa passado para o statement.
    public Connection connection; //responsavel por realizar a conexao com o banco de dados.
    
    //metodo responsavel pela conexão do banco
    public void conexao(){
        try { //tentativa inicial
            System.setProperty("jdbc.Drivers",driver);//seta a prpriedade do driver de conexão
            connection = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexao com o banco
            JOptionPane.showMessageDialog(null,"Conectado com sucesso");//imprime uma caixa de mensagem
        } catch (SQLException ex) { //excessão
            JOptionPane.showMessageDialog(null,"Erro de Conexão!\nErro: "+ex.getMessage());//mostra mensagem de erro pegando oque esta no ex
        }
        
    }
    public void desconecta(){//método para fechar a conexão com o banco
        try {
            connection.close(); //fecha a conexão
            JOptionPane.showMessageDialog(null,"Conectado com sucesso");//imprime uma caixa de mensagem
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar a Conexão!\nErro: "+ex.getMessage());//mostra mensagem de erro que esta no ex

        }
    }
}