import java.util.Scanner;

public class ChecagemDeCredito {
    public static void main (String[] args) {
	String resp = "";
	do {
	    Scanner teclado = new Scanner(System.in);	

	    System.out.printf("Digite o número da sua conta: ");
	    int numConta = teclado.nextInt();

	    System.out.printf("Digite o seu saldo inicial no mês: ");
	    int saldoInicial = teclado.nextInt();

	    System.out.printf("Digite o valor total de sua despesa: ");
	    int despesas = teclado.nextInt();

	    System.out.printf("Digite o total de créditos aplicados a você nesse mês: ");
	    int creditosAplicados = teclado.nextInt();

	    System.out.printf("Digite o total de créditos autorizados a você esse mês: ");
	    int creditosAutorizados = teclado.nextInt();
	    teclado.nextLine();

	    Cliente cliente = new Cliente (numConta, saldoInicial, despesas, creditosAplicados, creditosAutorizados);	    
	
	    int nSaldo = cliente.calculaNovoSaldo();

	    System.out.printf("Novo saldo: %d\n", nSaldo);	

	    if (!cliente.verificaCredito(nSaldo)) {
		System.out.printf("Limite de crédito excedido!\n\n");
	    } else {
	        System.out.printf("Limite de crédito não excedido!\n\n");
	    }

	    System.out.printf("Deseja verificar a situação de mais algum cliente? [S/N]: ");
	    resp = teclado.nextLine();
	} while (resp.toUpperCase().equals("S"));
    } 
}