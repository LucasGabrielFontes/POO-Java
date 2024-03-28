public class Rational {
	
	// Atributos
	private int numerador;
	private int denominador;
	
	
	// Métodos construtores sobrecarregados
	public Rational (int numerador, int denominador) {
		
		int a = numerador;
		int b = denominador;
		
		while (b != 0) {
			int c = b;
			b = a%b;
			a = c;
		}
		
		this.numerador = numerador/a;
		this.denominador = denominador/a;
		
	}
	
	public Rational () {
		this.numerador = 1;
		this.numerador = 1;
	}
	
	// Métodos get e set
	public String getNumeroComBarra () {
		String numero = numerador + "/" + denominador;
		return numero;
	}
	
	public double getNumeroComVirgula () {
		return numerador/denominador;
	}
	
	public int getNumerador () {
		return numerador;
	}
	
	public void setNumerador (int numerador) {
		this.numerador = numerador;
	}
	
	public int getDenominador () {
		return denominador;
	}
	
	public void setDenominador (int denominador) {
		this.denominador = denominador;
	}		
	
	// Métodos principais
	public static int calculaMdc (int a, int b) {
		
		while (b != 0) {
			int c = b;
			b = a%b;
			a = c;
		}
		
		return a;
		
	}
	
	public static String somaRacional (Rational a, Rational b) {
		
		int numRes = (a.getNumerador() * b.getDenominador()) + (a.getDenominador() * b.getNumerador());
		int denRes = a.getDenominador() * b.getDenominador();
		int mdc = calculaMdc(numRes, denRes);
		
		numRes /= mdc;
		denRes /= mdc;
		
		String resultado = numRes + "/" + denRes;
		
		return resultado;
		
	}
	
	public static String subtraiRacional (Rational a, Rational b) {
		
		int numRes = (a.getNumerador() * b.getDenominador()) - (a.getDenominador() * b.getNumerador());
		int denRes = a.getDenominador() * b.getDenominador();
		int mdc = calculaMdc(numRes, denRes);
		
		numRes /= mdc;
		denRes /= mdc;
		
		String resultado = numRes + "/" + denRes;
		
		return resultado;
		
	}
	
	public static String multiplicaRacional (Rational a, Rational b) {
		
		int numRes = a.getNumerador() * b.getNumerador();
		int denRes = a.getDenominador() * b.getDenominador();
		int mdc = calculaMdc(numRes, denRes);
		
		numRes /= mdc;
		denRes /= mdc;
		
		String resultado = numRes + "/" + denRes;
		
		return resultado;
		
	}
	
	public static String divideRacional (Rational a, Rational b) {
		
		int numRes = a.getNumerador() * b.getDenominador();
		int denRes = a.getDenominador() * b.getNumerador();
		int mdc = calculaMdc(numRes, denRes);
		
		numRes /= mdc;
		denRes /= mdc;
		
		String resultado = numRes + "/" + denRes;
		
		return resultado;
		
	}
	
}