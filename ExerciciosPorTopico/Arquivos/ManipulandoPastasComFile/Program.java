import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath); // Uma variável do tipo File pode ser um caminho de um arquivo ou um caminho de uma pasta. Nesse caso, é uma pasta

        File[] folders = path.listFiles(File::isDirectory); // Cria um vetor de Files com todos as pastas do caminho

        System.out.println("Folders:\n");

        for (File folder: folders) {

            System.out.println(folder.getName());

        }   

        File[] files = path.listFiles(File::isFile);

        System.out.println("\nFiles:\n");

        for (File file: files) {

            System.out.println(file.getName());

        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created succsessfully: " + success);

        scanner.close();

    }

}