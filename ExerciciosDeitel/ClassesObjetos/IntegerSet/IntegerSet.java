public class IntegerSet {

	// Atributos
	private boolean[] valores = new boolean[101];

	// Métodos contrutores sobrecarregados
	public IntegerSet () {
		for (int i = 0; i < 101; i++) {
			valores[i] = false;
		}
	}	
	
	public IntegerSet (int... a) { // Isso é muito bom! Quando você não sabe a quantidade exata de argumentos que serão passadas para o método. A variável é tratada como um vetor.
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] < 0 || a[i] > 100) {
				throw new IllegalArgumentException("invalid value in constructor! Values must be in [0, 100]");
			} else {
				this.valores[a[i]] = true;
			}

		}
	}
	
	// Métodos get e set
	public boolean getElement (int i) {
		
		if (i < 0 || i > 100) {
			throw new IllegalArgumentException("value must be in [0, 100]");
		}
		
		return valores[i];
	}
	
	public void setElement (int i) {
		
		if (i < 0 || i > 100) {
			throw new IllegalArgumentException("value must be in [0, 100]");
		}
		
		valores[i] = true;
	}

	// Métodos principais
	public static IntegerSet union (IntegerSet a, IntegerSet b) {
		
		IntegerSet c = new IntegerSet();
		
		for (int i = 0; i < 101; i++) {
			
			if (a.getElement(i) || b.getElement(i)) {
				c.setElement(i);
			}
			
		}
		
		return c;
		
	}
	
	public static IntegerSet intersection (IntegerSet a, IntegerSet b) {
		
		IntegerSet c = new IntegerSet();
		
		for (int i = 0; i < 101; i++) {
			
			if (a.getElement(i) && b.getElement(i)) {
				c.setElement(i);
			}
			
		}
		
		return c;
		
	}
	
	public void insertElement (int i) {
		
		this.setElement(i);
		
	}
	
	public void deleteElement (int i) {
		
		if (i <  0 || i > 100) {
			
			throw new IllegalArgumentException("value must be in [0, 100]");
			
		}
		
		this.valores[i] = false;
		
	}
	
	public static boolean isEqualTo (IntegerSet a, IntegerSet b) {
	
		for (int i = 0; i < 101; i++) {
			
			if (a.getElement(i) != b.getElement(i)) {
				return false;
			}
			
		}
		
		return true;
	
	}
	
	// Método toString
	public String toString() {
	
		String conjunto = "{";
		int maior = 0;
	
		for (int i = 0; i < 101; i++) {
			
			if (this.getElement(i)) {
				
				maior = i;
				
			}
			
		}
		
		for (int i = 0; i < 101; i++) {
			
			if (this.getElement(i)) {
				
				if (i < maior) {
					
					conjunto += i + ", ";
					
				} else {
					
					conjunto += i + "}";
					
				}
				
			}
			
		}
		
		if (conjunto.equals("{")) {
			return "conjunto vazio";
		} else {
			return conjunto;
		}

	}
}