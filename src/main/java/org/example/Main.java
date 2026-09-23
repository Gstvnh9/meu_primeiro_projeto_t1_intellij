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

        int[] numeros = new int[5];
        numeros [0] = 10;
        numeros [1] = 20;
        numeros [2] = 30;
        numeros [3] = 40;
        numeros [4] = 50;

        System.out.println("Primeiro elemento: " + numeros);

    }
}