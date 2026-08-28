package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Informe o lado do seu quadrado em centímetros: ");

         double lado = entrada.nextDouble();

         double area = lado * lado;

         System.out.println("A área do quadrado é de " + area + " centimetros quadrados");

     }
}