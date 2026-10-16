package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    static void main() {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        maiorNumero();

    }

    static void maiorNumero(){

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[] numeros = new int[3];
        int maiorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Indique o " + (i + 1) + "° número à ser comparado:");
            numeros[i] = entrada.nextInt();

            if (maiorNumero < numeros[i]) {

                maiorNumero = numeros[i];

            }

        }

        System.out.println("Dentre os valores apresentados, o maior número é o " + maiorNumero + ".");

    }
}

