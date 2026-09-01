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

         System.out.println("Informe o primeiro valor inteiro:");
         int valor1 = entrada.nextInt();

         System.out.println("Agora, estipule o segundo valor:");
         int valor2 = entrada.nextInt();

         if (valor1 > valor2) {
             System.out.println("O maior valor é: " + valor1);
         } else {
             System.out.println("O maior valor é: " + valor2);
         }
     }
}