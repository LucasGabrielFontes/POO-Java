public class Date {
    // Atributos
    int dia;
    int mes;
    int ano;

    // Método construtor
    public Date (int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
    }

    // Métodos getters e setters
    public int getDia () {
	return dia;
    }     

    public void setDia (int dia) {
	this.dia = dia;
    }

    public int getMes () {
	return mes;
    }

    public void setMes (int mes) {
	this.mes = mes;
    }

    public int getAno () {
	return ano;
    }

    public void setAno (int ano) {
	this.ano = ano;
    }

    // Método principal
    public String displayDate () {
	return String.format("%02d/%02d/%d", this.getDia(), this.getMes(), this.getAno());
    }
}