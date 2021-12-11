package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] nomes = new String[5];
        float[] pesos = new float[5];
        float[] alturas = new float[5];
        float[] IMCs = new float[5];
        Scanner leitor = new Scanner(System.in);

        for (int contador = 0; contador < nomes.length; contador++) {
            System.out.println("Insira seu nome: ");
            nomes[contador] = leitor.next();
            System.out.println("Insira sua pesos: ");
            pesos[contador] = leitor.nextFloat();
            System.out.println("insira sua altura: ");
            alturas[contador] = leitor.nextFloat();
        }

        for (int i = 0; i < nomes.length; i++) {
            float imc = IMC(pesos[i], alturas[i]);
            IMCs[i] = imc;
        }

        for (int j = 0; j < IMCs.length; j++) {
            if (IMCs[j] < 18.5f || IMCs[j] > 25f) {
                System.out.println("" +nomes[j] +" você está fora do peso ideal (IMC = " + IMCs[j]+").");
            }
        }
    }

    public static float IMC (float peso, float altura) {
        return (peso/(altura*altura));
    }
}
