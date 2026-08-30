package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o raio do círculo, em centímetros:");
         double raio = entrada.nextDouble();

         double area = Math.PI * Math.pow(raio, 2);

         System.out.println("A área do seu círculo é de, aproximadamente " + area + " centímetros quadrados.");
     }
}