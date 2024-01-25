public class Time {

	// Atributo
	private int segundos;
	
	// Métodos construtores sobrecarregados
	public Time (int horas, int minutos, int segundos) {
		if (horas < 0 || horas >= 24) {
			throw new IllegalArgumentException("as horas devem estar no intevalo [0, 24[");
		}
		
		if (minutos < 0 || minutos >= 60) {
			throw new IllegalArgumentException("os minutos devem estar no intevalo [0, 60[");
		}
		
		if (segundos < 0 || segundos >= 60) {
			throw new IllegalArgumentException("os segundos devem estar no intevalo [0,60[");
		}
		
		this.segundos = (horas*3600) + (minutos*60) + segundos;
	}
	
	public Time () {
		this(0, 0, 0);
	}
	
	public Time (int horas) {
		this(horas, 0, 0);
	}
	
	public Time (int horas, int minutos) {
		this(horas, minutos, 0);
	}

	public Time (Time time) {
		this(0, 0, time.getSegundos());
	}
	
	// Métodos get e set
	public int getSegundos() {
		return segundos;
	}
	
	public void setSegundos(int segundos) {
		if (segundos < 0 || segundos > 86400) {
			throw new IllegalArgumentException("quantidade de horas excedeu 24h.");
		}
		
		this.segundos = segundos;
	}
	
	// Métodos toString
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.segundos/3600, (this.segundos%3600)/60, (this.segundos%3600)%60);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", (this.segundos/3600 == 0 || this.segundos/3600 == 12) ? 12 : (this.segundos/3600)%12, 
		(this.getSegundos()%3600)/60, (this.getSegundos()/3600)%60, this.segundos/3600 < 12 ? "AM" : "PM");
	}
}