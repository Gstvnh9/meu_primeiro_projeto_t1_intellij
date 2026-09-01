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

         System.out.println("Indique a sua nota final, para determinar a aprovação:");
         double nota = entrada.nextDouble();

         if (nota >= 7) {
             System.out.println("Parabéns, você foi aprovado!");
         } else {
             System.out.println("Infelizmente você foi reprovado. Se esforce mais daqui para frente!");
         }
     }
}