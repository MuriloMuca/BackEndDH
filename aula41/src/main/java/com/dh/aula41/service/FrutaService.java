package com.dh.aula41.service;

import com.dh.aula41.repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrutaService {

    @Autowired
    private FrutaRepository repository;

    public Fruta criarFruta(Fruta fruta){
        return repository.save(fruta);
    }

    public void deletarFruta(Integer id){
        repository.deleteById(id);
    }

    public List<Fruta> selectAll(){
        return repository.findAll();
    }

    public Fruta selectId(Integer id){
        return repository.findById(id).get();
    }

}
