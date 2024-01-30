public class Date {
	
	// Atributos
	private int dia;
	private int mes;
	private int ano;
	meses smes;
	
	// Métodos contrutores sobrecarregados
	public Date (int dia, int mes, int ano) {
		
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("dia deve estar no intervalo [1, 31]");
		}
		
		if (mes < 0 || mes > 12) {
			throw new IllegalArgumentException("mês deve estar no intervalo [1, 12]");
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		switch (mes) {
		
			case 1:
				smes = meses.Jan;
			break;
			
			case 2:
				smes = meses.Fev;
			break;
			
			case 3:
				smes = meses.Mar;
			break;
			
			case 4:
				smes = meses.Abr;
			break;
			
			case 5:
				smes = meses.Mai;
			break;
			
			case 6:
				smes = meses.Jun;
			break;
			
			case 7:
				smes = meses.Jul;
			break;
			
			case 8:
				smes = meses.Ago;
			break;
			
			case 9:
				smes = meses.Set;
			break;
			
			case 10:
				smes = meses.Out;
			break;
			
			case 11:
				smes = meses.Nov;
			break;
			
			case 12:
				smes = meses.Dez;
			break;
		
		}
	}
	
	public Date (String mes, int dia, int ano) {
		
		int intmes = 0;
		
		if (mes.toUpperCase().equals("JANEIRO")) {
			intmes = 1;
			smes = meses.Jan;
		} else if (mes.toUpperCase().equals("FEVEREIRO")) {
			intmes = 2;
			smes = meses.Fev;
		} else if (mes.toUpperCase().equals("MARÇO")) {
			intmes = 3;
			smes = meses.Mar;
		} else if (mes.toUpperCase().equals("ABRIL")) {
			intmes = 4;
			smes = meses.Abr;
		} else if (mes.toUpperCase().equals("MAIO")) {
			intmes = 5;
			smes = meses.Mai;
		} else if (mes.toUpperCase().equals("JUNHO")) {
			intmes = 6;
			smes = meses.Jun;
		} else if (mes.toUpperCase().equals("JULHO")) {
			intmes = 7;
			smes = meses.Jul;
		} else if (mes.toUpperCase().equals("AGOSTO")) {
			intmes = 8;
			smes = meses.Ago;
		} else if (mes.toUpperCase().equals("SETEMBRO")) {
			intmes = 9;
			smes = meses.Set;
		} else if (mes.toUpperCase().equals("OUTUBRO")) {
			intmes = 10;
			smes = meses.Out;
		} else if (mes.toUpperCase().equals("NOVEMBRO")) {
			intmes = 11;
			smes = meses.Nov;
		} else if (mes.toUpperCase().equals("DEZEMBRO")) {
			intmes = 12;
			smes = meses.Dez;
		} else {
			intmes = 13;
		}
		
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("dia deve estar no intervalo [1, 31]");
		}
		
		if (intmes < 1 || intmes > 12) {
			throw new IllegalArgumentException("mês inválido");
		}
		
		this.dia = dia;
		this.mes = intmes;
		this.ano = ano;
		
	}
	
	public Date (int dias, int ano) {
		
		if (dias > 366) {
			throw new IllegalArgumentException("limite de dias excedido");
		}
		
		if (dias < 1) {
			throw new IllegalArgumentException("dia inválido");
		}
		
		int dia = dias % 30;
		int mes = 0;
		
		for (; dias > 0; dias -= 30) {
			mes += 1;
		}
		
		switch (mes) {
		
			case 1:
				smes = meses.Jan;
			break;
			
			case 2:
				smes = meses.Fev;
			break;
			
			case 3:
				smes = meses.Mar;
			break;
			
			case 4:
				smes = meses.Abr;
			break;
			
			case 5:
				smes = meses.Mai;
			break;
			
			case 6:
				smes = meses.Jun;
			break;
			
			case 7:
				smes = meses.Jul;
			break;
			
			case 8:
				smes = meses.Ago;
			break;
			
			case 9:
				smes = meses.Set;
			break;
			
			case 10:
				smes = meses.Out;
			break;
			
			case 11:
				smes = meses.Nov;
			break;
			
			case 12:
				smes = meses.Dez;
			break;
		
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	// Enum
	public enum meses {
		
		Jan ("Janeiro"),
		Fev ("Fevereiro"),
		Mar ("Março"),
		Abr ("Abril"),
		Mai ("Maio"),
		Jun ("Junho"),
		Jul ("Julho"),
		Ago ("Agosto"),
		Set ("Setembro"),
		Out ("Outubro"),
		Nov ("Novembro"),
		Dez ("Dezembro");
	
		private final String smes; 
	
		meses (String smes) {
			this.smes = smes;
		}
		
		public String getMes() {
			return this.smes;
		}
		
	}
	
	// Métodos mostradores de data
	public String getDataPadrao () {
		
		String data = "";
		
		data += String.format("%02d", this.dia);
		data += "/";
		data += String.format("%02d", this.mes);
		data += "/";
		data += this.ano;
		
		return data;
		
	}
	
	public String getDataExtenso () {
		
		String data = "";
		
		data += this.smes.getMes();
		data += " ";
		data += this.dia;
		data += ", ";
		data += this.ano;
		
		return data;
	}
	
	public String getDataEmDias () {
		
		int dias = (this.mes - 1)*30 + this.dia;
		
		String data = "";
		
		data += String.format("%03d ", dias);
		data += this.ano;
		
		return data;
		
	}
	
}