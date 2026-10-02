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

        double[][] producao = new double[4][3];

        System.out.println("Indique a produção da primeira cultura, no mês de Janeiro: ");
        producao[0][0] = entrada.nextDouble();

        System.out.println("Indique a produção da segunda cultura, no mês de Janeiro: ");
        producao[0][1] = entrada.nextDouble();

        System.out.println("Indique a produção da terceira cultura, no mês de Janeiro: ");
        producao[0][2] = entrada.nextDouble();

        System.out.println("Indique a produção da primeira cultura, no mês de Fevereiro: ");
        producao[1][0] = entrada.nextDouble();

        System.out.println("Indique a produção da segunda cultura, no mês de Fevereiro: ");
        producao[1][1] = entrada.nextDouble();

        System.out.println("Indique a produção da terceira cultura, no mês de Fevereiro: ");
        producao[1][2] = entrada.nextDouble();

        System.out.println("Indique a produção da primeira cultura, no mês de Março: ");
        producao[2][0] = entrada.nextDouble();

        System.out.println("Indique a produção da segunda cultura, no mês de Março: ");
        producao[2][1] = entrada.nextDouble();

        System.out.println("Indique a produção da terceira cultura, no mês de Março: ");
        producao[2][2] = entrada.nextDouble();

        System.out.println("Indique a produção da primeira cultura, no mês de Abril: ");
        producao[3][0] = entrada.nextDouble();

        System.out.println("Indique a produção da segunda cultura, no mês de Abril: ");
        producao[3][1] = entrada.nextDouble();

        System.out.println("Indique a produção da terceira cultura, no mês de Abril: ");
        producao[3][2] = entrada.nextDouble();

        double producaoPrimeiraCultura = 0;
        double producaoSegundaCultura = 0;
        double producaoTerceiraCultura = 0;

        for (int i = 0; i < producao.length; i++) {

            producaoPrimeiraCultura += producao[i][0];
            producaoSegundaCultura += producao[i][1];
            producaoTerceiraCultura += producao[i][2];

        }

        System.out.println("================== RELATÓRIO GERAL =================");
        System.out.println("Primeira Cultura (Total): " + producaoPrimeiraCultura);
        System.out.println("Segunda Cultura (Total): " + producaoSegundaCultura  );
        System.out.println("Terceira Cultura (Total): " + producaoTerceiraCultura);
        System.out.println("====================================================");

    }
}
