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
        double total = 0;
        String continuar;

        do {

            System.out.println("Indique o valor do produto:");
            double valor = entrada.nextDouble();
            total = total + valor;

            System.out.println("Você quer continuar com as compras? (Responda apenas com 'SIM' ou 'NÃO'):");
            entrada.nextLine();
            continuar = entrada.nextLine();

        } while ((continuar.equalsIgnoreCase ("SIM")));

        System.out.println("O valor total da compra é de R$ " + total + ".");
    }
}