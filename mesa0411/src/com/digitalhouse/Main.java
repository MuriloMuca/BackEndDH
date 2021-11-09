package com.digitalhouse;

import com.digitalhouse.model.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoa = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa ("Eduardo", "edu@gmail.com", "99999.8888");
        Pessoa pessoa2 = new Pessoa ("Malu", "malu@gmail.com", "98888.8888");
        Pessoa pessoa3 = new Pessoa ("Rafa", "rafa@gmail.com", "99999.7777");
        Pessoa pessoa4 = new Pessoa ("Xonatan", "jonathan@gmail.com", "96666.8888");
        Pessoa pessoa5 = new Pessoa ("Vitor", "vitor@gmail.com", "96666.5555");
        Pessoa pessoa6 = new Pessoa ("Murilo", "muca@gmail.com", "90000.5555");

        pessoa.add(pessoa1);
        pessoa.add(pessoa2);
        pessoa.add(pessoa3);
        pessoa.add(pessoa4);
        pessoa.add(pessoa5);
        pessoa.add(pessoa6);


        //Criar um arquivo
        FileOutputStream fileOut;

        try {
            fileOut = new FileOutputStream("ListaPessoas.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
            objectOutputStream.writeObject(pessoa);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Para ler um arquivo
        List<Pessoa> contatos = null;
        FileInputStream fileInput;

        try {
            fileInput = new FileInputStream("ListaPessoas.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
            contatos = (ArrayList) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Pessoa contato: pessoa){
            System.out.printf("""
                    
                    Nome: %s
                    Telefone: %s
                    E-mail: %s    
                    """, contato.getNome(),contato.getTelefone(),contato.getEmail());
        }

    }
}

