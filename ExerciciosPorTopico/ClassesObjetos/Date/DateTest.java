// Autor: Lucas Gabriel Fontes da Silva
// Propósito: instanciar objetos com diferentes argumentos e padronizar as saídas de datas

public class DateTest {

	public static void main (String[] args) {
	
		Date data1 = new Date(22, 6, 2005);
		Date data2 = new Date("Junho", 22, 2005);
		Date data3 = new Date(172, 2005);
	
		System.out.printf("Objeto construido no modelo (dia/mes/ano):\n\n");
		System.out.printf("%s\n", data1.getDataPadrao());
		System.out.printf("%s\n", data1.getDataExtenso());
		System.out.printf("%s\n\n", data1.getDataEmDias());
		
		
		System.out.printf("Objeto construido no modelo (mes em String dia, ano):\n\n");
		System.out.printf("%s\n", data2.getDataPadrao());
		System.out.printf("%s\n", data2.getDataExtenso());
		System.out.printf("%s\n\n", data2.getDataEmDias());

		System.out.printf("Objeto construido no modelo (dias ano):\n\n");
		System.out.printf("%s\n", data3.getDataPadrao());
		System.out.printf("%s\n", data3.getDataExtenso());
		System.out.printf("%s\n", data3.getDataEmDias());
	
	}
}