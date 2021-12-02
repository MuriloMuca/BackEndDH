package com.example.dh.aulaIntegradora1911.dao;

import com.example.dh.aulaIntegradora1911.model.Dentista;
import com.example.dh.aulaIntegradora1911.model.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ConsultaDAO {

    private Integer id;
    private Paciente paciente;
    private Dentista dentista;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date dataConsulta;


}