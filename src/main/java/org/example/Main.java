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

        double[] plantacao = new double[12];

        System.out.println("Indique o consumo de água, em Litros, do primeiro setor: ");
        plantacao[0] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do segundo setor: ");
        plantacao[1] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do terceiro setor: ");
        plantacao[2] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do quarto setor: ");
        plantacao[3] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do quinto setor: ");
        plantacao[4] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do sexto setor: ");
        plantacao[5] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do sétimo setor: ");
        plantacao[6] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do oitavo setor: ");
        plantacao[7] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do nono setor: ");
        plantacao[8] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do décimo setor: ");
        plantacao[9] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do penultimo setor: ");
        plantacao[10] = entrada.nextDouble();

        System.out.println("Indique o consumo de àgua, em Litros, do último setor:");
        plantacao[11] = entrada.nextDouble();

        double maiorConsumo = 0;
        int maiorSetor = 0;

            for (int i = 0; i < plantacao.length; i++) {

                if (maiorConsumo == 0) {

                    maiorConsumo = plantacao[i];
                    maiorSetor = i;

                } else if (maiorConsumo < plantacao[i]) {

                    maiorConsumo = plantacao[i];
                    maiorSetor = i;

                }

            }

        System.out.println("O setor número " + (maiorSetor + 1) + " foi destacado com o maior consumo dentre todos, registrando um gasto de " + maiorConsumo + " litros de água." );
    }
}
