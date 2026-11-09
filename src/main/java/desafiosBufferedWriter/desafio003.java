package desafiosBufferedWriter;

import java.io.*;

public class desafio003 {

    static void main() {

        try {

            File relatorioCriticidadeAlta = new File ("C:/Users/53188493851/Downloads/relatorioCriticidadeAlta.csv");

            if (relatorioCriticidadeAlta.exists()) {

                System.out.println("O Relatório de Criticidade Alta já Existe!");

            } else {

                try {

                    if (relatorioCriticidadeAlta.createNewFile()) {

                        System.out.println("O Relatório de Criticidade Alta Foi Criado com Sucesso!");

                    } else {

                        System.out.println("Ocorreu um erro!");

                    }

                } catch (IOException e) {

                    System.out.println("Erro: " + e.getMessage());

                }

            }

            BufferedReader leitor = new BufferedReader (new FileReader("C:/Users/53188493851/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter (new FileWriter("C:/Users/53188493851/Documents/relatorio.csv"));
            BufferedWriter escritor2 = new BufferedWriter (new FileWriter("C:/Users/53188493851/Downloads/relatorioCriticidadeAlta.csv"));

            String linha = leitor.readLine();
            int contadorWindows = 0;
            int contadorLinux = 0;
            int contadorMacOS = 0;

            escritor.write(linha + ",criticidade,status");
            escritor.newLine();

            escritor2.write(linha + ",criticidade,status");
            escritor2.newLine();

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
                    contadorLinux++;

                } else if (sistema.contains("Windows")) {

                    criticidade = "Baixa";
                    status = "Online";
                    contadorWindows++;

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

                if (criticidade.contains("Alta")) {

                    escritor2.write (

                            host + "," +
                                    ip + "," +
                                    sistema + "," +
                                    criticidade + "," +
                                    status

                    );

                    escritor2.newLine();

                }

            }

            leitor.close();
            escritor.close();
            escritor2.close();

            System.out.println("O Relatório foi Gerado com Sucesso");

            System.out.println("=== Contagem de Sistemas Operacionais ===");
            System.out.println("Windows: " + contadorWindows);
            System.out.println("Linux: " + contadorLinux);
            System.out.println("MacOS: " + contadorMacOS);
            System.out.println("=========================================");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
}
