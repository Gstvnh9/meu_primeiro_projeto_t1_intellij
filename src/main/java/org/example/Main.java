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

        int[][] producao = {

                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36},
                {37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48}

        };

        int primeiroPomar = 0;
        int segundoPomar = 0;
        int terceiroPomar = 0;
        int quartoPomar = 0;
        int maiorProducaoAnual = 0;
        String maiorPomar = "";

            for (int i = 0; i < 12; i++) {

                primeiroPomar += producao[0][i];
                segundoPomar += producao[1][i];
                terceiroPomar += producao[2][i];
                quartoPomar += producao[3][i];

        }

        maiorProducaoAnual = primeiroPomar;
        maiorPomar = "Primeiro Pomar";

        if (maiorProducaoAnual < segundoPomar) {

            maiorPomar = "Segundo Pomar";
            maiorProducaoAnual = segundoPomar;

        }

        if (maiorProducaoAnual < terceiroPomar) {

            maiorPomar = "Terceiro Pomar";
            maiorProducaoAnual = terceiroPomar;

        }

        if (maiorProducaoAnual < quartoPomar) {

            maiorPomar = "Quarto Pomar";
            maiorProducaoAnual = quartoPomar;

        }

        System.out.println("O " + maiorPomar + " foi registrado com a maior produção anual, com " + maiorProducaoAnual + " frutas produzidas ao todo.");

    }
}
