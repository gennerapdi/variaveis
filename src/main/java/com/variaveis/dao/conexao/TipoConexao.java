package com.variaveis.dao.conexao;

public enum TipoConexao {
    
    DEVELOPMENT() {
        public String host() {
            return "10.0.1.202";
        }
        public Integer port() {
        	return 5432;
        }
        public String username() {
            return "administrador";
        }
        public String password() {
            return "gennera@2017";
        }
    };
    
    TipoConexao() { }
    
    public abstract String host();
    public abstract Integer port();
    public abstract String username();
    public abstract String password();
    

}
