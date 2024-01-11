package br.com.darp.screenmatch.desafios.aula2;

import com.google.gson.Gson;

public class PrincipalPessoa
{
    public static void main(String[] args)
    {
        String jsonDiego = "{ " +
                "\"nome\": \"Diego\"," +
                "\"idade\": \"40\"," +
                "\"cidade\": \"Brasilia\"}";

        String jsonClaudia = "{ " +
                "\"nome\": \"Claudia\"," +
                "\"cpf\": \"39690818950\"," +
                "\"cidade\": \"Brasilia\"}";

        Gson gson = new Gson();
        Pessoa diego = gson.fromJson(jsonDiego, Pessoa.class);
        System.out.println("Dados Diego: " + diego);
        Pessoa claudia = gson.fromJson(jsonClaudia, Pessoa.class);
        System.out.println("Dados Claudia: " + claudia);
    }
}
