package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] listaDeNumeros = new int[5];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira os números desejados: ");
        for (int i = 0; i < listaDeNumeros.length; i++) {
            listaDeNumeros[i] = leitor.nextInt();
            }

        System.out.println("Impares:");
        for (int numero : listaDeNumeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }

        System.out.println("Pares:");
        for (int numero : listaDeNumeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}