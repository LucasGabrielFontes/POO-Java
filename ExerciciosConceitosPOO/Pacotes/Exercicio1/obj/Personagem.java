package obj;
import util.*;

public class Personagem extends Objeto implements Speaker {

	protected String name;

	public Personagem(String name, int x, int y) {
		super(x, y);
		this.name = name;
	}

	public void speak() {
		System.out.println("Oi");
	}

	public String toString() {
		return name + ": " + x + "," + y;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return 1;
	}

}
