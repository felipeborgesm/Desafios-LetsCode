package com.letscode.dolar;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        float dolarCotacao;
        float dolar;
        float real;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a cotação do dólar de hoje: ");
        dolarCotacao = input.nextFloat();

        System.out.println("Insira o valor em Reais para fazer a converção: ");
        real = input.nextFloat();

        System.out.printf("Convertendo R$ %.2f para dólar, temos US$ %.2f", real, conversao(real,dolarCotacao));
    }

    public static float conversao(float real, float dolarCotacao) {
        return real/dolarCotacao;
    }

}
