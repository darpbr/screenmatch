package br.com.darp.screenmatch.calculos;

import br.com.darp.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo
{
    private int tempoTotal;

    public int getTempoTotal()
    {
        return tempoTotal;
    }

    public void adicionaTitulo(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
