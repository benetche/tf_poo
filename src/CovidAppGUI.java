import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CovidAppGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static CovidAppGUI frame;
	private JButton buttonInfoGeral;
	private JButton buttonTipoVacina;
	private JButton buttonComorbidade;
	private JButton buttonDataVacinacao;
	String textoInicial="Escolha o que buscar";
	JLabel label;

	public CovidAppGUI() {
		super("Dados Vacinação Covid");

		JPanel jp = (JPanel) this.getContentPane();
		jp.setLayout(new GridLayout(2,1));
		label = new JLabel(textoInicial);
		
		buttonInfoGeral = new JButton("Informações Gerais");
		buttonTipoVacina = new JButton("Tipo de Vacina");
		buttonComorbidade = new JButton("Comorbidades");
		buttonDataVacinacao = new JButton("Data de vacinação");
		buttonInfoGeral.setActionCommand("info");
		buttonTipoVacina.setActionCommand("tipo");
		buttonComorbidade.setActionCommand("comorbidade");
		buttonDataVacinacao.setActionCommand("data");
		
		jp.add(label);		
		JPanel jp2=new JPanel(new FlowLayout());
		jp2.add(buttonInfoGeral);
		jp2.add(buttonTipoVacina);
		jp2.add(buttonComorbidade);
		jp2.add(buttonDataVacinacao);
		jp.add(jp2);		
		
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
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
