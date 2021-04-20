import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;

	public MeuLabel(String texto) {
		super(texto);
		init();
	}
	
	public void init() {
		this.setForeground(new Color(0,0,0));
		this.setPreferredSize(new Dimension(80, 20));

		
	}
}