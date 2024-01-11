package br.com.darp.screenmatch.desafios.aula3;

import java.util.Scanner;

public class Principal1
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número da divisão: ");
        var numero1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o seggundo número para divisão: ");
        var numero2 = Integer.parseInt(leitor.nextLine());

        try{
            var resultado = numero1 / numero2;
            System.out.println("Resultado da divisão de " + numero1+"/"+numero2+"="+resultado);
        }catch (ArithmeticException e){
            System.out.println("Não foi possível realizar divisão por zero" + e.getMessage());
        }
    }
}
