package com.letscode.calculadora;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Integer numero1;
        Integer numero2;
        char operacao;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.println("Insira o segundo número: ");
        numero2 = input.nextInt();

        System.out.println("As operações básicas com esses dois números são:  ");

        System.out.println("Resultado da soma é " + Soma(numero1, numero2));
        System.out.println("Resultado da subtração é " + Subtrai(numero1, numero2));
        System.out.println("Resultado da multiplicação é " + Multiplica(numero1, numero2));
        System.out.println("Resultado da divisão é " + Divide(numero1, numero2));
    }

    public static Integer Soma(Integer num1, Integer num2) {
        return num1+num2;
    }
    public static Integer Subtrai(Integer num1, Integer num2) {
        return num1-num2;
    }
    public static Integer Multiplica(Integer num1, Integer num2) {
        return num1*num2;
    }
    public static Integer Divide(Integer num1, Integer num2) {
        return num1/num2;
    }

}