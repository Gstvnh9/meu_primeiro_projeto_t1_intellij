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

        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        System.out.println(matriz[1][0]);

        double[][] temperaturas = new double[2][2];
        temperaturas[0][0] = 5.6;
        System.out.println(temperaturas[0][0]);

        char[] estados = {'A', 'M', 'B'};
        System.out.println(estados[2]);

        int[][] tabuleiro = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        System.out.println(tabuleiro[2][2]);

        String[][] agenda = {

                {"Carlos", "Bianca"},
                {"João", "Bruno"}

        };
        System.out.println(agenda[0][0]);

    }
}