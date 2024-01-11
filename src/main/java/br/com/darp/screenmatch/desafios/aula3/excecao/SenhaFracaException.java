package br.com.darp.screenmatch.desafios.aula3.excecao;

public class SenhaFracaException extends RuntimeException
{
    private String mensagem;
    public SenhaFracaException(final String mensagem)
    {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage()
    {
        return this.mensagem;
    }
}
