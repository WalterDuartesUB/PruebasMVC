package ar.edu.ub.p3.vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class TutoriaPanel extends JPanel implements IViewTutoriaModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonaPanel fichaPersona;
	private PersonaPanel fichaTutor;
	
	public TutoriaPanel() {
		this.inicializarPanel();		
	}

	private void inicializarPanel() {
		this.setLayout( new GridLayout(2, 1));
		
		this.setFichaPersona( new PersonaPanel() );
		this.setFichaTutor( new PersonaPanel() );			
		
		this.add( this.getFichaTutor() );
		this.add( this.getFichaPersona() );
	}

	public PersonaPanel getFichaTutor() {
		return fichaTutor;
	}

	public void setFichaTutor(PersonaPanel fichaTutor) {
		this.fichaTutor = fichaTutor;
	}

	public PersonaPanel getFichaPersona() {
		return fichaPersona;
	}

	public void setFichaPersona(PersonaPanel fichaPersona) {
		this.fichaPersona = fichaPersona;
	}
	
	@Override
	public String getTutorNombre() {
		return this.getFichaTutor().getNombre();
	}

	@Override
	public void setTutorNombre(String nombre) {
		this.getFichaTutor().setNombre( nombre );		
	}

	@Override
	public int getTutorEdad() {
		return this.getFichaTutor().getEdad();
	}

	@Override
	public void setTutorEdad(int edad) {
		this.getFichaTutor().setEdad( edad );		
	}
	
	@Override
	public String getPersonaACargoNombre() {
		return this.getFichaPersona().getNombre();
	}

	@Override
	public void setPersonaACargoNombre(String nombre) {
		this.getFichaPersona().setNombre( nombre );		
	}

	@Override
	public int getPersonaACargoEdad() {
		return this.getFichaPersona().getEdad();
	}

	@Override
	public void setPersonaACargoEdad(int edad) {
		this.getFichaPersona().setEdad( edad );		
	}

}
