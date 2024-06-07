package br.com.dio.desafio.dominio;

public class Nota {
    private Curso curso;
    private double nota;

    
    public Nota(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nota [curso=" + curso + ", nota=" + nota + "]";
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso.getTitulo();
    }


    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
}
