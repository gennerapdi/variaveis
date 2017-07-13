package com.variaveis.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.variaveis.dao.conexao.Conexao;
import com.variaveis.dao.handler.UsuarioHandler;
import com.variaveis.entity.Usuario;

public class UsuarioDAO {  
	
	private PreparedStatement query;
	private Connection connection = Conexao.getConnection();
	private Integer index = 1;
	
    public void addParameterString(String value) throws SQLException {
        query.setString(index, value);    
        index++;
    }
    
    public void addParameterInteger(Integer value) throws SQLException {
        query.setInt(index, value);    
        index++;
    }
    
    public void addParameterDate(Date value) throws SQLException {
        query.setDate(index, value);    
        index++;
    }

	public List<Usuario> findAll() throws Exception {
		String sql = "SELECT * FROM usuario";
        try {  
        	query = connection.prepareStatement(sql);
            ResultSet resultSet = query.executeQuery();
            return UsuarioHandler.create(resultSet).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	query.close();
            connection.close();   
        }
        return new ArrayList<Usuario>();
    } 

	public void save(Usuario usuario) throws Exception {
		String sql = "INSERT INTO usuario (nome, idade, telefone, data) VALUES(?,?,?,?)";
        try {  
        	query = connection.prepareStatement(sql);
        	addParameterString(usuario.getNome());
        	addParameterInteger(usuario.getIdade());
        	addParameterInteger(usuario.getTelefone());
        	addParameterDate(new Date(usuario.getData().getTime()));
            query.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        } finally {
        	query.close();
            connection.close();   
        }
    } 
}
