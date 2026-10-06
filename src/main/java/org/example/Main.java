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

        //Dado o vetor {12, 45, 8, 90, 23}, percorra todas as posições
        //e determine qual é o maior valor armazenado

        int[] vetor = {12, 45, 8, 90, 23};
        int valor_maior = vetor[0];

        for (int n = 0; n < vetor.length; n++) {

            System.out.println(vetor[n]);

            if (vetor[n] > valor_maior) {

                valor_maior = vetor[n];

            }

        }

        System.out.println(valor_maior);

    }
}
