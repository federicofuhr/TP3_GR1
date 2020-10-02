package tp3.gr1.entidades;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ReporteGraduadosCarrerasPorAnio {

	private int id_carrera;


	private String nombre_carrera;


	private int fechaGraduacion;
	

	private BigDecimal cantGraduados;


	public ReporteGraduadosCarrerasPorAnio(int id_carrera, String nombre_carrera, int fechaGraduacion,
			BigDecimal o) {
		super();
		this.id_carrera = id_carrera;
		this.nombre_carrera = nombre_carrera;
		this.fechaGraduacion = fechaGraduacion;
		this.cantGraduados = o;
	}


	@Override
	public String toString() {
		return "ReporteGraduadosCarrerasPorAnio [id_carrera=" + id_carrera + ", nombre_carrera=" + nombre_carrera
				+ ", fechaGraduacion=" + fechaGraduacion + ", cantGraduados=" + cantGraduados + "]";
	}
	
	
	
}
