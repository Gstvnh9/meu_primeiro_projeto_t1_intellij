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

        System.out.println("Insira o número que você deseja dobrar:");
        int dobro = dobrar(entrada.nextInt());

        System.out.println("O dobro do número escolhido é: " + dobro);

    }

    public static int dobrar(int numero) {

        return numero * 2;

    }

}

