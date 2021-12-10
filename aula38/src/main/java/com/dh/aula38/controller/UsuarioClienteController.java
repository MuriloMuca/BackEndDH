package com.dh.aula38.controller;

import com.dh.aula38.model.UsuarioCliente;
import com.dh.aula38.service.UsuarioClienteService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("usuario-cliente")
public class UsuarioClienteController {
    @Autowired
    private UsuarioClienteService service;

    @PostMapping
    public UsuarioCliente postUsuarioCliente(@RequestBody UsuarioCliente user){
        return service.insertUsuarioCliente(user);
    }

    @PostMapping("/jwt")
    public String getJWT (@RequestBody UsuarioCliente user){

        UsuarioCliente usuarioCliente = service.checkUsuarioCliente(user);

        if (usuarioCliente != null){
            String KEY = "chave_jwt";
            Long timer = System.currentTimeMillis();
            String jwt = Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, KEY)
                    .setSubject(usuarioCliente.getUsername())
                    .setIssuedAt(new Date(timer))
                    .setExpiration(new Date(timer + 900000))
                    .claim(KEY, usuarioCliente)
                    .compact();

            return jwt;
        }

        return "Usuário não existe";
    }

}
