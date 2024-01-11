package br.com.darp.screenmatch.desafios.aula1;

import br.com.darp.screenmatch.desafios.configs.ClientHttpConfig;

import java.io.IOException;
import java.util.Scanner;

public class Principal3
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de uma receita: ");
        var receita = leitura.nextLine();

        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        ClientHttpConfig client = new ClientHttpConfig();
        String resposta = client.montarRequisicaoGetSemAutenticacao(url);
        System.out.println("-----------------Receita encontrada---------------");
        System.out.println(resposta);
    }
}
