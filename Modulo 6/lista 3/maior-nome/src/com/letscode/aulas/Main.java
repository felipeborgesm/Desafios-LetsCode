package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] listaDeConvidados = new String[5];
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        String maiorNome = "";

        System.out.println("Insira os nomes dos convidados: ");
        for (int i = 0; i < listaDeConvidados.length; i++) {
            listaDeConvidados[i] = leitor.next();
            if (listaDeConvidados[i].length() > maior) {
                maior = listaDeConvidados[i].length();
                maiorNome = listaDeConvidados[i];
            }
        }
        System.out.println("nome mais longo da lista de convidados: " +maiorNome);
        System.out.println("quantidade de caracteres do maior nome: " +maior);
    }
}
