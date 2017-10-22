/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public Connection conexao; //responsavel por realizar a conexao com o banco de dados.
    public Connection getconnection(){
      
        try {
            Class.forName(Driver);

            return DriverManager.getConnection(URL, USER, PASS);
                    
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexão: ",ex);
        }
    }
    
    public static void closeConnetion(Connection con){
            
        try {
               if(con!= null){
                con.close();
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
    public static void closeConnetion(Connection con, PreparedStatement stmt){
            
        closeConnetion(con);
        
        try {
               if(stmt!= null){
                stmt.close();
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
    public static void closeConnetion(Connection con, PreparedStatement stmt,ResultSet result){
            
        closeConnetion(con, stmt);
        
        try {
               if(result!= null){
                result.close();
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
    }
    
