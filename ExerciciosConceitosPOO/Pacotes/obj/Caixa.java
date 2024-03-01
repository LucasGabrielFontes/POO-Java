package obj;

public class Caixa extends Objeto {

	protected int width;
	protected int height;

	public Caixa(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return x + "," + y + " " + width + "x" + height;
	}

	public int getSize() {
		return width * height;
	}

}
