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
        int menor = listaDeNumeros[0];
        int maior = listaDeNumeros[0];
        int media = 0;

        for (int numero : listaDeNumeros) {
            if (numero < menor){
                menor = numero;
            }
            else {
                maior = numero;
            }
        }
        System.out.println("Menor valor do array: " +menor);
        System.out.println("Menor valor do array: " +maior);

        for (int numero : listaDeNumeros) {
            media += numero;
            }
        media /= listaDeNumeros.length;
        System.out.println("Média de valores do array: " +media);
    }
}
