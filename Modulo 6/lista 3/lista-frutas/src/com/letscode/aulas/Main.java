package com.letscode.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] carrinhoDeCompras = new String[5];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira as frutas para adicionar ao carrinho: ");
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            carrinhoDeCompras[i] = leitor.next();
        }

        System.out.println("As frutas no carrinho são: ");
        for (String frutas : carrinhoDeCompras) {
            System.out.println(frutas);
        }
    }
}
