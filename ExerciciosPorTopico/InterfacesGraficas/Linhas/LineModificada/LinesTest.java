import javax.swing.JFrame;

public class LinesTest {
	public static void main (String[] args) {
		JFrame application = new JFrame();
	
		Lines panel = new Lines();
	
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}