package ar.edu.ub.p3.vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonaPanel extends JPanel implements IViewPersonaModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtNombre;
	private JTextField txtEdad;
	
	public PersonaPanel() {
		this.setLayout( new GridLayout(2,2));
		this.setTxtNombre( new JTextField() );
		this.setTxtEdad( new JTextField() );
		this.add( new JLabel("Nombre:"));
		this.add( this.getTxtNombre() );
		this.add( new JLabel("Edad:"));
		this.add( this.getTxtEdad() );
	}

	@Override
	public String getNombre() {
		return this.getTxtNombre().getText( );
	}

	@Override
	public void setNombre(String nombre) {
		this.getTxtNombre().setText( nombre );
	}

	@Override
	public int getEdad() {
		return Integer.parseInt( this.getTxtEdad().getText( ) );
	}

	@Override
	public void setEdad(int edad) {
		this.getTxtEdad().setText( String.valueOf( edad ) );
	}

	private JTextField getTxtEdad() {
		return txtEdad;
	}

	private void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	private JTextField getTxtNombre() {
		return txtNombre;
	}

	private void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
}
