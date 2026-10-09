package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    private static void somarValores() {

        int a = 23;
        int b = 9;
        System.out.println(a+b);

    }

    private static void somarValoresComParametro(int a, int b) {

        System.out.println(a+b);

    }

    static void main() {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        somarValores();
        somarValoresComParametro(56,36);
        System.out.println(subtracacaoValores(60, 20));
        mostrarMensagem();
        System.out.println(exibirMsg("Que venha o feriado!"));

        int soma = funcaoComParametrosComRetorno(2, 2);
        System.out.println("Retorno da Função: " + soma);

    }

    static int funcaoComParametrosComRetorno(int parametro1, int parametro2) {

        return parametro1 + parametro2;

    }

    public static void mostrarMensagem(){

        System.out.println("Minha Msg!");

    }

    private static String exibirMsg (String text) {

        return text;

    }

    public static int subtracacaoValores(int c, int d){

        return c-d;

    }
}
