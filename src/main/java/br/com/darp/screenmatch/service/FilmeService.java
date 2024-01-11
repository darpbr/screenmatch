package br.com.darp.screenmatch.service;

import br.com.darp.screenmatch.configs.ClientHttpConfig;
import br.com.darp.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.darp.screenmatch.modelos.Filme;
import br.com.darp.screenmatch.modelos.FilmeOmdb;
import br.com.darp.screenmatch.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class FilmeService
{
    private Scanner leitura = new Scanner(System.in);
    private ClientHttpConfig client = new ClientHttpConfig();
    private List<Filme> filmes = new ArrayList<>();
    private String token = "56a97dba";
    private Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public String solicitaFilmeParaUsuario(){
        System.out.println("Digite o nome de um filme (sair para finalizar):");
        return leitura.nextLine();
    }

    public boolean confirmarFinalizarAplicacao()
    {
        System.out.println("Confirma finalizar aplicação(S/N)?");
        String confirma = leitura.nextLine();
        return confirma.equalsIgnoreCase("s");
    }

    public void adicionarFilme(final String filme)
    {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("apikey", token);
        requestParams.put("t", filme);
        String encodeUrl = requestParams.keySet()
                .stream()
                .map(key -> key + "=" + encodeValue(requestParams.get(key)))
                .collect(joining("&", "https://www.omdbapi.com/?", ""));

        try
        {
            String json = client.montarRequisicaoGetSemAutenticacao(encodeUrl);

            FilmeOmdb filmeOmdb = gson.fromJson(json, FilmeOmdb.class);

            Filme meuFilme = new Filme(filmeOmdb);

            filmes.add(meuFilme);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Erro na tentativa de conversão do FilmeOmdb para Filme.");
            System.out.println(e.getMessage());
        }
        catch (ErroDeConversaoDeAnoException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        FileWriter escrita = null;
        try
        {
            escrita = new FileWriter("filmes.json");
            escrita.write(gson.toJson(filmes));
            escrita.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
    private String encodeValue(String value)
    {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    public List<Filme> recuperarFilmesCadastrados()
    {
        return filmes;
    }
}
