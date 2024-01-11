package br.com.darp.screenmatch.configs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHttpConfig
{
    HttpClient client = HttpClient.newHttpClient();
    public String montarRequisicaoGetSemAutenticacao(final String url) throws IOException, InterruptedException
    {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> resposta =  client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Resposta: " + resposta.statusCode());

        return resposta.body();
    }
}
