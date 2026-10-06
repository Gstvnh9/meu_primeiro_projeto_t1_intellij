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

        int[] valores = new int[5];
        int soma = 0;

        for(int i = 0; i < valores.length; i++) {

            System.out.println("Indique o valor na posição [" + i + "]:");
            valores[i] = entrada.nextInt();
            soma += valores[i];

        }

        System.out.println("A soma dos valores é igual a: " + soma + ".");

    }
}

