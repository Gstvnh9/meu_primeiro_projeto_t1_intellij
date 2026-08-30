package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique um valor, em metros:");
         double metros = entrada.nextDouble();

         double centimetros = metros * 100;
         double milimetros = metros * 1000;

         System.out.println("Valor em metros: " + metros);
         System.out.println("Valor em centímetros: " + centimetros);
         System.out.println("Valor em milímetros: " + milimetros);

     }
}