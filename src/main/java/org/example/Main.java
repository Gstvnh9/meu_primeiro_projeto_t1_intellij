package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         // Precisa de um acesso do Interpasse

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         Scanner entrada = new Scanner(System.in);

         System.out.println("Qual a distância média, em quilômetros, que você geralmente percorre em uma viagem de carro?");
         double distancia = entrada.nextDouble();

         System.out.println("Nessa distância percorrida, qual a quantidade de combústivel, em litros, gasto?");
         double combustivel = entrada.nextDouble();

         double consumoMedio = distancia / combustivel;

         System.out.println("Nas suas viagens, você viaja " + consumoMedio + " quilômetros para cada litro de combustível." );
     }
}