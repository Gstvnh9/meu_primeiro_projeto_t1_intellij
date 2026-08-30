package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Indique o valor do seu capital inicial:");
         double capital = entrada.nextDouble();

         System.out.println("Agora, indique o valor da taxa de juros mensal, em porcentagem:");
         double juros = entrada.nextDouble();

         System.out.println("Por último, indique o tempo, em meses:");
         int tempo = entrada.nextInt();

         juros = juros / 100;
         double jurosSimples = capital * juros * tempo;
         double montante = jurosSimples + capital;

         System.out.println("O seu montante final está avaliado em, aproximadamente, R$ " + montante + ".");
     }
}