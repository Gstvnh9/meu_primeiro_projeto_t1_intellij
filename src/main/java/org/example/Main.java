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

        System.out.println("Insira o valor, em graus Celsius, que você deseja converter para Fahrenheit: ");
        double fahrenheit = converterCelsiusParaFahrenheit(entrada.nextDouble());

        System.out.println("Este valor equivale à " + fahrenheit + " graus em Fahrenheit.");

    }

    public static double converterCelsiusParaFahrenheit(double celsius) {

        return celsius * 1.8 + 32;

    }

}

