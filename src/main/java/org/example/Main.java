package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Qual valor, em reais, você possui no momento?");
         double dinheiro = entrada.nextDouble();

         System.out.println("Agora me diga qual a cotação do dolar, em reais, atualmente:");
         double cotacao = entrada.nextDouble();

         System.out.println("Você possui R$ " + dinheiro);
         System.out.println("Você possui U$ " + dinheiro / cotacao);
     }
}