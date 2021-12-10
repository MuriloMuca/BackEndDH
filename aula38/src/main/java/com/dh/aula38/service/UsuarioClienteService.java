package com.dh.aula38.service;

import com.dh.aula38.model.UsuarioCliente;
import com.dh.aula38.repository.UsuarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioClienteService {

    @Autowired
    private UsuarioClienteRepository repository;

    public UsuarioCliente insertUsuarioCliente(UsuarioCliente user){
        UsuarioCliente usuarioCliente = new UsuarioCliente(user.getUsername(), user.getPassword(), user.getEamil());

        return repository.save(usuarioCliente);
    }

    public UsuarioCliente checkUsuarioCliente(UsuarioCliente user){
        UsuarioCliente usuarioCliente = repository.findByUserName(user.getUsername());

        return usuarioCliente;
    }

}
