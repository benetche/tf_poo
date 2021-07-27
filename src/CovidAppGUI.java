import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CovidAppGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static CovidAppGUI frame;
	private JButton buttonInfoGeral;
	private JButton buttonTipoVacina;
	private JButton buttonComorbidade;
	private JButton buttonDataVacinacao;
	String textoInicial="Escolha o que buscar";
	JLabel label;
	
	java.net.URL imgURL = this.getClass().getResource("resources/covid.png");
	ImageIcon covid = new ImageIcon(imgURL);
	
	public CovidAppGUI() {
		super("Dados Covid");
		label = new JLabel("Confira as informacoes sobre a COVID-19");
		label.setText("");
		label.setIcon(covid);
		JPanel jp = (JPanel) this.getContentPane();
	
		jp.setBackground(Color.white);
		buttonInfoGeral = new JButton("Geral");
		buttonInfoGeral.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonInfoGeral.setFocusPainted(false);
		buttonInfoGeral.setBackground(new Color(40, 167, 69));
		buttonInfoGeral.setForeground(Color.WHITE);
		
		buttonTipoVacina = new JButton("Tipo de Vacina");
		buttonTipoVacina.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonTipoVacina.setFocusPainted(false);
		buttonTipoVacina.setBackground(new Color(40, 167, 69));
		buttonTipoVacina.setForeground(Color.WHITE);
		
		buttonComorbidade = new JButton("Comorbidades");
		buttonComorbidade.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonComorbidade.setFocusPainted(false);
		buttonComorbidade.setBackground(new Color(40, 167, 69));
		buttonComorbidade.setForeground(Color.WHITE);
		
		buttonDataVacinacao = new JButton("Quando posso ser vacinado?");
		buttonDataVacinacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonDataVacinacao.setFocusPainted(false);
		buttonDataVacinacao.setBackground(new Color(40, 167, 69));
		buttonDataVacinacao.setForeground(Color.WHITE);
		
		buttonInfoGeral.setActionCommand("info");
		buttonTipoVacina.setActionCommand("tipo");
		buttonComorbidade.setActionCommand("comorbidade");
		buttonDataVacinacao.setActionCommand("data");
			
		JPanel jp2=new JPanel(null);
		jp2.add(buttonInfoGeral);
		
		jp2.add(buttonTipoVacina);
		jp2.add(buttonComorbidade);
		jp2.add(buttonDataVacinacao);
		jp.add(jp2);		
		jp2.setBackground(Color.white);
		jp2.add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		
		buttonInfoGeral.setBounds(50,10,100,30);
		buttonTipoVacina.setBounds(200,10,180,30);
		buttonComorbidade.setBounds(430,10,180,30);
		buttonDataVacinacao.setBounds(650,10,300,30);
		
		label.setBounds(375,100,350,350);
		
		buttonInfoGeral.addActionListener(this);
		buttonTipoVacina.addActionListener(this);
		buttonComorbidade.addActionListener(this);
		buttonDataVacinacao.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("info".equals(e.getActionCommand())) {
			InfoGeralGUI newFrame=new InfoGeralGUI();
			newFrame.setSize(1200, 500);
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setVisible(true);
		}
		else if ("data".equals(e.getActionCommand())) {
			IdadeGUI newFrame=new IdadeGUI();
			newFrame.setSize(800, 400);
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setVisible(true);
		}
		else if ("comorbidade".equals(e.getActionCommand())) {
			ComorbidadesGUI newFrame=new ComorbidadesGUI();
			newFrame.setSize(800, 400);
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setVisible(true);
		}
		else if ("tipo".equals(e.getActionCommand())) {
			TipoVacinaGUI newFrame=new TipoVacinaGUI();
			newFrame.setSize(1000, 400);
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		frame=new CovidAppGUI();
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}


