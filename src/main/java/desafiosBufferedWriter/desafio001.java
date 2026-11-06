package desafiosBufferedWriter;

import java.io.*;

public class desafio001 {

    static void main() {

        try {

            BufferedReader leitor = new BufferedReader (new FileReader("C:/Users/53188493851.SESISENAI/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter (new FileWriter("C:/Users/53188493851.SESISENAI/Documents/relatorio.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade,status");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];

                String criticidade;
                String status;

                if (sistema.contains("Linux")) {

                    criticidade = "Alta";
                    status = "Em Monitoramento";

                } else if (sistema.contains("Windows")) {

                    criticidade = "Baixa";
                    status = "Online";

                } else {

                    criticidade = "Indefinido";
                    status = "Indefinido";

                }

                escritor.write (

                        host + "," +
                                ip + "," +
                                sistema + "," +
                                criticidade + "," +
                                status

                );

                escritor.newLine();

            }

            leitor.close();
            escritor.close();

            System.out.println("O Relatório foi Gerado com Sucesso");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
}
