package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o valor para cada hora que você trabalha:");
         double valor = entrada.nextDouble();

         System.out.println("Agora, indique o número de horas que você trabalha no mês:");
         int horas = entrada.nextInt();

         double salario = valor * horas;

         System.out.println("O seu salário bruto está avaliado em, aproximadamente, R$ " + salario + " por mês.");
     }
}