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
		
		this.getTutoria().setTutorNombre( view.getTutorNombre() );
		this.getTutoria().setTutorEdad( view.getTutorEdad() );
		
		this.getTutoria().setPersonaACargoNombre( view.getPersonaACargoNombre() );
		this.getTutoria().setPersonaACargoEdad( view.getPersonaACargoEdad() );
		
		System.out.println( this.getTutoria() );
	}

	@Override
	public void load(IViewTutoriaModel view) {
		view.setTutorEdad( this.getTutoria().getTutor().getEdad( ) );		
		view.setTutorNombre( this.getTutoria().getTutor().getNombre( ) );
		
		view.setPersonaACargoEdad( this.getTutoria().getPersonaACargo().getEdad( ) );		
		view.setPersonaACargoNombre( this.getTutoria().getPersonaACargo().getNombre( ) );		
	}

	public Tutoria getTutoria() {
		return tutoria;
	}

	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}



}
