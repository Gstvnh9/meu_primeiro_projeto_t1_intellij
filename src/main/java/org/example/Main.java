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

         int participantes = 1;

         while (participantes <= 10) {
             System.out.println("Participante número " + participantes + " entrou no evento!");
             participantes++;
         }
     }
}