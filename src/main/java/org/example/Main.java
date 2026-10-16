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

        verificarPar();

    }

    static void verificarPar() {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Insira um número, inteiro, para verificação:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {

            System.out.println("O número " + numero + " é par!");

        } else {

            System.out.println("O número " + numero + " é impar!");

        }

    }

}

