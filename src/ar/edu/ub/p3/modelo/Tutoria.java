package ar.edu.ub.p3.modelo;

public class Tutoria{
	private Persona tutor;
	private Persona personaACargo;
	
	public Tutoria(Persona tutor, Persona personaACargo) {		
		this.setTutor(tutor);
		this.setPersonaACargo(personaACargo);
	}

	public Persona getPersonaACargo() {
		return personaACargo;
	}

	private void setPersonaACargo(Persona personaACargo) {
		this.personaACargo = personaACargo;
	}

	public Persona getTutor() {
		return tutor;
	}

	private void setTutor(Persona tutor) {
		this.tutor = tutor;
	}

	
	public String getTutorNombre() {
		return this.getTutor().getNombre();
	}

	
	public void setTutorNombre(String nombre) {
		this.getTutor().setNombre(nombre);		
	}

	
	public int getTutorEdad() {
		return this.getTutor().getEdad();
	}

	
	public String toString() {
		return "Tutoria [tutor=" + tutor + ", personaACargo=" + personaACargo + "]";
	}

	
	public void setTutorEdad(int edad) {
		this.getTutor().setEdad( edad );
	}

	
	public String getPersonaACargoNombre() {
		return this.getPersonaACargo().getNombre();
	}

	
	public void setPersonaACargoNombre(String nombre) {
		this.getPersonaACargo().setNombre(nombre);		
	}

	
	public int getPersonaACargoEdad() {
		return this.getPersonaACargo().getEdad();
	}

	
	public void setPersonaACargoEdad(int edad) {
		this.getPersonaACargo().setEdad( edad );
	}
	
}
