package com.digitalhouse.checkpoint.dao;

import com.digitalhouse.checkpoint.config.ConnectionH2;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServidorH2 implements IDao<Dentista> {

    private ConnectionH2 config = new ConnectionH2();

    private final Logger logger = Logger.getLogger(ServidorH2.class);

    private static final String sqlCreate = "CREATE TABLE Dentista(Matricula INT NOT NULL, Nome VARCHAR(100) NOT NULL, Sobrenome VARCHAR(120) NOT NULL)";
    private static final String sqlDrop = "DROP TABLE IF EXISTS Dentista";

    public void createTable(){

        String sqlDrop = String.format("DROP TABLE IF EXISTS Dentista");
        String sqlCreate = String.format("CREATE TABLE Dentista(Matricula INT NOT NULL, Nome VARCHAR(100) NOT NULL, Sobrenome VARCHAR(120) NOT NULL)");

        try {
            Connection connection = config.getConnectionH2();
            Statement state = connection.createStatement();
            state.execute(sqlDrop);
            state.execute(sqlCreate);
            logger.info("Tabela criada.");
            state.close();

        }catch (Exception e) {
            logger.error(e);
        }
    }


    @Override
    public Dentista insert(Dentista dentista) {

        String query = String.format("INSERT INTO Dentista VALUES('%s', '%s', '%s')",
                dentista.getMatricula(),
                dentista.getNome(),
                dentista.getSobrenome());
        try {
            Connection connection = config.getConnectionH2();
            Statement state = connection.createStatement();
            state.execute(query);
            logger.info("Dentista criado.");

        }catch (Exception e) {
            logger.error(e);
        }

        return dentista;
    }

    @Override
    public void selectAll() {

        String query = String.format("SELECT * FROM Dentista");

        try{
            Connection connection = config.getConnectionH2();
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            logger.info("Dados inseridos com sucesso.");

            while(result.next()){
                System.out.println("----------------------");
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println("----------------------");
            }
        }catch (Exception e) {
            logger.error(e);
        }

    }
}
