import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoGeralGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton buttonVoltarInicio;
	JLabel label;
	
	public InfoGeralGUI(){
		super("Informações Gerais");
		InformacoesGerais ig=new InformacoesGerais();
		
		JPanel jp = (JPanel) this.getContentPane();
		jp.setLayout(new GridLayout(2,1));
		label = new JLabel("<html>"+ig+"<html>");
		
		buttonVoltarInicio = new JButton("Inicio");
		buttonVoltarInicio.setActionCommand("inicio");
		
		jp.add(label);		
		JPanel jp2=new JPanel(new FlowLayout());	
		jp2.add(buttonVoltarInicio);
		jp.add(jp2);
		
		buttonVoltarInicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}

/*	
	private static final long serialVersionUID = 1L;
	private JButton buttonOK;
	JTextField nome;
	String WELLCOME="Welcome";
	JLabel label;

	public CovidAppGUI() {
		super("Dados Vacinação Covid");
		
		JPanel jp = (JPanel) this.getContentPane();
		label = new JLabel("Hello Interface");
		jp.setLayout(new GridLayout(3,1));
		label = new JLabel(WELLCOME);
		nome=new JTextField();
		
		buttonOK = new JButton("Confirma");
		JButton buttonLimpa = new JButton("Limpa");
		buttonOK.setActionCommand("confirma");
		buttonLimpa.setActionCommand("limpa");
		
		jp.add(label);
		jp.add(nome);
		
		JPanel jp2=new JPanel(new FlowLayout());
		jp2.add(buttonOK);
		jp2.add(buttonLimpa);
		jp.add(jp2);		
		
		buttonOK.addActionListener(this);
		buttonLimpa.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("confirma".equals(e.getActionCommand())) {
			String s = nome.getText();
			s = WELLCOME + " " + s;
			label.setText(s);
		}
		else if ("limpa".equals(e.getActionCommand())) {
			nome.setText("");
			String s = WELLCOME;
			label.setText(s);
		}
	}
	
	public static void main(String[] args) {
		CovidAppGUI frame=new CovidAppGUI();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
*/
}
