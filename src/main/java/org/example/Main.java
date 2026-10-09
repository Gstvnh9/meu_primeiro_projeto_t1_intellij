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

        System.out.println("Insira o valor de cada parâmetro, A e B, consecutivamente:");
        somar(entrada.nextInt(), entrada.nextInt());

    }

    public static void somar(int a, int b) {

        System.out.println("A soma dos parâmetros é: " + (a + b) + ".");

    }

}

