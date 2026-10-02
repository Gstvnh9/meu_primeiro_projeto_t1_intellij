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

        int[] areas = new int[8];

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na primeira área da fazenda: ");
        areas[0] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na segunda área da fazenda: ");
        areas[1] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na terceira área da fazenda: ");
        areas[2] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na quarta área da fazenda: ");
        areas[3] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na quinta área da fazenda: ");
        areas[4] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na sexta área da fazenda: ");
        areas[5] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na sétima área da fazenda: ");
        areas[6] = entrada.nextInt();

        System.out.println("Indique a umidade do solo, em porcentagem, registrada na oitava, e última, área da fazenda: ");
        areas[7] = entrada.nextInt();

        int areasMenosQuarenta = 0;

        for ( int umidade : areas ) {

            if (umidade < 40) {

                areasMenosQuarenta++;

            }

        }

        System.out.println("Foram registradas " + areasMenosQuarenta + " áreas com umidade inferior a 40%. ");

    }
}
