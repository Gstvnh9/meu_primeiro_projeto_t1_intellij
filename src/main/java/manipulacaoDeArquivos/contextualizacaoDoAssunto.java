package manipulacaoDeArquivos;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class contextualizacaoDoAssunto {

    static void main() {

        File arquivo = new File("teste.txt");
        File novoArquivo = new File("arquivoLegal.txt");

        if (arquivo.exists()) {

            System.out.println("Arquivo já existe");

        } else {

            try {

                if (arquivo.createNewFile()) {

                    System.out.println("Criado com sucesso");

                } else {

                    System.out.println("Deu ruim!");

                }

            } catch (IOException e) {

                System.out.println("Windows não deixou :(");

            }

        }

        try {

            FileWriter escritor = new FileWriter("teste.txt", false);

            escritor.write("Gustavo");
            System.out.println("Frase escrita com sucesso!");
            escritor.close();

        } catch (IOException e) {

            System.out.println("Windows não deixou escrever :(");

        }

        if (novoArquivo.exists()) {

            try {

                System.out.println("Arquivo encontrado");
                FileReader leitor = new FileReader("arquivoLegal.txt");
                int letra;

                while ((letra = leitor.read()) != -1) {

                    System.out.print((char) letra);

                }

                leitor.close();

            } catch (IOException e) {

                System.out.println("Windows não deixou ler :(");

            }

        } else {

            System.out.println("Arquivo não encontrado");

        }

        System.out.println("" + "\n");
        testePratico();

        System.out.println("" + "\n");
        bufferedWriter();

    }

    static void testePratico(){

        String arquivo = "C://Users//53188493851//Downloads//ativos.csv";

        try {

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];

                System.out.println("Host: " + host);
                System.out.println("IP: " + ip);
                System.out.println("Sistema: " + sistema);
                System.out.println("===================");

            }

        } catch (IOException e){

            System.out.println("O windows não permitiu a leitura :(");

        }

    }

    static void bufferedWriter() {

        try {

            BufferedReader leitor = new BufferedReader (new FileReader("C:/Users/53188493851.SESISENAI/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter (new FileWriter("C:/Users/53188493851.SESISENAI/Documents/relatorio.csv"));

            String linha = leitor.readLine();

            escritor.write(linha + ",criticidade");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];

                String criticidade;

                if (sistema.contains("Linux")) {

                    criticidade = "Alta";

                } else {

                    criticidade = "Baixa";

                }

                escritor.write (

                        host + "," +
                                ip + "," +
                                sistema + "," +
                                criticidade

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
