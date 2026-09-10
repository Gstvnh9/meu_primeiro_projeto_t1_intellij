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

         System.out.println("Indique o valor da transação:");
         double transacao = entrada.nextDouble();

         if (transacao > 10000) {
             System.out.println("Esta transação foi análisada pela central:");
             System.out.println("Considerações: Transação Suspeita. Recomendamos checar sua conta do banco!");
         } else {
             System.out.println("Esta transação foi análisada pela central:");
             System.out.println("Considerações: Transação Comum.");
         }
     }
}