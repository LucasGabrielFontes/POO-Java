import java.util.Scanner;
import java.io.File;

public class Program {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // Ignora o caminho e mostra o nome
        System.out.println("getParent: " + path.getParent()); // Ignora o nome e mostra o caminho
        System.out.println("getPath: " + path.getPath()); // Mostra todo o caminho

        scanner.close();

    }

}