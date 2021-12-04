package com.letscode.pol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float polegadas;
        float centimentros;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a medida em polegadas: ");
        polegadas = input.nextFloat();

        System.out.printf("Convertendo %.2f in para centímetros: %.2f cm", polegadas, conversao(polegadas));
    }

    public static float conversao(float polegadas) {
        float FATOR_CONVERSAO = 2.54f;
        return polegadas*FATOR_CONVERSAO;
    }
}
