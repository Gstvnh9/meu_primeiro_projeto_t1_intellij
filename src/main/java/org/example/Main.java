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

         System.out.println("Indique um número de 1 a 7:");
         int dia = entrada.nextInt();

         switch (dia) {
             case 1:
                 System.out.println("O número 1 representa o Domingo!");
                 break;

             case 2:
                 System.out.println("O número 2 representa a Segunda-Feira!");
                 break;

             case 3:
                 System.out.println("O número 3 representa a Terça-Feira!");
                 break;

             case 4:
                 System.out.println("O número 4 representa a Quarta-Feira!");
                 break;

             case 5:
                 System.out.println("O número 5 representa a Quinta-Feira!");
                 break;

             case 6:
                 System.out.println("O número 6 representa a Sexta-Feira!");
                 break;

             case 7:
                 System.out.println("O número 7 representa o Sábado!");
                 break;

             default:
                 System.out.println("Apenas indique números de 1 a 7!");
         }
     }
}