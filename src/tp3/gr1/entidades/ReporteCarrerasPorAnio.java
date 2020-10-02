package tp3.gr1.entidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import tp3.gr1.controller.CarreraDAO;

public class ReporteCarrerasPorAnio {
	
	private List<ReporteGraduadosCarrerasPorAnio> graduados;
	
	private List<ReporteInscriptosCarrerasPorAnio> inscriptos;
	
	public ReporteCarrerasPorAnio(List<ReporteGraduadosCarrerasPorAnio> graduados,
			List<ReporteInscriptosCarrerasPorAnio> inscriptos) {
		super();
		CarreraDAO c1 = new CarreraDAO();
		this.graduados = c1.getGraduadosPorCarrera();
		this.inscriptos = c1.getInscriptosPorCarrera();
	}

	public void getReporte(){ 
		for (ReporteGraduadosCarrerasPorAnio object : graduados) {
			graduados.add(object);
		}
	}
	
	//funcion de mergear las listas
	
//	System.out.println("");
//	System.out.println("Carreras ordenadas alfabeticamente y por anio, traer su cantidad de inscriptos");
//	List<ReporteInscriptosCarrerasPorAnio> lista2= c1.getInscriptosPorCarrera();
//	for (ReporteInscriptosCarrerasPorAnio object : lista2) {
//		System.out.println(object);
//	}

}

