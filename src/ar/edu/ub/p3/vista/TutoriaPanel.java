package ar.edu.ub.p3.vista;

import java.awt.GridLayout;

import ar.edu.ub.p3.modelo.Persona;
import ar.edu.ub.p3.modelo.Tutoria;

public class TutoriaPanel extends IViewTutoriaModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonaPanel fichaPersona;
	private PersonaPanel fichaTutor;
	private Tutoria tutoria;
	
	public TutoriaPanel() {		
		this.inicializarPanel();
		
		this.setTutor( this.getFichaTutor() );
		this.setPersona( this.getFichaPersona() );		
	}

	private void inicializarPanel() {
		this.setLayout( new GridLayout(2, 1));
		
		this.setFichaPersona( new PersonaPanel() );
		this.setFichaTutor( new PersonaPanel() );			
		
		this.add( this.getFichaTutor() );
		this.add( this.getFichaPersona() );
	}

	private PersonaPanel getFichaTutor() {
		return fichaTutor;
	}

	private void setFichaTutor(PersonaPanel fichaTutor) {
		this.fichaTutor = fichaTutor;
	}

	private PersonaPanel getFichaPersona() {
		return fichaPersona;
	}

	private void setFichaPersona(PersonaPanel fichaPersona) {
		this.fichaPersona = fichaPersona;
	}

	public void setInput(Tutoria tutoria) {
		this.setTutoria(tutoria);		
	}

	private Tutoria getTutoria() {
		return tutoria;
	}

	private void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}

	public void loadInput() {
		this.loadInput( this.getFichaPersona(), this.getTutoria().getPersonaACargo() );
		this.loadInput( this.getFichaTutor(), this.getTutoria().getTutor() );
	}
	
	private void loadInput( PersonaPanel ficha, Persona persona) {
		ficha.setEdad( persona.getEdad() );
		ficha.setNombre( persona.getNombre() );
	}	
}
