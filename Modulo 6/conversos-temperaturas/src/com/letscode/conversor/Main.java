package com.letscode.conversor;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        float C;
        float F;
        float K;
        float Re;
        float Ra;

        Scanner recebeTemperatura = new Scanner(System.in);

        System.out.print("Insira a temperatura desejada em Celsius: ");
        C = recebeTemperatura.nextFloat();

        F = (C * 1.8f) + 32;
        K = C + 273.15f;
        Re = C * 0.8f;
        Ra = (C * 1.8f) + 459.67f;

        System.out.println("Convertendo para outras temperaturas: \n");

        System.out.printf("Temperatura em Fahrenheit %.2f F\n", F);
        System.out.printf("Temperatura em Kelvin %.2f K\n", K);
        System.out.printf("Temperatura em Reaumur %.2f Re\n", Re);
        System.out.printf("Temperatura em Rankine %.2f Ra\n", Ra);

    }
}
