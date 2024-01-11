package br.com.darp.screenmatch.desafios.aula4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Principal1
{
    public static void main(String[] args)
    {
        try
        {
            Titulo exemplo = new Titulo("Book 1", "Diego", 2024);

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            var exemploJson = gson.toJson(exemplo);

            System.out.println(exemploJson);

            Veiculo carro = new Veiculo("HB20","Hiunday","1.6","Passeio");

            var veiculoJson = gson.toJson(carro);

            System.out.println(veiculoJson);

            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write("Conteúdo a ser gravado no arquivo.");
            escrita.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("Programa finalizado com sucesso!");
    }
}
