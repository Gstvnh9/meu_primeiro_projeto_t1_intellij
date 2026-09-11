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

         int cliente = 0;

         while (cliente <= 9) {
             System.out.println("Indique a nota do cliente:");
             double nota = entrada.nextDouble();
             System.out.println("Nota " + nota + " registrada!");
             cliente++;
         }

         System.out.println("Foram registradas " + cliente + " avaliações!");
     }
}