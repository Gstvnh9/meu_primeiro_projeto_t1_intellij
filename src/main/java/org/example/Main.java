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

        int[] vetor = {4, 7, 8, 11, 16, 20};
        int numerosPares = 0;

        for(int i = 0; i < vetor.length; i++){

            System.out.println(vetor[i]);

            if (vetor[i] % 2 == 0) {

                numerosPares++;

            }

        }

        System.out.println(" ");
        System.out.println("Dentre os números apresentados, " + numerosPares + " deles são pares!");

    }
}
