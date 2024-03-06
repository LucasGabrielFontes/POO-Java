import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 10:");
        int num = input.nextInt();

        assert (num >= 0 && num <= 10) : "Bad number" + num;

        System.out.println("Você digitou: " + num);

    }
 
}