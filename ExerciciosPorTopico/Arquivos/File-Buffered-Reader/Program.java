// FileReader: stream (sequência) de leitura de caracteres a partir de arquivos. Você estabelece um sequência a ser executada

// BufferedReader: é instaciado a partir de FileReader. É mais otimizado.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main (String[] args) {

        String path = "C:\\temp\\in.txt";

        FileReader filereader = null;
        BufferedReader bufferedreader = null;

        try {

            filereader = new FileReader(path); // Estabelecendo uma sequência de leitura a partir do arquivo que está no caminho

            bufferedreader = new BufferedReader(filereader); // BufferedReader é instaciado a partir de FileReader
            
            String line = bufferedreader.readLine(); // Lê uma linha do arquivo (se estiver no final, retorna null)

            while (line != null) {
                System.out.printf("%s\n", line);
                line = bufferedreader.readLine();
            }

        } catch (IOException e) {

            System.out.printf("Error: %s\n", e.getMessage());

        } finally {
            
            try {

                if (bufferedreader != null) {
                    bufferedreader.close();
                }
    
                if (filereader != null) {
                    filereader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}