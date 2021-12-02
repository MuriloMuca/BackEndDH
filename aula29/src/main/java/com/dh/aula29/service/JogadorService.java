package com.dh.aula29.service;

import com.dh.aula29.persistence.entities.JogadorEntity;
import com.dh.aula29.persistence.entities.TimeEntity;
import com.dh.aula29.persistence.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<JogadorEntity> buscarTodos() {
        return jogadorRepository.findAll();
    }

    public JogadorEntity buscarPorId(Integer id){
        TimeEntity time =
        return jogadorRepository.findById(id).get();
    }

    public JogadorEntity salvar(JogadorEntity jogadorEntity, Integer id){
        TimeEntity time = timeRepository.getById(id);
        joga
        return jogadorRepository.save(jogadorEntity);
    }
}

