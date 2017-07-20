package com.variaveis.dao.conexao;

public enum TipoConexao {
    
    DEVELOPMENT() {
        public String host() {
            return "localhost";
        }
        public Integer port() {
        	return 3306;
        }
        public String username() {
            return "root";
        }
        public String password() {
            return "123456";
        }
    };
    
    TipoConexao() { }
    
    public abstract String host();
    public abstract Integer port();
    public abstract String username();
    public abstract String password();
    

}
