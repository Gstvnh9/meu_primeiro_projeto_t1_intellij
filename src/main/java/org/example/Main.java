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

        double[][] chuva = new double[7][4];

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, no domingo: ");
        chuva[0][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva registrada na segunda área da fazenda, no domingo: ");
        chuva[0][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, no domingo: ");
        chuva[0][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, no domingo: ");
        chuva[0][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, na segunda-feira: ");
        chuva[1][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, na segunda-feira: ");
        chuva[1][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, na segunda-feira: ");
        chuva[1][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, na segunda-feira: ");
        chuva[1][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, na terça-feira: ");
        chuva[2][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, na terça-feira: ");
        chuva[2][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, na terça-feira: ");
        chuva[2][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, na terça-feira: ");
        chuva[2][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, na quarta-feira: ");
        chuva[3][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, na quarta-feira: ");
        chuva[3][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, na quarta-feira: ");
        chuva[3][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, na quarta-feira: ");
        chuva[3][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, na quinta-feira: ");
        chuva[4][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, na quinta-feira: ");
        chuva[4][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, na quinta-feira: ");
        chuva[4][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, na quinta-feira: ");
        chuva[4][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, na sexta-feira: ");
        chuva[5][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, na sexta-feira: ");
        chuva[5][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, na sexta-feira: ");
        chuva[5][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, na sexta-feira: ");
        chuva[5][3] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na primeira área da fazenda, no sábado: ");
        chuva[6][0] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na segunda área da fazenda, no sábado: ");
        chuva[6][1] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na terceira área da fazenda, no sábado: ");
        chuva[6][2] = entrada.nextDouble();

        System.out.println("Indique a quantidade de chuva, em litros, registrada na quarta área da fazenda, no sábado: ");
        chuva[6][3] = entrada.nextDouble();

        double chuvaPrimeiraArea = 0;
        double chuvaSegundaArea = 0;
        double chuvaTerceiraArea = 0;
        double chuvaQuartaArea = 0;

        for (int i = 0; i < chuva.length; i++) {

            chuvaPrimeiraArea += chuva[i][0];
            chuvaSegundaArea += chuva[i][1];
            chuvaTerceiraArea += chuva[i][2];
            chuvaQuartaArea += chuva[i][3];

        }

        System.out.println("==================== RELATÓRIO GERAL ===================");
        System.out.println("Primeira área (Total): " + chuvaPrimeiraArea + " litros.");
        System.out.println("Segunda área (Total): " + chuvaSegundaArea + " litros."  );
        System.out.println("Terceira área (Total): " + chuvaTerceiraArea + " litros.");
        System.out.println("Quarta área (Total): " + chuvaQuartaArea + " litros."    );
        System.out.println("========================================================");

    }
}
