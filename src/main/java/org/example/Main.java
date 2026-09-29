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

        int temperaturaAcimaDeTrinta = 0;

        double[] temperatura = new double[10];

        System.out.println("Informe a temperatura medida, na estufa, no primeiro dia: ");
        temperatura[0] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no segundo dia: ");
        temperatura[1] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no terceiro dia: ");
        temperatura[2] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no quarto dia: ");
        temperatura[3] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no quinto dia: ");
        temperatura[4] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no sexto dia: ");
        temperatura[5] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no sétimo dia: ");
        temperatura[6] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no oitavo dia: ");
        temperatura[7] = entrada.nextDouble();

        System.out.println("Informe a temperatura medida, na estufa, no nono dia: ");
        temperatura[8] = entrada.nextDouble();

        System.out.println("E por último, Informe a temperatura medida, na estufa, no décimo dia: ");
        temperatura[9] = entrada.nextDouble();

        for (double temperaturas : temperatura) {

            if (temperaturas > 30) {
                temperaturaAcimaDeTrinta++;
            }

        }

        if (temperaturaAcimaDeTrinta > 0) {

            System.out.println(temperaturaAcimaDeTrinta + " dias apresentaram temperaturas acima dos 30°C");
            System.out.println("É importante analisar os dados para melhoria!");

        } else {

            System.out.println("Nenhum dia apresentou temperaturas acima dos 30°C");
            System.out.println("É importante manter estes resultados!");

        }

    }
}

