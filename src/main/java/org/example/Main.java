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

         System.out.println("Indique a renda mensal do cliente:");
         double renda = entrada.nextDouble();

         System.out.println("Agora, indique o Score de crédito de um cliente:");
         int score = entrada.nextInt();

         if (renda > 8000 && score > 700) {
             System.out.println("Parabéns, O seu Cartão PREMIUM foi aprovado!");
         } else {
             System.out.println("Infelizmente, você não atende aos requisitos necessários para aprovação do Cartão PREMIUM.");
         }
     }
}