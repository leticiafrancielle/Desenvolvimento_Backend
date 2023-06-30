package com.example.http.model;

public class Jogador {
    private int id;
    private String nome;
    private double altura;
    private String posicao;

    public Jogador() {}

    public Jogador(int id, String nome, double altura, String posicao) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
