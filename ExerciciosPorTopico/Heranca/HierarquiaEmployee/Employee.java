public class Employee {

	// Variáveis de instância
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// Método construtor
	public Employee (String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// Métodos get
	public String getFirstName () {
		return firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public String getSocialSecurityNumber () {
		return socialSecurityNumber;
	}
	
	// Método toString
	public String toString () {
		return String.format("Employee: %s %s\nSocial Security Number: %s\n", 
		getFirstName(), getLastName(),
		getSocialSecurityNumber());
	}

}