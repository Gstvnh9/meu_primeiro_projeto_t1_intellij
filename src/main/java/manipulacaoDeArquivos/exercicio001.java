package manipulacaoDeArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercicio001 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        File arquivoAlunos = new File("alunos.txt");

        if (arquivoAlunos.exists()) {

            System.out.println("O arquivo já existe!");

        } else {

            try {

                if (arquivoAlunos.createNewFile()) {

                    System.out.println("Arquivo criado com sucesso!");

                } else {

                    System.out.println("Houve um erro na tentativa de criar seu arquivo!");

                }

            } catch (IOException e) {

                System.out.println("O Windows não permitiu a criação de um novo arquivo :(");

            }

        }

        try (FileWriter escritorAlunos = new FileWriter("alunos.txt", false)) {

            for (int i = 1; i <= 5; i++) {

                System.out.println("Escreva o nome do " + i + "° aluno:");
                escritorAlunos.write(entrada.nextLine() + "\n");
                System.out.println("Nome registrado com Sucesso!");

            }

        } catch (IOException e) {

            System.out.println("O Windows não permitiu a escrita :(");

        }

    }

}
