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

        calcularMedia();

    }

    public static void calcularMedia() {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[3];
        int quantidadeDeNotas = 0;
        double somaDasNotas = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Insira o valor da nota " + (i + 1) + ":");
            notas[i] = entrada.nextDouble();

            somaDasNotas += notas[i];

            quantidadeDeNotas++;

        }

        double media = somaDasNotas / quantidadeDeNotas;

        System.out.println("A média do aluno foi de: " + media + ".");

    }

}

