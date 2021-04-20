import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BotaoListener implements ActionListener, MouseListener {

	private MeuTextField textoTitulo;
	private MeuTextArea textoSinopse;
	private JCheckBox assistido;
	private StarRater estrelas;
	private JComboBox generos;
	private MeuRadioGroup players;

	public BotaoListener(MeuTextField textoTitulo, MeuTextArea textoSinopse, JCheckBox assistido, StarRater estrelas, JComboBox generos, MeuRadioGroup players) {
		this.textoTitulo = textoTitulo;	
		this.textoSinopse = textoSinopse;
		this.assistido = assistido;
		this.estrelas = estrelas;
		this.generos = generos;
		this.players = players;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Filmes filme = new Filmes(textoTitulo.getText(), textoSinopse.getText(), (String) generos.getItemAt(generos.getSelectedIndex()), players.getSelectedButtonText(), assistido.isSelected(), estrelas.getSelection());
		System.out.println(filme.toString());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");

		
	}

}