package com.variaveis.dao.conexao;

public enum TipoConexao {
    
    DEVELOPMENT() {
        protected String host() {
            return "localhost";
        }
        protected Integer port() {
        	return 3306;
        }
        protected String username() {
            return "root";
        }
        protected String password() {
            return "123456";
        }
    };
    
    TipoConexao() { }
    
    protected abstract String host();
    protected abstract Integer port();
    protected abstract String username();
    protected abstract String password();
    

}
