CREATE TABLE usuario (
	id INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL,
	idade INTEGER NOT NULL,
	data DATETIME NOT NULL,	
   	PRIMARY KEY ( id )
);

CREATE TABLE telefone (
	id INT NOT NULL AUTO_INCREMENT,
	codigoArea INT NOT NULL,
	numero INT NOT NULL,
   	PRIMARY KEY ( id )
);

CREATE TABLE usuario_telefone (
	idUsuario INT NOT NULL,
	idTelefone INT NOT NULL,
    primary key(idUsuario, idTelefone)
);

ALTER TABLE `usuario_telefone` 
ADD CONSTRAINT `fk_usuario_telefone`
  FOREIGN KEY (`idUsuario`)
  REFERENCES `usuario` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `usuario_telefone` 
ADD CONSTRAINT `fk_telefone_usuario`
  FOREIGN KEY (`idTelefone`)
  REFERENCES `telefone` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;