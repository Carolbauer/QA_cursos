package br.com.dio.desafio.dominio;

public class Curso{
    private String titulo;
    String descricao;
    private int cargaHoraria;

    public Curso() {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int i) {
    }
}
