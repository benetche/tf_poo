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
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		
		buttonVoltarInicio = new JButton("Inicio");
		buttonVoltarInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonVoltarInicio.setFocusPainted(false);
		buttonVoltarInicio.setBackground(new Color(40, 167, 69));
		buttonVoltarInicio.setForeground(Color.WHITE);
		buttonVoltarInicio.setActionCommand("inicio");
		
		jp.add(label);		
		JPanel jp2=new JPanel(new FlowLayout());	
		jp2.add(buttonVoltarInicio);
		jp.add(jp2);
		jp.setBackground(Color.white);
		jp2.setBackground(Color.white);
		buttonVoltarInicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}
}
