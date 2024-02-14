// Classe que contém o método main para testar todas as classes criadas

public class PayrollSystemTest {
    
    public static void main (String[] args) {

        int mesAtual = 6;

        Employee employees[] = new Employee[4];

        employees[0] = new SalariedEmployee("Lucas", "Fontes", "11111", 22, 6, 2005, 2568.99);

        employees[1] = new HourlyEmployee("Vasco", "Gama", "101010", 21, 8, 1898, 100000, 5);

        employees[2] = new ComissionEmployee("Elvis", "Presley", "1000000", 8, 1, 1935, 500000, 0.5);

        employees[3] = new BasePlusComissionEmployee("Peter", "Jordan", "0000000", 1, 1, 0, 450236, 0.1, 250000);

        System.out.println("Folha de pagamento:\n\n");

        for (Employee currentEmployee: employees) {

            System.out.printf("%s\n\n", currentEmployee);

            if (currentEmployee.getMesAniversario() == mesAtual) {
                System.out.printf("Parabéns, %s! Como estamos no mês do seu aniversário, você ganhou um bônus de R$100,00. Total de ganhos: R$%.2f\n\n", currentEmployee.getNome(), currentEmployee.ganhos() + 100);
            }

        }

    }

}