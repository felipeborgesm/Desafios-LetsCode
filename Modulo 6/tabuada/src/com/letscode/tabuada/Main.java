package com.letscode.tabuada;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número que deseja saber a tabuada: ");
        numero = input.nextInt();

        System.out.println("A tabuada do " +numero + " é:");
        System.out.println(calculaTabuada(numero));
    }

    public static String calculaTabuada(int num) {
        int contador;
        int multiplicacao;

        for (contador = 1; contador <= 10; contador++) {
            multiplicacao = num * contador;
            System.out.printf("%d x %d = %d \n", num, contador, multiplicacao);
        }
        return "Tabuada feita!!!";
    }
}
