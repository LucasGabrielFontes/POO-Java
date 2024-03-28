public class Main {

	public static void main (String[] args) {

		BasePlusComissionEmployee employee = new BasePlusComissionEmployee("Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);

		System.out.printf("Employee information obtained by get methods:\n\n");
		System.out.printf("First name: %s\n", employee.getFirstName());
		System.out.printf("Last name: %s\n", employee.getLastName());
		System.out.printf("Social security number: %s\n", employee.getSocialSecurityNumber());
		System.out.printf("Gross sales: %.2f\n", employee.getGrossSales());
		System.out.printf("Comission rate: %.2f\n", employee.getComissionRate());
		System.out.printf("Base salary: %.2f\n\n\n", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("Updated employee information obtained by toString:\n\n");
		System.out.printf("%s\n", employee.toString());
		
	}

}