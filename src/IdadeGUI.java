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
		label = new JLabel("Entre seu estado e idade para verificar a data de Vacinacao");
		siglaEstado=new JTextField("Sigla do Estado");
		siglaEstado.setForeground(Color.black);
		idade=new JTextField("Idade");
		
		label.setFont(new Font("Arial", Font.PLAIN, 18));
		label.setForeground(new Color(69,69,69));
		
		
		siglaEstado.setFont( new Font("Arial", Font.PLAIN, 20));
		siglaEstado.setForeground(Color.gray.brighter());
		
		idade.setFont( new Font("Arial", Font.PLAIN, 20));
		idade.setForeground(Color.gray.brighter());
		
		buttonAvancar = new JButton("Buscar");
		buttonAvancar.setActionCommand("avancar");
		buttonInicio = new JButton("Inicio");
		buttonInicio.setActionCommand("inicio");
		
		jp.add(label);
		
		
		jp2=new JPanel(new FlowLayout());
		jp2.add(siglaEstado);
		jp2.add(idade);
		jp2.add(buttonAvancar);
		jp.add(jp2);	
		jp.setBackground(Color.white);
		jp2.setBackground(Color.white);
		buttonAvancar.addActionListener(this);
		buttonInicio.addActionListener(this);
		
		buttonAvancar.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonAvancar.setFocusPainted(false);
		buttonAvancar.setBackground(new Color(40, 167, 69));
		buttonAvancar.setForeground(Color.WHITE);
		
		buttonInicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonInicio.setFocusPainted(false);
		buttonInicio.setBackground(new Color(40, 167, 69));
		buttonInicio.setForeground(Color.WHITE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("avancar".equals(e.getActionCommand())) {
			String estado=siglaEstado.getText();
			try {
				int idadeUsuario=Integer.parseInt(idade.getText());
				Idade id=new Idade(idadeUsuario, estado);
				label.setText(id+"");
				label.setFont(new Font("Arial", Font.PLAIN, 16));
			}catch(NumberFormatException erro){
				label.setText("Idade digitada incorretamente");
			}
			jp.remove(jp2);
			
			
			jp2=new JPanel(new FlowLayout());
			jp2.add(buttonInicio);
			jp.add(jp2);
			jp2.setBackground(Color.white);
		}
		else if ("inicio".equals(e.getActionCommand())) {
			setVisible(false); //you can't see me!
			dispose();
		}
	}

}
