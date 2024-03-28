import java.util.Scanner;

public class InvoiceTest {
    public static void main (String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.printf("Digite o numero de indentificação do produto: ");
	String numero = teclado.nextLine();
	System.out.printf("Digite a descrição do produto: ");
	String descricao = teclado.nextLine();
	System.out.printf("Digite a quantidade de %s comprada: ", descricao);
	int quantidade = teclado.nextInt();
	System.out.printf("Digite o preço da unidade de %s: ", descricao);
	double preco = teclado.nextDouble();

	Invoice invoice1 = new Invoice (numero, descricao, quantidade, preco);

	System.out.printf("Incoice: %.2f\n", invoice1.getInvoiceAmount());
    }
}