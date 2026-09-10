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

         System.out.println("Indique o valor investido pelo cliente:");
         double investimento = entrada.nextDouble();

         if (investimento <= 10000) {
             System.out.println("Você foi classificado como um cliente BRONZE!");
         } else if (investimento <= 50000) {
             System.out.println("Você foi classificado como um cliente PRATA!");
         } else if (investimento <= 100000) {
             System.out.println("Você foi classificado como um cliente OURO!");
         } else if (investimento > 100000) {
             System.out.println("Você foi classificado como um cliente PLATINUM!");
         } else {
             System.out.println("É impossível investir esse valor!");
         }
     }
}