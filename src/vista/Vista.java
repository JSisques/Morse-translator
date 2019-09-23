package vista;

import javax.swing.JFrame;

import controlador.Controlador;
import modelo.Modelo;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private Modelo modelo;
	private Controlador controlador;
	private JTextPane txtTexto;
	private JButton btnTraducir;
	private JTextPane txtMorse;
	
	public Vista() {
		setTitle("Traductor morse");
		setResizable(false);
		getContentPane().setLayout(null);
		setSize(500, 350);
		setLocationRelativeTo(null);
		
		txtTexto = new JTextPane();
		txtTexto.setBounds(15, 25, 470, 100);
		getContentPane().add(txtTexto);
		
		btnTraducir = new JButton("Translate");
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.solicitudTraduccion();
			}
		});
		btnTraducir.setBounds(200, 137, 100, 50);
		getContentPane().add(btnTraducir);
		
		txtMorse = new JTextPane();
		txtMorse.setBounds(15, 200, 470, 100);
		getContentPane().add(txtMorse);
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	public String getTexto() {
		return txtTexto.getText();
	}
	
	public void actualizarMorse() {
		txtMorse.setText(modelo.getMorse());
	}
}
