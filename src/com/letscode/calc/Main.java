package com.letscode.calc;

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

        System.out.println("Qual a operação desejada? ");
        operacao = input.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado da soma é " + Soma(numero1, numero2));
                break;
            case '-':
                System.out.println("Resultado da soma é " + Subtrai(numero1, numero2));
                break;
            case '*':
                System.out.println("Resultado da soma é " + Multiplica(numero1, numero2));
                break;
            case '/':
                System.out.println("Resultado da soma é " + Divide(numero1, numero2));
                break;
            default:
                System.out.println("Operador inválido");

        }
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
