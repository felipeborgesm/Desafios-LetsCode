package com.letscode.conversor;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        float Celsius;
        float Fahrenheit;


        Scanner recebeTemperatura = new Scanner(System.in);

        System.out.print("Insira a temperatura desejada em Celsius: ");
        Celsius = recebeTemperatura.nextFloat();

        Fahrenheit = (Celsius * 1.8f) + 32;

        System.out.printf("%.2f°C é %.2f F", Celsius, Fahrenheit);

    }
}