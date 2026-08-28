package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         // Criar variáveis

         double base, altura, perimetro;

         // Entrada de dados

         System.out.println("Informe a base do retângulo: ");

         base = entrada.nextDouble();



         System.out.print("Informe a altura do retângulo: ");

         altura = entrada.nextDouble();

         // Cálculo

         perimetro = 2 * base + 2 * altura;

         // Resultado

         System.out.println("O retângulo tem " + perimetro + " cm de perímetro");
     }
}