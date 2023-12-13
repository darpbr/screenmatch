package br.com.darp.screenmatch.modelos;

import br.com.darp.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    private String diretor;

    public Filme(String nome, int anoDeLancamento)
    {
        super(nome, anoDeLancamento);
    }

    public String getDiretor()
    {
        return diretor;
    }

    public void setDiretor(final String diretor)
    {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao()
    {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString()
    {
        return "\nTítulo: " + getNome()
                + "\nAno de Lançamento: " + getAnoDeLancamento()
                + "\nDuração: " + getDuracaoEmMinutos() + "min."
                + "\nDiretor: " + diretor;
    }
}
