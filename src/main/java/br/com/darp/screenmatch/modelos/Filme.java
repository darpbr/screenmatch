package br.com.darp.screenmatch.modelos;

import br.com.darp.screenmatch.calculos.Classificavel;
import br.com.darp.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Filme extends Titulo implements Classificavel
{
    private String diretor;

    public Filme(String nome, int anoDeLancamento)
    {
        super(nome, anoDeLancamento);
    }

    public Filme(FilmeOmdb filmeOmdb){
        super(filmeOmdb.title(), Integer.valueOf(filmeOmdb.year()));
        var duracao = filmeOmdb.runtime().split(" ");
        int duracaoEmMinutos = Integer.valueOf(duracao[0]);
        super.setDuracaoEmMinutos(duracaoEmMinutos);
        this.diretor = filmeOmdb.director();
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
        return "{" +
                "\nTítulo: " + getNome()
                + "\nAno de Lançamento: " + getAnoDeLancamento()
                + "\nDuração: " + getDuracaoEmMinutos() + "min."
                + "\nDiretor: " + diretor
                + "\n}";
    }
}
