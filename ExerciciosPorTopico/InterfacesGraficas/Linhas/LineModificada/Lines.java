import javax.swing.JPanel;
import java.awt.Graphics;

public class Lines extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		int altura = getHeight();
		int largura = getWidth();
		
		for (int i = 0; i < 16; i++) {
			g.drawLine(0, 0, (largura/15)*i, altura - (altura/15)*i);
		}
		
		for (int i = 0; i < 16; i++) {
			g.drawLine(largura, 0, largura - (largura/15)*i, altura - (altura/15)*i);
		}
		
		for (int i = 0; i < 16; i++) {
			g.drawLine(0, altura, (largura/15)*i, (altura/15)*i);
		}
		
		for (int i = 0; i < 16; i++) {
			g.drawLine(largura, altura, largura - (largura/15)*i, (largura/15)*i);
		}
	}
}