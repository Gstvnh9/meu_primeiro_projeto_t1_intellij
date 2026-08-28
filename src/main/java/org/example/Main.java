package org.example;

public class Main {
     static void main() {

         float varF = 2.7f;

         long varL = (long) varF;

         //              ^ casting explícito

         double varD = varL; // casting implícito



         System.out.println("Valor do float: " + varF);

         System.out.println("Valor do long: " + varL);

         System.out.println("Valor do double: " + varD);

     }
}
