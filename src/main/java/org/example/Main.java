package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
     static void main() {

         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));



         Scanner entrada = new Scanner(System.in);



         double Celsius;

         System.out.println("Informe a temperatura em graus celsius: ");

         Celsius = entrada.nextDouble();

         double Fahrenheit = (Celsius * 9/5) + 32;



         System.out.println("A temperatura em Celsius se encontra em: " + Fahrenheit + " Fahrenheit");

     }
}