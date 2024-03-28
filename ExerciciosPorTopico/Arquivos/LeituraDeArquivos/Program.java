import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // O objeto de File encapsula o processo de acessar o arquivo
        File file = new File("c:\\temp\\in.txt"); // É necessário que seja \\, pois apenas o \ é prefixo de caractere especial

        Scanner scanner = null;

        try { // É possível que haja o lançamento de uma exceção, por isso é bom colocar em bloco try
            scanner = new Scanner(file); // Em vez do System.in, é colocado o arquivo que você deseja ler ou escrever

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); // Imprime todas as linhas do arquivos
            }

        } catch (IOException e) {

            System.out.printf("Error: %s\n", e.getMessage());

        } finally { // Utilizamos o bloco finally para liberar recursos

            if (scanner != null) { // Se for null, haverá uma exceção
                scanner.close();
            }

        }

    }

}