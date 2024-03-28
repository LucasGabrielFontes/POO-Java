import java.util.Scanner;

public class DateTest {
    public static void main (String[] args) {
	Scanner teclado = new Scanner(System.in);	

	System.out.printf("Digite o dia: ");
	int dia = teclado.nextInt();
	System.out.printf("Digite o mes: ");
	int mes = teclado.nextInt();
	System.out.printf("Digite o ano: ");
	int ano = teclado.nextInt();

	Date date = new Date(dia, mes, ano);

	System.out.printf("Data formatada: %s", date.displayDate());
    }
}
