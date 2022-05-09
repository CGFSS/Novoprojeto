-- Apagar o banco de dados
drop database banco;
-- Criar o banco de dados
create database banco;
-- Atribuir os privilégios de acesso aos objetos do banco
-- para o usuário root
GRANT ALL PRIVILEGES ON banco.* TO 'root'@'localhost';
-- Acesar o banco de dados: banco
USE banco;
-- Criar a tabela: usuario
CREATE TABLE cliente(
    id int AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    nascimento date NOT NULL,
    sexo varchar(1) NOT NULL,
    cpf varchar(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_endereco) REFERENCES endereco (id)
);

CREATE TABLE endereco(
    id int AUTO_INCREMENT,
    cep varchar(50) NOT NULL,
    rua varchar(50) NOT NULL,
    bairro varchar(50) NOT NULL,
    numero int(5) NOT NULL,
    cidade varchar(50) NOT NULL,
    uf varchar(2) NOT NULL,
    PRIMARY KEY (id)
);

