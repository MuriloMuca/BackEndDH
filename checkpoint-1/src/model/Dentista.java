package model;

public class Dentista {
    private Integer matricula;
    private String nome;
    private String sobrenome;

    public Dentista(Integer matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
