package br.com.darp.screenmatch.desafios.aula1;

import br.com.darp.screenmatch.desafios.configs.ClientHttpConfig;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal2
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a criptomoeda desejada: ");
        var criptoMoeda = leitura.nextLine();

        System.out.println("Digite a Moeda para cotação(BRL/USD): ");
        var moeda = leitura.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoMoeda + "&vs_currencies=" + moeda;

        ClientHttpConfig client = new ClientHttpConfig();
        String resposta = client.montarRequisicaoGetSemAutenticacao(url);
        System.out.println("Cotação da Cripto: "+ criptoMoeda + " em BRL é de R$ " + resposta);

    }
}
