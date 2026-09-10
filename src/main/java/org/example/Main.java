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

         System.out.println("Indique o saldo médio mensal do cliente:");
         double saldo = entrada.nextDouble();

         if (saldo > 5000) {
             System.out.println("Parabéns, você possui direito à isenção de tarifa bancária!");
         } else {
             System.out.println("Infelizmente, você não atendeu os requisitos para aprovação do direito de isenção de tarifa bancária.");
         }
     }
}