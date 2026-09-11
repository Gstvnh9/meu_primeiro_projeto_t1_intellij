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

         int venda = 1;
         double total = 0;

         while (venda <= 5) {
             System.out.println("Indique o valor da venda número " + venda + ":");
             double valor = entrada.nextDouble();

             total = total + valor;
             venda++;
         }

         System.out.println("O faturamento total do dia foi de: " + total);
     }
}