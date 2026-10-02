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

        int[][] fertilidades = {

                {10, 20, 30, 40, 50, 60},
                {60, 70, 80, 90, 100, 90},
                {5, 10, 15, 20, 25, 30},
                {30, 35, 40, 45, 50, 55},
                {55, 60, 65, 70, 75, 80},
                {85, 90, 95, 100, 95, 90}

        };

        int mediaPrimeiraLinha = 0;
        int mediaSegundaLinha = 0;
        int mediaTerceiraLinha = 0;
        int mediaQuartaLinha = 0;
        int mediaQuintaLinha = 0;
        int mediaSextaLinha = 0;
        int maiorFertilidade = 0;
        String linha = "";

        for (int i = 0; i < fertilidades.length; i++) {

            mediaPrimeiraLinha += fertilidades[0][i];
            mediaSegundaLinha += fertilidades[1][i];
            mediaTerceiraLinha += fertilidades[2][i];
            mediaQuartaLinha += fertilidades[3][i];
            mediaQuintaLinha += fertilidades[4][i];
            mediaSextaLinha += fertilidades[5][i];

        }

        mediaPrimeiraLinha /= 6;
        maiorFertilidade = mediaPrimeiraLinha;
        linha = "Primeira Linha";

        mediaSegundaLinha /= 6;

        if (maiorFertilidade < mediaSegundaLinha) {

            linha = "Segunda Linha";
            maiorFertilidade = mediaSegundaLinha;

        }

        mediaTerceiraLinha /= 6;

        if (maiorFertilidade < mediaTerceiraLinha) {

            linha = "Terceira Linha";
            maiorFertilidade = mediaTerceiraLinha;

        }

        mediaQuartaLinha /= 6;

        if (maiorFertilidade < mediaQuartaLinha) {

            linha = "Quarta Linha";
            maiorFertilidade = mediaQuartaLinha;

        }

        mediaQuintaLinha /= 6;

        if (maiorFertilidade < mediaQuintaLinha) {

            linha = "Quinta Linha";
            maiorFertilidade = mediaQuintaLinha;

        }

        mediaSextaLinha /= 6;

        if (maiorFertilidade < mediaSextaLinha) {

            linha = "Sexta Linha";
            maiorFertilidade = mediaSextaLinha;

        }

        System.out.println("A maior fertilidade foi registrada na " + linha + ", onde chegou à uma média de " + maiorFertilidade + "%.");

    }
}
