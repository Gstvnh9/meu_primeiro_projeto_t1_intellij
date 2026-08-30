package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o seu peso:");
         double peso = entrada.nextDouble();

         System.out.println("Agora, indique a sua altura:");
         double altura = entrada.nextDouble();

         double indice = peso / Math.pow(altura, 2);

         System.out.println("O seu Índice de Massa Corporal é de, aproximadamente, " + indice);

     }
}