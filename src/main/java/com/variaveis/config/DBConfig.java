package com.variaveis.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.variaveis.dao.conexao.TipoConexao;

@Configuration 
@EnableTransactionManagement
public class DBConfig {

    private TipoConexao CONEXAO = TipoConexao.DEVELOPMENT;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(String.format("jdbc:mysql://%s:%s/variaveis", CONEXAO.host(), CONEXAO.port()));
        dataSource.setUsername(CONEXAO.username());
        dataSource.setPassword(CONEXAO.password());
        return dataSource;
	}
	
	@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
	
	@Bean
    public PlatformTransactionManager txManager() {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource());
        return txManager;
    }
    
}
