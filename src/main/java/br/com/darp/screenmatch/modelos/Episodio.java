package br.com.darp.screenmatch.modelos;

import br.com.darp.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel
{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes()
    {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(final int totalVisualizacoes)
    {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(final int numero)
    {
        this.numero = numero;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(final String nome)
    {
        this.nome = nome;
    }

    public Serie getSerie()
    {
        return serie;
    }

    public void setSerie(final Serie serie)
    {
        this.serie = serie;
    }

    @Override
    public int getClassificacao()
    {
        if (totalVisualizacoes > 100)
        {
            return 4;
        } else
        {
            return 2;
        }
    }
}
