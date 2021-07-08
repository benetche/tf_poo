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
		jp.setLayout(new GridLayout(3,1));
		label = new JLabel(c+"");
		
		buttonVoltarInicio = new JButton("Inicio");
		buttonVoltarInicio.setActionCommand("inicio");
		
		jp.add(label);		
		jp.add(buttonVoltarInicio);
		
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