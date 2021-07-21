import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
		super("Dados Covid");

		JPanel jp = (JPanel) this.getContentPane();
		
		jp.setBackground(Color.white);
		buttonInfoGeral = new JButton("Geral");
		buttonInfoGeral.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonInfoGeral.setFocusPainted(false);
		buttonInfoGeral.setBackground(new Color(40, 167, 69));
		buttonInfoGeral.setForeground(Color.WHITE);
		
		buttonTipoVacina = new JButton("Tipo de Vacina");
		buttonTipoVacina.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonTipoVacina.setFocusPainted(false);
		buttonTipoVacina.setBackground(new Color(40, 167, 69));
		buttonTipoVacina.setForeground(Color.WHITE);
		
		buttonComorbidade = new JButton("Comorbidades");
		buttonComorbidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonComorbidade.setFocusPainted(false);
		buttonComorbidade.setBackground(new Color(40, 167, 69));
		buttonComorbidade.setForeground(Color.WHITE);
		
		buttonDataVacinacao = new JButton("Quando posso ser vacinado?");
		buttonDataVacinacao.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonDataVacinacao.setFocusPainted(false);
		buttonDataVacinacao.setBackground(new Color(40, 167, 69));
		buttonDataVacinacao.setForeground(Color.WHITE);
		
		buttonInfoGeral.setActionCommand("info");
		buttonTipoVacina.setActionCommand("tipo");
		buttonComorbidade.setActionCommand("comorbidade");
		buttonDataVacinacao.setActionCommand("data");
			
		JPanel jp2=new JPanel(new FlowLayout());
		jp2.add(buttonInfoGeral);
		jp2.add(buttonTipoVacina);
		jp2.add(buttonComorbidade);
		jp2.add(buttonDataVacinacao);
		jp.add(jp2);		
		jp2.setBackground(Color.white);
	
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


