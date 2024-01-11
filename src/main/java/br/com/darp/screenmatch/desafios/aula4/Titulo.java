package br.com.darp.screenmatch.desafios.aula4;

public class Titulo
{
    private String nome;
    private String autor;
    private int ano;

    public Titulo(final String nome, final String autor, final int ano)
    {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + ", " +
                "Autor: " + autor + ", " +
                "Ano: " + ano;
    }
}
