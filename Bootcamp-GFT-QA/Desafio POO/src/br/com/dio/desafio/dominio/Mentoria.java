package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descriao;
    LocalDate data;

    public Mentoria(){

    }
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descriao + '\'' +
                ", data=" + data +
                '}';
    }

    public void setDescricao(String descriçãoMentoriaDeSoftware) {
    }

    public void setData(LocalDate now) {
    }
}
