package manipulacaoDeArquivos;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;

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
    }

}
