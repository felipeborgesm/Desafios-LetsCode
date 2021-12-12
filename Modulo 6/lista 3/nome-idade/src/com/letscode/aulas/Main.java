package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] nomes = new String[5];
        int[] idades = new int[5];
        int mediaIdades = 0;
        Scanner leitor = new Scanner(System.in);
        String nomeMenorIdade = "";
        String nomeMaiorIdade = "";


        for (int contador = 0; contador < nomes.length; contador++) {
            System.out.println("Insira seu nome: ");
            nomes[contador] = leitor.next();
            System.out.println("Insira sua idade: ");
            idades[contador] = leitor.nextInt();
        }

        int maiorIdade = idades[0];
        int menorIdade = idades[0];

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                nomeMaiorIdade = nomes[i];
            } else {
                menorIdade = idades[i];
                nomeMenorIdade = nomes[i];
            }
        }

        for (int idade : idades) {
            mediaIdades += idade;
        }
        mediaIdades /= idades.length;

        System.out.println("pessoa mais velha, " +nomeMaiorIdade +", tem " + maiorIdade + " anos.");
        System.out.println("pessoa mais nova, " +nomeMenorIdade +", tem " + menorIdade + " anos.");
        System.out.println("a média das idades é de " +mediaIdades +" anos.");
    }
}
