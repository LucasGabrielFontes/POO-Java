import java.util.Scanner;

public class LitroPKm {
    public static void main (String[] args) {
	Scanner teclado = new Scanner (System.in);

	double km = 0.0, l = 0.0, kmTot = 0.0, kmPL = 0.0, lTot = 0.0;
	int viagens = 0;

	System.out.printf("Digite qualquer letra para iniciar a execução do programa ou 'N' para sair: ");
	String resp = teclado.nextLine();

	while (!resp.toUpperCase().equals("N")) {
	    viagens += 1;

	    System.out.printf("==== VIAGEM %d =====\n\n", viagens);
	    System.out.printf("Digite a quilometragem da viagem: ");
	    km = teclado.nextDouble();
	    kmTot += km;
	    System.out.printf("Digite a quantidade, em litros, de gasolina utilizada nessa viagem: ");
	    l = teclado.nextDouble();
	    teclado.nextLine();
	    lTot += l;
	    
	    kmPL = km/l;
	    System.out.printf("\n\nConsumo em Km/l da viagem %d: %.2f\n", viagens, kmPL);
	    kmPL = kmTot/lTot; 
	    System.out.printf("Média de consumo em km/l por viagem até a viagem %d: %.2f\n", viagens, kmPL);
	    System.out.printf("Quilômetros percorridos até a viagem %d: %.2f\n", viagens, kmTot);
	    System.out.printf("Quantidade de gasolina gasta até a viagem %d: %.2f\n\n", viagens, lTot);

	    System.out.printf("Deseja adicionar outra viagem? [S/N]: ");
	    resp = teclado.nextLine();
	}    
    }
}