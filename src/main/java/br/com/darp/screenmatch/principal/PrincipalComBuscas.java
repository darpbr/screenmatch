package br.com.darp.screenmatch.principal;

import br.com.darp.screenmatch.modelos.Filme;
import br.com.darp.screenmatch.service.FilmeService;

import java.util.List;

public class PrincipalComBuscas
{
    public static void main(String[] args) throws Exception
    {
        /*
        * Aplicação responsável por:
        * 1 - Apresentar Tela Inicial para requisitar nome do(s) filme(s)
        * 2 - Chamar service que vai consultar filme e retornar resposta
        * 3 - Chamar service passando dados do filme recuperado do site para armazenar
        * em um arquivo json
        * */
        FilmeService service = new FilmeService();
        boolean sair = false;

        while(!sair)
        {
            String filme = service.solicitaFilmeParaUsuario();
            if(filme.equalsIgnoreCase("sair")){
                sair = service.confirmarFinalizarAplicacao();
                if(sair){
                    break;
                }
            }
            service.adicionarFilme(filme);
        }
        List<Filme> filmes = service.recuperarFilmesCadastrados();
        System.out.println("Filmes cadastrados:");
        System.out.println(filmes);
        System.out.println("Programa finalizado!");
    }

}
