package manipulacaoDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class desafioFinal {

    static void main() {

        String arquivo = "C:/Users/53188493851/Downloads/ativos.csv";

        int ativosTotal = 0;
        int linux = 0;
        int windows = 0;
        int firewall = 0;

        try {

            BufferedReader leitor = new BufferedReader (new FileReader(arquivo));
            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];

                if (sistema.contains("Linux")) {

                    linux++;

                } else if (sistema.contains("Windows")) {

                    windows++;

                } else if (sistema.contains("Firewall")) {

                    firewall++;

                }

                ativosTotal++;

                System.out.println("Host: " + host);
                System.out.println("IP: " + ip);
                System.out.println("Sistema: " + sistema);
                System.out.println("===================");

            }

        } catch (IOException e) {

            System.out.println("O Windows não permitiu a leitura ou o Usuário não possui o arquivo!");

        }

        System.out.println("");
        System.out.println("================= Relatório ==================");
        System.out.println("Total de Ativos: " + (ativosTotal - 1));
        System.out.println("Quantidade de Ativos com WINDOWS: " + windows);
        System.out.println("Quantidade de Ativos com LINUX: " + linux);
        System.out.println("Quantidade de Ativos com FIREWALL: " + firewall);
        System.out.println("==============================================");

    }
}
