package br.com.darp.screenmatch.modelos;

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
}
