package ar.edu.ub.p3.vista;

import javax.swing.JPanel;

public abstract class IViewTutoriaModel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IViewPersonaModel tutor;
	private IViewPersonaModel persona;
	
	public IViewTutoriaModel(IViewPersonaModel tutor, IViewPersonaModel persona) {		
		this.setTutor(tutor);
		this.setPersona(persona);
	}
	
	public IViewTutoriaModel() {
		this( null, null );
	}
	
	public IViewPersonaModel getTutor() {
		return tutor;
	}
	protected void setTutor(IViewPersonaModel tutor) {
		this.tutor = tutor;
	}
	public IViewPersonaModel getPersona() {
		return persona;
	}
	
	protected void setPersona(IViewPersonaModel persona) {
		this.persona = persona;
	}
}
