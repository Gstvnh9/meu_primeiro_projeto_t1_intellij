package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Qual produto você deseja comprar?");
         String produto = entrada.nextLine();

         System.out.println("Qual o preço do seu produto?");
         double preco = entrada.nextDouble();

         System.out.println("Parabéns, você recebeu um desconto de 15%!");
         System.out.println("O valor do " + produto + " decaiu para R$ " + preco * 0.85);
     }
}