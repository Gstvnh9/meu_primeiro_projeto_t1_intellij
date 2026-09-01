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

         System.out.println("Indique a sua nota de 0 a 10, para classificação de desempenho:");
         double nota = entrada.nextDouble();

         if (nota >= 9) {
             System.out.println("Você obteve um desempenho Excelente!");
         } else if (nota >= 7) {
             System.out.println("Você obteve um desempenho Bom!");
         } else if (nota >= 5) {
             System.out.println("Você obteve um desemprenho Regular!");
         } else {
             System.out.println("Você obteve um desempenho Insuficiente!");
         }

     }
}