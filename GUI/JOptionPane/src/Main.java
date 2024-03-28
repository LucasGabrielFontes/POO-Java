import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Retorna uma String
        String s1 = JOptionPane.showInputDialog("Insira o primeiro número:");
        String s2 = JOptionPane.showInputDialog("Insira o segundo número:");

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        int soma = n1+n2;

        // null faz a caixa de diálogo ser exibida no centro da tela. A mensagem a ser exibida é
        // o segundo argumento. O terceiro argumento é o título da caixa de diálogo. O quarto
        // argumento é o tipo de caixa de diálogo a ser exibida: PLAIN.MESSAGE não exibe um ícone
        // à esquerda da imagem.
        JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " e " +
                n2 + " é: " + soma, "Soma de dois " +
                "inteiros", JOptionPane.PLAIN_MESSAGE);
        // ERROR_MESSAGE
        // INFORMATION_MESSAGE
        // WARNING_MESSAGE
        // QUESTION_MESSAGE

    }
}