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

public class ComorbidadesGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton buttonVoltarInicio;
	JLabel label;
	
	public ComorbidadesGUI(){
		super("Comorbidades");
		Comorbidades c= new Comorbidades();
		
		JPanel jp = (JPanel) this.getContentPane();
		jp.setLayout(new GridLayout(2,1));
		label = new JLabel("<html>"+c+"<html>");
		
		buttonVoltarInicio = new JButton("Inicio");
		buttonVoltarInicio.setActionCommand("inicio");
		
		buttonVoltarInicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonVoltarInicio.setFocusPainted(false);
		buttonVoltarInicio.setBackground(new Color(40, 167, 69));
		buttonVoltarInicio.setForeground(Color.WHITE);
		
		
		label.setFont(new Font("Arial", Font.PLAIN, 14));	//fonte mais bonita
		
		jp.add(label);	
		jp.setBackground(Color.white);
		JPanel jp2=new JPanel(new FlowLayout());	
		jp2.add(buttonVoltarInicio);
		jp.add(jp2);
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