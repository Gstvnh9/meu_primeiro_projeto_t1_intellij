package manipulacaoDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class desafio002 {

    static void main() {

        String arquivo = "C:/Users/53188493851/Downloads/ativos.csv";
        int contador = 0;

        try {

            BufferedReader leitor = new BufferedReader (new FileReader(arquivo));
            String linha;

            while ((linha = leitor.readLine()) != null) {

                contador++;

            }

        } catch (IOException e) {

            System.out.println("O Windows não permitiu a leitura ou o Usuário não possui o arquivo!");

        }

        System.out.println("O arquivo 'ativos.csv' conta com " + (contador - 1) + " registros no total");

    }
}
