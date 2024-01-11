package br.com.darp.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException
{
    private String mensagem;
    public ErroDeConversaoDeAnoException(final String mensagem)
    {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage()
    {
        return this.mensagem;
    }
}
