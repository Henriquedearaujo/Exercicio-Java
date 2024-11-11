package br.com.araujo;

public class Pessoa {
    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "br.com.araujo.Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
