package br.com.darp.screenmatch.desafios.aula3;

import br.com.darp.screenmatch.desafios.aula3.excecao.SenhaFracaException;

public class Senha
{
    private String senha;
    public Senha(String senha)
    {
        validaSenha(senha);
        this.senha = senha;
    }

    private void validaSenha(final String senha)
    {
        if(senha.length() < 8){
            throw new SenhaFracaException("Senha com menos de 8 caracteres!");
        }
    }

    @Override
    public String toString()
    {
        String retorno = "*";
        for (int i = 0; i < senha.length()-1; i++)
        {
            retorno = retorno + "*";
        }
        return retorno;
    }
}
