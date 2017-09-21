package com.variaveis.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

    public static String URL = "jdbc:postgresql://%s:%s/%s";
    private static String DRIVER = "org.postgresql.Driver";
    private static TipoConexao CONEXAO = TipoConexao.DEVELOPMENT;
    
    public static Connection getConnection() { 
        try {     
            Class.forName(DRIVER);
            return DriverManager.getConnection(getUrl(CONEXAO), CONEXAO.username(), CONEXAO.password());
        } catch(Exception ex) {
            ex.printStackTrace();         
        }
        return null;
    } 
    
    private static String getUrl(TipoConexao conexao) {
    	return String.format(URL, conexao.host(), conexao.port(), "variaveis");
	}
    
}
