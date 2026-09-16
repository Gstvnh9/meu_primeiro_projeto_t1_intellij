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

        int item = 1;
        String nome;

        while (item < 15) {

            item++;
            System.out.println("Indique o nome do produto número " + item + ":");
            nome = entrada.nextLine();

            System.out.println(nome + " conferido e registrado!");
        }

        System.out.println("Foram registrados " + item + " Produtos!");
    }
}