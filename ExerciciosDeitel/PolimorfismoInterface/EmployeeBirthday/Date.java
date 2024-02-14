// A classe Date servirá para armazenar a data de aniversário do Employee

public class Date {

    // Variáveis de instância
    private final int dia;
    private final int mes;
    private final int ano;

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Método construtor
    public Date (int dia, int mes, int ano) {

        // Valida o mês
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mês deve estar no intervalo [1, 12]");
        }

        // Valida o dia
        if (dia < 1 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("O dia deve estar no intervalo [1, " + diasPorMes[mes] + "]");
        }

        // Valida o dia se o ano for bissexto
        if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
            throw new IllegalArgumentException("O dia deve estar no intervalo [1, " + diasPorMes[mes] + "]");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    // Método toString
    @Override
    public String toString () {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    // Métodos get
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}