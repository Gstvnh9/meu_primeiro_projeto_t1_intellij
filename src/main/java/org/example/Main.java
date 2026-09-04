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

         System.out.println("Informe o valor do seu salário:");
         double salario = entrada.nextDouble();

         if (salario <= 4000) {
             System.out.println("Parabéns, você ainda possui o direito ao Vale-Refeição!");
         } else {
             System.out.println("Infelizmente o seu salário ultrapassou o limite para adesão do benefício!");
         }
     }
}