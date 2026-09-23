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
        numeros[0] = 10;
        System.out.println("Número Inteiro: " + numeros[0]);

        double[] valores = new double[3];
        valores[0] = 1.5;
        System.out.println("Número Decimal: " + valores[0]);

        char[] letras = new char[3];
        letras[0] = 'A';
        System.out.println("Letra: " + letras[0]);

        String[] nomes = new String[3];
        nomes[0] = "Ana";
        System.out.println("Nome: " + nomes[0]);

    }
}