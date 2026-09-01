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

         System.out.println("Indique a sua idade:");
         int idade = entrada.nextInt();

         if (idade >= 18) {
             System.out.println("Maior de idade");
         } else {
             System.out.println("Menor de idade");
         }
     }
}