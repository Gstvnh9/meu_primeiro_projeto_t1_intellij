package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

public class Main {
     static void main() {

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);

         System.out.println("Informe o valor do seu salário:");
         double salario = entrada.nextDouble();

         System.out.println("Informe o valor desejado para empréstimo:");
         double emprestimo = entrada.nextDouble();

         double aprovacao = salario * 0.3;

         if (emprestimo <= aprovacao) {
             System.out.println("O seu empréstimo foi aprovado!");
         } else {
             System.out.println("Infelizmente você ultrapassou os limites para aprovação!");
         }
     }
}