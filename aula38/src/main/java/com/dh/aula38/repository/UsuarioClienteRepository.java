package com.dh.aula38.repository;

import com.dh.aula38.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {

    UsuarioCliente findByUserName(String username);

}
