// Programa de teste. Trataremos os objetos polimorficamente

public class PayableInterfaceTest {
    
    public static void main (String[] args) {

        // Declaração de um array do tipo de interface Payable
        Payable[] payableObjects = new Payable[4];

        // Inicializa o vetor com objetos que são, por meio da relação com a interface, Payables
        payableObjects[0] = new Invoice("12345", "bateria", 10, 150.65);
        payableObjects[1] = new Invoice("54321", "carregador", 11, 65.99);
        payableObjects[2] = new SalariedEmployee("Lucas", "Fontes", "1-22-333", 1226.7);
        payableObjects[3] = new SalariedEmployee("Elvis", "Presley", "0-33-444", 10002.6);

        System.out.printf("Faturas e empregados processados polimorficamente:\n\n");

        // Processa, polimorficamente, os objetos do vetor com o for aprimorado
        for (Payable currentPayable: payableObjects) {
            
            System.out.printf("%s\nPagamento a ser feito: %.2f\n\n", currentPayable, currentPayable.getPaymentAmount());

        }

    }

}