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

         System.out.println("============================");
         System.out.println("      Lista de cargos:      ");
         System.out.println("============================");
         System.out.println("       Admnistrativos:      ");
         System.out.println("- Assistente");
         System.out.println("============================");
         System.out.println("         Liderança          ");
         System.out.println("- Gerente");
         System.out.println("============================");
         System.out.println("        Operacional         ");
         System.out.println("- Engenheiro");
         System.out.println("============================");
         System.out.println("Nos indique o seu cargo na empresa:");
         String cargo = entrada.nextLine();

         if (cargo.equalsIgnoreCase ("ASSISTENTE")){
             System.out.println("Você possui direito ao curso de Idiomas!");
         } else if (cargo.equalsIgnoreCase ("GERENTE")){
             System.out.println("Você possui direito ao curso de Idiomas!");
         } else if (cargo.equalsIgnoreCase ("ENGENHEIRO")) {
             System.out.println("Você não possui direito ao curso de Idiomas!");
         } else {
             System.out.println("Esse cargo não existe em nossa empresa.");
         }
     }
}