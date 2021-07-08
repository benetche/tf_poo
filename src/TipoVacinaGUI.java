import java.awt.FlowLayout;
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
		jp.setLayout(new GridLayout(3,1));
		label = new JLabel("Entre o tipo de vacina que você que buscar");
		nomeVacina=new JTextField("Tipo de vacina");
		
		buttonAvancar = new JButton("Avançar");
		buttonAvancar.setActionCommand("avancar");
		buttonInicio = new JButton("Inicio");
		buttonInicio.setActionCommand("inicio");
		
		jp.add(label);
		
		
		jp2=new JPanel(new FlowLayout());
		jp2.add(nomeVacina);
		jp2.add(buttonAvancar);
		jp.add(jp2);	
		
		buttonAvancar.addActionListener(this);
		buttonInicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("avancar".equals(e.getActionCommand())) {
			String nome=nomeVacina.getText();
			jp.remove(jp2);
			
			TipoVacina tv=new TipoVacina(nome);
			label.setText(tv+"");
			
			jp.add(buttonInicio);
			
		}
		else if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}
}
