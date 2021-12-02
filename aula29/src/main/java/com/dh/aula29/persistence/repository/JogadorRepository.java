package com.dh.aula29.persistence.repository;

import com.dh.aula29.persistence.entities.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<JogadorEntity, Integer id>{
}
