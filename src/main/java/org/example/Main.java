package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o primeiro valor, inteiro:");
         int valor1 = entrada.nextInt();

         System.out.println("Agora, indique o segundo valor, também inteiro:");
         int valor2 = entrada.nextInt();

         int quociente = valor1 / valor2;
         int resto = valor1 % valor2;

         System.out.println("Quociente da divisão: " + quociente);
         System.out.println("Resto da divisão: " + resto);

     }
}