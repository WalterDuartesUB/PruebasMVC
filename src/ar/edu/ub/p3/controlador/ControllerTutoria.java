package ar.edu.ub.p3.controlador;

import ar.edu.ub.p3.modelo.Tutoria;
import ar.edu.ub.p3.vista.IViewTutoriaModel;
import ar.edu.ub.p3.vista.IViewTutoriaModelListener;

public class ControllerTutoria implements IViewTutoriaModelListener {
	private Tutoria tutoria;
	
	public ControllerTutoria(Tutoria tutoria) {		
		this.setTutoria(tutoria);
	}

	@Override
	public void update(IViewTutoriaModel view) {
		
		this.getTutoria().setTutorNombre( view.getTutor().getNombre() );
		this.getTutoria().setTutorEdad( view.getTutor().getEdad() );
		
		this.getTutoria().setPersonaACargoNombre( view.getPersona().getNombre() );
		this.getTutoria().setPersonaACargoEdad( view.getPersona().getEdad() );
		
		System.out.println( this.getTutoria() );
	}

	public Tutoria getTutoria() {
		return tutoria;
	}

	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}



}
