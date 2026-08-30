package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o valor A:");
         int valorA = entrada.nextInt();

         System.out.println("Agora, indique o valor B:");
         int valorB = entrada.nextInt();

         int novoValorA = valorB;
         int novoValorB = valorA;

         System.out.println("Valor inicial de A: " + valorA);
         System.out.println("Valor inicial de B: " + valorB);
         System.out.println("=============================");
         System.out.println("Valor de A, após a troca: " + novoValorA);
         System.out.println("Valor de B, após a troca: " + novoValorB);

     }
}