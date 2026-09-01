package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);

         System.out.println("Indique uma quantidade, em segundos:");
         int segundos = entrada.nextInt();

         int minutos = segundos / 60;
         int horas = minutos / 60;

         System.out.println(segundos + " segundos representam: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos." );
     }
}