import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IdadeGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel jp;
	private JPanel jp2;
	private JButton buttonAvancar;
	private JButton buttonInicio;
	private JLabel label;
	private JTextField siglaEstado;
	private JTextField idade;
	
	public IdadeGUI(){
		super("Data de vacinação");
		
		jp = (JPanel) this.getContentPane();
		jp.setLayout(new GridLayout(2,1));
		label = new JLabel("Entre seu estado e idade para achar sua data de vacinação");
		siglaEstado=new JTextField("Sigla  do Estado");
		idade=new JTextField("Idade");
		
		buttonAvancar = new JButton("Avançar");
		buttonAvancar.setActionCommand("avancar");
		buttonInicio = new JButton("Inicio");
		buttonInicio.setActionCommand("inicio");
		
		jp.add(label);
		
		
		jp2=new JPanel(new FlowLayout());
		jp2.add(siglaEstado);
		jp2.add(idade);
		jp2.add(buttonAvancar);
		jp.add(jp2);	
		
		buttonAvancar.addActionListener(this);
		buttonInicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("avancar".equals(e.getActionCommand())) {
			String estado=siglaEstado.getText();
			try {
				int idadeUsuario=Integer.parseInt(idade.getText());
				Idade id=new Idade(idadeUsuario, estado);
				label.setText(id+"");
			}catch(NumberFormatException erro){
				label.setText("Idade digitado incorretamente");
			}
			jp.remove(jp2);
			
			
			jp2=new JPanel(new FlowLayout());
			jp2.add(buttonInicio);
			jp.add(jp2);
			
		}
		else if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}

}
