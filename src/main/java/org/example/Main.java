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

         System.out.println("Você utiliza veículo próprio para trabalhar?");
         System.out.println("Responda com 'SIM' ou 'NÃO':");
         String resposta = entrada.nextLine();

         if(resposta.equalsIgnoreCase("SIM")){
             System.out.println("Você pode solicitar auxilio combustível!");
         } else {
             System.out.println("Você não possui direito ao benefício!");
         }

     }
}