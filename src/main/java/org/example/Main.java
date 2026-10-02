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

        int[][] focos = {

                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {5, 10, 15, 20, 25},
                {30, 35, 40, 45, 50},
                {55, 60, 65, 70, 75}

        };

        int mediaPrimeiraRegiao = 0;
        int mediaSegundaRegiao = 0;
        int mediaTerceiraRegiao = 0;
        int mediaQuartaRegiao = 0;
        int mediaQuintaRegiao = 0;
        int maiorFoco = 0;
        String regiao = "";

        for (int i = 0; i < focos.length; i++) {

            mediaPrimeiraRegiao += focos[0][i];
            mediaSegundaRegiao += focos[1][i];
            mediaTerceiraRegiao += focos[2][i];
            mediaQuartaRegiao += focos[3][i];
            mediaQuintaRegiao += focos[4][i];

        }

        mediaPrimeiraRegiao /= 5;
        maiorFoco = mediaPrimeiraRegiao;

        mediaSegundaRegiao /= 5;

        if (maiorFoco < mediaSegundaRegiao) {

            regiao = "Segunda Região";
            maiorFoco = mediaSegundaRegiao;

        }

        mediaTerceiraRegiao /= 5;

        if (maiorFoco < mediaTerceiraRegiao) {

            regiao = "Terceira Região";
            maiorFoco = mediaTerceiraRegiao;

        }

        mediaQuartaRegiao /= 5;

        if (maiorFoco < mediaQuartaRegiao) {

            regiao = "Quarta Região";
            maiorFoco = mediaQuartaRegiao;

        }

        mediaQuintaRegiao /= 5;

        if (maiorFoco < mediaQuintaRegiao) {

            regiao = "Quinta Região";
            maiorFoco = mediaQuintaRegiao;

        }

        System.out.println("O maior foco de pragas foi registrado na " + regiao + ", onde chegou à uma média de " + maiorFoco + "%.");

    }
}
