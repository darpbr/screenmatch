package br.com.darp.screenmatch.modelos;

import br.com.darp.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>
{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(final String nome, final int anoDeLancamento)
    {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(final TituloOmdb tituloOmdb)
    {
        this.nome = tituloOmdb.title();
        if(tituloOmdb.year().length() > 4)
        {
            throw new ErroDeConversaoDeAnoException("Não foi possível converter ano com mais de 04 caracteres!");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        var duracao = tituloOmdb.runtime().split(" ");
        this.duracaoEmMinutos = Integer.valueOf(duracao[0]);
    }

    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public String getNome()
    {
        return nome;
    }

    public int getAnoDeLancamento()
    {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano()
    {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(final boolean incluidoNoPlano)
    {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes()
    {
        return somaAvaliacoes;
    }

    public int getDuracaoEmMinutos()
    {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(final int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota)
    {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia()
    {
        return somaAvaliacoes / totalDeAvaliacoes;
    }
    @Override
    public boolean equals(final Object obj)
    {
        Titulo outro = (Titulo) obj;
        return outro.getNome().equals(this.nome) && outro.anoDeLancamento == this.anoDeLancamento;
    }

    @Override
    public int compareTo(final Titulo o)
    {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString()
    {
        return "{" +
                "\nTitulo: " + nome + "," +
                "\nAno: " + anoDeLancamento +
                "\nDuração: " + duracaoEmMinutos + " min" +
                "\n}";
    }
}
