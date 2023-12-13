package br.com.darp.screenmatch.principal;


import br.com.darp.screenmatch.calculos.CalculadoraDeTempo;
import br.com.darp.screenmatch.calculos.FiltroRecomendacao;
import br.com.darp.screenmatch.modelos.Episodio;
import br.com.darp.screenmatch.modelos.Filme;
import br.com.darp.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {
        Filme poderosoChefao = new Filme("O poderoso chefão",1970);

        poderosoChefao.setDuracaoEmMinutos(180);
        poderosoChefao.setIncluidoNoPlano(true);

        poderosoChefao.exibeFichaTecnica();
        poderosoChefao.avalia(8);
        poderosoChefao.avalia(5);
        poderosoChefao.avalia(10);

        System.out.println("Total de avaliações: " + poderosoChefao.getTotalDeAvaliacoes());

        System.out.println(poderosoChefao.pegaMedia());

        Serie lost = new Serie("Lost", 2000);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());

        Filme avatar = new Filme("Avatar", 2023);

        avatar.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionaTitulo(poderosoChefao);
        calculadora.adicionaTitulo(avatar);
        calculadora.adicionaTitulo(lost);

        System.out.println("Tempo total para assirtir os filmes: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(poderosoChefao);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setNome("piloto");
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        var dogville = new Filme("Dogville", 2003);
        dogville.setDuracaoEmMinutos(200);
        dogville.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(dogville);
        listaDeFilmes.add(poderosoChefao);
        listaDeFilmes.add(avatar);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}