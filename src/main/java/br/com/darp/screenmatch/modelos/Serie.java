package br.com.darp.screenmatch.modelos;

import br.com.darp.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel
{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private Boolean ativa;

    public Serie(final String nome, final int anoDeLancamento)
    {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas()
    {
        return temporadas;
    }

    public void setTemporadas(final int temporadas)
    {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada()
    {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(final int episodiosPorTemporada)
    {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio()
    {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(final int minutosPorEpisodio)
    {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public Boolean getAtiva()
    {
        return ativa;
    }

    public void setAtiva(final Boolean ativa)
    {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos()
    {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "\nSerie: " + getNome()
                + "\nAno de lançamento: " + getAnoDeLancamento()
                + "\nEpisodios: " + episodiosPorTemporada;
    }
}
