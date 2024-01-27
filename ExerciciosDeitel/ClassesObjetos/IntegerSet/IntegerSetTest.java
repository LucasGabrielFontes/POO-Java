// Autor: Lucas Gabriel Fontes da Silva
// Propósito: treinar conceitos de classes e objetos. Faça seus testes!

public class IntegerSetTest {

	public static void main (String[] args) {
	
		IntegerSet A = new IntegerSet();
		IntegerSet B = new IntegerSet(0, 1, 2, 3, 4, 5, 50, 59, 100);
		IntegerSet C = new IntegerSet(0, 1, 2, 3, 4, 5, 50, 59);
	
		IntegerSet intersectionBC = IntegerSet.intersection(B, C);
		IntegerSet unionBC = IntegerSet.union(B, C);
	
		System.out.printf("Conjunto A: %s\n", A);
		System.out.printf("Conjunto B: %s\n", B);
		System.out.printf("Conjunto C: %s\n\n", C);
		System.out.printf("B é igual a C: %b\n\n", IntegerSet.isEqualTo(B, C));
		System.out.printf("Interseção entre B e C: %s\n\n", intersectionBC);
		System.out.printf("União entre B e C: %s\n\n", unionBC);
		
		B.deleteElement(100);
		
		System.out.printf("Conjunto B após o número 100 ser retirado: %s\n\n", B);
		System.out.printf("Após a modificação, B e C são iguais: %b\n\n", IntegerSet.isEqualTo(B, C));
	
		C.insertElement(100);
		
		System.out.printf("Conjunto C após o valor 100 ser adicionado: %s\n\n", C);
		
		IntegerSet intersectionAC = IntegerSet.intersection(A, C);
		
		System.out.printf("Interseção entre o conjunto A e C: %s\n\n", intersectionAC);
	
	}

}