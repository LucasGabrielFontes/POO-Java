// Da mesma forma que o FileReader e o BufferedReader serviam para ler um arquivo, o FileWriter e o BufferedWriter servem para escrever no arquivo

// FileWriter: stream de escrita de caracteres em arquivos

// BufferedWriter é mais rápido

// Formas de instanciar um FileWriter: 
//
// 1) new FileWriter(path) -> Cria ou recria o arquivo
// 2) new FileWriter(path, true) -> Acrescenta ao final do arquivo

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    
    public static void main (String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good nigth"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(path, true))) { // O true no final faz com que ele apenas adicione ao final, e não destrua tudo que havia no arquivo

            for (String line: lines) {

                bufferedwriter.write(line);
                bufferedwriter.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}