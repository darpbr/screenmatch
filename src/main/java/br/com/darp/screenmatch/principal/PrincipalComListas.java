package br.com.darp.screenmatch.principal;

import br.com.darp.screenmatch.modelos.Filme;
import br.com.darp.screenmatch.modelos.Serie;
import br.com.darp.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas
{
    public static void main(String[] args)
    {
        var poderosoChefao = new Filme("O poderoso chefão",1970);
        poderosoChefao.avalia(8);
        var avatar = new Filme("Avatar", 2023);
        avatar.avalia(6);
        var dogville = new Filme("Dogville", 2003);
        dogville.avalia(10);

        var lost = new Serie("Lost", 2000);

        List<Titulo> listaAssistidos = new LinkedList<>();
        listaAssistidos.add(dogville);
        listaAssistidos.add(poderosoChefao);
        listaAssistidos.add(avatar);
        listaAssistidos.add(lost);

        listaAssistidos.forEach(titulo -> {
            if (titulo instanceof Filme filme){
                System.out.println(filme);
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        });

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);
//        Ordenar artista por nome
        Collections.sort(buscaPorArtista);
        System.out.println("Artistar ordenados:");
        System.out.println(buscaPorArtista);

//        Lista de filmes ordenada por nome
        System.out.println("Lista de assistidos ordenada por nome");
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaAssistidos);
    }
}
