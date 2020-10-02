package tp3.gr1.entidades;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;


public class ReporteInscriptosCarrerasPorAnio {
	
	

	private int id_carrera;


	private String nombre_carrera;


	private int fechaInscripcion;
	

	private BigInteger cantInscriptos;


	public ReporteInscriptosCarrerasPorAnio(int id_carrera, String nombre_carrera, int fechaInscripcion, BigInteger cantInscriptos) {
		super();
		this.id_carrera = id_carrera;
		this.nombre_carrera = nombre_carrera;
		this.fechaInscripcion = fechaInscripcion;
		this.cantInscriptos = cantInscriptos;
	}


	public String toString() {
		return "ReporteInscriptosCarrerasPorAnio [id_carrera=" + id_carrera + ", nombre_carrera=" + nombre_carrera
				+ ", fechaInscripcion=" + fechaInscripcion + ", cantidadInscriptos=" + cantInscriptos + "]";
	}
	
	
	
	

}
