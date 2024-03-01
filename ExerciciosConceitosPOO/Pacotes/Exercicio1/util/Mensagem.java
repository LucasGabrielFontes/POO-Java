package util;

public class Mensagem implements Speaker {

	private String name;
	private String text;

	public Mensagem(String name, String text) {
		this.name = name;
		this.text = text;
	}

	public void speak() {
		System.out.println(text);
	}

	public String getName() {
		return name;
	}	

}
