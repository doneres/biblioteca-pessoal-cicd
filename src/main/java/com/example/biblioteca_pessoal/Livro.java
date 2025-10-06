package com.example.biblioteca_pessoal;

import jakarta.persistence.*;

@Entity
@Table(name = "Livro")

public class Livro {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean lido;

    public Livro() {
    }

    public Livro(Long id, String titulo, String autor, int anoPublicacao, boolean lido) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.lido = lido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
}
