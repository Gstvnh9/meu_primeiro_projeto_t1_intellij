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

        double[] semana = new double[7];

        System.out.println("Informe o valor da produção de milho, em toneladas, da primeira semana: ");
        semana[0] = entrada.nextDouble();

        System.out.println("Agora, informe o valor da segunda semana: ");
        semana[1] = entrada.nextDouble();

        System.out.println("Aqui, informe o valor da terceira semana: ");
        semana[2] = entrada.nextDouble();

        System.out.println("Informe o valor da quarta semana: ");
        semana[3] = entrada.nextDouble();

        System.out.println("Prossiga informando o valor da quinta semana: ");
        semana[4] = entrada.nextDouble();

        System.out.println("Informe o valor da sexta e penultima semana: ");
        semana[5] = entrada.nextDouble();

        System.out.println("E por último, informe o valor da sétima semana: ");
        semana[6] = entrada.nextDouble();

        double producao = 0;
        double mediaSemanal = 0;
        double maiorValor = 0;

        for (double toneladas : semana) {

            producao += toneladas;

            if (maiorValor == 0) {

                maiorValor += toneladas;

            } else if (maiorValor < toneladas) {

                maiorValor = toneladas;

            }

        }

        mediaSemanal = producao / semana.length;

        System.out.println("========================================");
        System.out.println("Produção Total: " + producao);
        System.out.println("Média Semanal: " + mediaSemanal);
        System.out.println("Maior Produção Registrada: " + maiorValor);
        System.out.println("========================================");

    }
}

