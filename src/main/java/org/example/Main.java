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

         System.out.println("Indique o seu tempo na empresa, em meses:");
         int meses = entrada.nextInt();

         if (meses > 3) {
             System.out.println("Parabéns! Você possui direito de adesão ao benefício!");
         } else {
             System.out.println("Infelizmente você ainda não está há tempo suficiente na empresa para aderir ao benefício!");
         }
     }
}