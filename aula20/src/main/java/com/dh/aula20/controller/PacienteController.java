package com.dh.aula20.controller;


import com.dh.aula20.service.Paciente;

@RestController
public class PacienteController {


    @GetMapping("listar")
    public Map<Integer, Paciente> listarPacientes(){
        return service.buscarPacientes();

    }
    @GetMapping("criar")
    public Paciente criarPaciente() {
        return service.criarPaciente();
    }

    @GetMapping("deletar/{id}")
    public Paciente deletarPacientes(@PathVariable Integer id){
        service.deletarPaciente(id);
        return "Paciente deletado!";
}
