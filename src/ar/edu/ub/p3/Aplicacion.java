package ar.edu.ub.p3;

import java.util.LinkedList;
import java.util.List;

import ar.edu.ub.p3.controlador.ControllerTutoria;
import ar.edu.ub.p3.modelo.Persona;
import ar.edu.ub.p3.modelo.Tutoria;
import ar.edu.ub.p3.vista.IViewTutoriaModelListener;
import ar.edu.ub.p3.vista.TutoriaView;

public class Aplicacion {
	public static void main(String[] args) {
				
		List<IViewTutoriaModelListener> controladores = new LinkedList<IViewTutoriaModelListener>();
		Tutoria tutoria = new Tutoria( new Persona("tutor", 123), new Persona("walter", 30 ) );		
		
		controladores.add( new ControllerTutoria( tutoria ) );
		
		new TutoriaView( controladores ).setInput( tutoria );		
	}
}
