import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TipoVacinaGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel jp;
	private JPanel jp2;
	private JButton buttonAvancar;
	private JButton buttonInicio;
	private JLabel label;
	private JTextField nomeVacina;
	
	public TipoVacinaGUI(){
		super("Dados sobre um tipo de vacina");
		
		jp = (JPanel) this.getContentPane();
		jp.setLayout(new GridLayout(2,2));
		label = new JLabel("Buscar informacoes sobre um tipo de vacina");
		label.setFont(new Font("Arial", Font.PLAIN, 18));
		label.setForeground(new Color(52, 52, 52));
		
		nomeVacina=new JTextField("Tipo de vacina");
		nomeVacina.setFont( new Font("Arial", Font.PLAIN, 20));
		nomeVacina.setForeground(Color.gray.brighter());
		
		buttonAvancar = new JButton("Procurar"); //procurar = avancar
		buttonAvancar.setActionCommand("avancar");
		buttonAvancar.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonAvancar.setFocusPainted(false);
		buttonAvancar.setBackground(new Color(40, 167, 69));
		buttonAvancar.setForeground(Color.WHITE);
		buttonInicio = new JButton("Inicio");
		buttonInicio.setActionCommand("inicio");
		
		jp.add(label);
		
		
		jp2=new JPanel(new FlowLayout());
		jp2.add(nomeVacina);
		jp2.add(buttonAvancar);
		jp.add(jp2);	
		jp.setBackground(Color.white);
		jp2.setBackground(Color.white);
		buttonAvancar.addActionListener(this);
		buttonInicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("avancar".equals(e.getActionCommand())) {
			String nome=nomeVacina.getText();
			jp.remove(jp2);
			
			TipoVacina tv=new TipoVacina(nome);
			
			label.setText("<html>"+tv+"<html>");
			label.setFont(new Font("Arial", Font.PLAIN, 14));
			jp.add(label);
			jp2=new JPanel(new FlowLayout());
			jp2.setBackground(Color.white);
			jp2.add(buttonInicio);
			buttonInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
			buttonInicio.setFocusPainted(false);
			buttonInicio.setBackground(new Color(40, 167, 69));
			buttonInicio.setForeground(Color.WHITE);
			
			jp.add(jp2);
			
		}
		else if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}
}
