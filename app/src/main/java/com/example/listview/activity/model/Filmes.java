package com.example.listview.activity.model;

public class Filmes {

    private String filme;
    private String genero;
    private String ano;

    public Filmes(String filme, String genero, String ano) {
        this.filme = filme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {

        this.filme = filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
