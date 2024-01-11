package br.com.darp.screenmatch.desafios.aula3;

import br.com.darp.screenmatch.desafios.aula3.excecao.SenhaFracaException;

import java.util.Scanner;

public class Principal2
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma senha (min 8 caracteres): ");
        var senha = leitor.nextLine();

        try{
            Senha password = new Senha(senha);
            System.out.println("Senha criada com sucesso: " + password);
        }catch (SenhaFracaException e){
            System.out.println("Não foi possível a criação da senha.");
            System.out.println(e.getMessage());
        }finally
        {
            System.out.println("Aplicação Finalizada com sucesso!");
        }
    }
}
