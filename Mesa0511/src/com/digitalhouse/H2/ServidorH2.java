package com.digitalhouse.H2;

import com.digitalhouse.config.ConfigJDBC;

import java.sql.Connection;
import java.sql.Statement;

public class ServidorH2 implements IDao{

    private ConfigJDBC config = new ConfigJDBC();



    @Override
    public void creatTable(){
        String queryEstado = """
                CREATE TABLE IF NOT EXISTS Estado (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, estado VARCHAR(10) NOT NULL)
                """;
        String queryEndereco = """
                CREATE TABLE IF NOT EXISTS Endereco (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, logradouro VARCHAR(100) NOT NULL,
                numero VARCHAR(10) NOT NULL, complemento VARCHAR(100) NOT NULL, bairro VARCHAR(100) NOT NULL, cidade VARCHAR(100) NOT NULL,
                estado_id INT,
                CONSTRAINT fk_estado FOREIGN KEY (estado_id) REFERENCES Estado(id)
                """;
        String queryPaciente = """
                CREATE TABLE IF NOT EXISTS Paciente (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(100) NOT NULL,
                sobrenome VARCHAR(100) NOT NULL, rg VARCHAR(100) NOT NULL, dataCadastro DATE NOT NULL, endereco_id INT)
                CONSTRAINT fk_endereco FOREIGN KEY (endereco_id) REFERENCES Endereco(id)
                """;

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(queryEstado);
            stmt.execute(queryEndereco);
            stmt.execute(queryPaciente);
            stmt.close();

        } catch (Exception e) {

        }

    }
}
