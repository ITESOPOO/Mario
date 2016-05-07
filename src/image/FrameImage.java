package image;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameImage extends JFrame {

	private static final long serialVersionUID = 1L;

	public FrameImage () {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();

		int width = (int) d.getWidth();
		int height = (int) d.getHeight();
		
		add(new PanelImage());	
		setSize(800, 650);
		//setSize((int) ((4.0 / 5) * width), (int) ((4 / 5.0) * height));
		setResizable(false);		
		setTitle("MARIO BROSS");

		int centerX = (int) ((width - getSize().getWidth()) / 2);
		int centerY = (int) ((height - getSize().getHeight()) / 2);
		setLocation(centerX, centerY);
		setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
