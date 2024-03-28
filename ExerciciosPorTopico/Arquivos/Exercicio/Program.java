import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main (String[] args) {

        String pathIn = "C:\\temp\\Ex01\\Entrada\\in.csv";

        String pathOut = "C:\\temp\\Ex01\\Saida\\out.csv";

        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(pathIn)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut))) {

            String line = bufferedreader.readLine();

            while (line != null) {

                String[] linhaSeparada = line.split(",");

                bufferedWriter.write(linhaSeparada[0] + ": " + (Double.parseDouble(linhaSeparada[1]) * Double.parseDouble(linhaSeparada[2])));
                bufferedWriter.newLine();

                line = bufferedreader.readLine();

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}