package obj;

public abstract class Objeto {

	protected int x;
	protected int y;

	public Objeto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract int getSize();

}
