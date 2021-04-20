import java.awt.Color;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class App {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
	
		JFrame app = new JFrame("FiapFlix");
		JPanel cadastro = new JPanel();
		cadastro.setLayout(null);
		cadastro.setLocation(600,450);
		cadastro.setSize(600,450);
		app.add(cadastro);
		
		JPanel lista = new JPanel();
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", cadastro);
		abas.add("Lista", lista);
		app.add(abas);
		app.setSize(600, 450);
		app.setVisible(true);
		
		JLabel logo = new JLabel(new ImageIcon("src/Imagens/LogoFiap.png"));
		logo.setBounds(0,0,250,250);
		cadastro.add(logo);
	
		MeuLabel titulo = new MeuLabel("Título: ");
		titulo.setBounds(270,50,40,20);
		cadastro.add(titulo);
		MeuTextField textoTitulo = new MeuTextField();
		textoTitulo.setBounds(270,70,150,20);
		cadastro.add(textoTitulo);
		
		MeuLabel sinopse = new MeuLabel("Sinopse: ");
		sinopse.setBounds(270,100,70,20);
		cadastro.add(sinopse);
		MeuTextArea textoSinopse = new MeuTextArea();
		textoSinopse.setBounds(270,120,200,60);
		cadastro.add(textoSinopse);
		
		MeuLabel ondeAssistir = new MeuLabel ("Onde Assistir ? ");
		ondeAssistir.setBounds(270,190,80,20);
		cadastro.add(ondeAssistir);
		List<String> listaDeOpcoes = List.of("Netflix", "Amazon Prime", "Disney+", "Torrentão");
		MeuRadioGroup players = new MeuRadioGroup(listaDeOpcoes);
		players.setBounds(166,210,500,30);
		cadastro.add(players);
		
		JCheckBox assistido = new JCheckBox("Assistido ?");
		assistido.setBounds(270,250,100,30);
		cadastro.add(assistido);
		
		MeuLabel selecao = new MeuLabel ("Genero do Filme: ");
		selecao.setBounds(20,260,100,20);
		cadastro.add(selecao);
		String[] genero = {"Ação", "Comédia", "Drama", "Suspense"};
		JComboBox generos = new JComboBox <String>(genero); 
		generos.setBounds(110,250,100,40);
		cadastro.add(generos);
		
	
		MeuLabel avaliacao = new MeuLabel ("Avaliação: ");
		avaliacao.setBounds(400,255,100,20);
		cadastro.add(avaliacao);
		StarRater estrelas = new StarRater(5);
		estrelas.setBounds(455,257,100,30);
		cadastro.add(estrelas);
		
		JButton salvar = new JButton("Salvar");
		salvar.addActionListener(new BotaoListener(textoTitulo,textoSinopse,assistido,estrelas,generos,players));
		salvar.setBounds(280,300,100,30);
		cadastro.add(salvar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(400,300,100,30);
		cadastro.add(cancelar);
		
		
		}
	

}
