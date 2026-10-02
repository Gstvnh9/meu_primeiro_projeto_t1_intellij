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

        double[] hortalicas = new double[5];

        System.out.println("Indique a produção de hortaliças do primeiro talhão: ");
        hortalicas[0] = entrada.nextDouble();

        System.out.println("Indique a produção de hortaliças do segundo talhão: ");
        hortalicas[1] = entrada.nextDouble();

        System.out.println("Indique a produção de hortaliças do terceiro talhão: ");
        hortalicas[2] = entrada.nextDouble();

        System.out.println("Indique a produção de hortaliças do quarto talhão: ");
        hortalicas[3] = entrada.nextDouble();

        System.out.println("Indique a produção de hortaliças do quinto talhão: ");
        hortalicas[4] = entrada.nextDouble();

        double primeiroTalhao = hortalicas[0];
        double segundoTalhao = hortalicas[1];
        double terceiroTalhao = hortalicas[2];
        double quartoTalhao = hortalicas[3];
        double quintoTalhao = hortalicas[4];
        double total = 0;


        for ( double producao : hortalicas ) {

            total += producao;

        }

        System.out.println("========= RELATÓRIO GERAL ========");
        System.out.println("Primeiro Talhão: " + primeiroTalhao);
        System.out.println("Segundo Talhão: " + segundoTalhao  );
        System.out.println("Terceiro Talhão: " + terceiroTalhao);
        System.out.println("Quarto Talhão: " + quartoTalhao    );
        System.out.println("Quinto Talhão: " + quintoTalhao    );
        System.out.println("Total: " + total                   );
        System.out.println("==================================");

    }
}
