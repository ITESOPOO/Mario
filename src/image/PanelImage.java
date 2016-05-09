package image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;


public class PanelImage extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
	
		Dimension tam = getSize();
		
		ImageIcon image = new ImageIcon(new ImageIcon(getClass().getResource("/images/Fondo_celeste.jpg")).getImage());
		g.drawImage(image.getImage(), 0, 0, tam.width, tam.height, null);
	}
}
