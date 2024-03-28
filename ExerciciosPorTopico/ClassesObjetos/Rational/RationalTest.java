public class RationalTest {

	public static void main (String[] args) {
		
		Rational a = new Rational(2, 4);
		Rational b = new Rational(5, 7);
		
		System.out.printf("Numero a em forma de fração: %s\n", a.getNumeroComBarra());
		System.out.printf("Numero b em forma de fração: %s\n\n", b.getNumeroComBarra());

		System.out.println("Numero a em forma decimal: " + a.getNumeroComVirgula());
		System.out.println("Numero b em forma decimal: " + b.getNumeroComVirgula());

		System.out.printf("Soma entre a e b: %s\n\n", Rational.somaRacional(a, b));
	
		System.out.printf("Subtração entre a e b: %s\n\n", Rational.subtraiRacional(a, b));
	
		System.out.printf("Multipicação entre a e b: %s\n\n", Rational.multiplicaRacional(a, b));
		
		System.out.printf("Divisão entre a e b: %s\n\n", Rational.divideRacional(a, b));
		
	}

}