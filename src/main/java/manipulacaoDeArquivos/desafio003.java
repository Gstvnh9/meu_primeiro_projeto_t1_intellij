package manipulacaoDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class desafio003 {

    static void main() {

        String arquivo = "C:/Users/53188493851/Downloads/ativos.csv";

        try {

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];

                if (sistema.contains("Linux")) {

                    System.out.println("Host: " + host);
                    System.out.println("IP: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("===================");

                }

            }

        } catch (IOException e) {

            System.out.println("O Windows não permitiu a leitura ou o Usuário não possui o arquivo!");

        }
    }
}
