package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra = "";

        System.out.println("Insira a palavra desejada: ");
        palavra = leitor.next();

//       System.out.println(new StringBuilder(palavra).reverse().toString());

        char[] caracteres = palavra.toCharArray();
        String contrario = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            contrario += caracteres[i];
        }
        System.out.println(contrario);
    }
}
