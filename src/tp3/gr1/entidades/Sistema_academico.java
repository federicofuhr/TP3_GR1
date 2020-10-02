package tp3.gr1.entidades;

import java.util.List;


//Clase no mappeada, seria equivalente al main
public class Sistema_academico {
	private List <Estudiante> estudiantes;
	private List <Carrera> carreras;
	
	public Sistema_academico(List<Estudiante> estudiantes, List<Carrera> carreras) {
		super();
		this.estudiantes = estudiantes;
		this.carreras = carreras;
	}

	public Sistema_academico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}
	

	
}
