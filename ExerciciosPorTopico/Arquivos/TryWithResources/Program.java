// O bloco try-with-resources é um bloco try que declara um ou mais recursos e garante que esses recursos serão fechados ao final do bloco (não precisa fazer o fechamento manual)
    
// Declaração de streams não são necessárias

// É LINDO!

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main (String[] args) {

        String path = "C:\\temp\\in.txt";

        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(path))) { // A declaração dos recursos é feita assimn
            
            String line = bufferedreader.readLine(); // Lê uma linha do arquivo (se estiver no final, retorna null)

            while (line != null) {
                System.out.printf("%s\n", line);
                line = bufferedreader.readLine();
            }

        } catch (IOException e) {

            System.out.printf("Error: %s\n", e.getMessage());

        }

    }

}