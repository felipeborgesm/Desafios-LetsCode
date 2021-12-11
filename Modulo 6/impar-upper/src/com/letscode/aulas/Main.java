package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra = "";
        String palavraEstilizada = "";

        System.out.println("Insira a palavra: ");
        palavra = leitor.nextLine();
        char[] caracteresDaPalavra = palavra.toCharArray();

        for (int i = 0; i < caracteresDaPalavra.length; i++) {
            if (i % 2 == 0) {
                palavraEstilizada += Character.toLowerCase(caracteresDaPalavra[i]);
            } else {
                palavraEstilizada += Character.toUpperCase(caracteresDaPalavra[i]);
            }
        }
        System.out.println(palavraEstilizada);
    }
}
