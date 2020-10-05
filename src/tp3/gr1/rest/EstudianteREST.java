package tp3.gr1.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tp3.gr1.entidades.Estudiante;

@Path("/estudiantes/")
public class EstudianteREST {
	
	/*
	 * Resolucion ejercicio 2.A
	 */
	
	@POST
	@Path("/nuevoEstudiante")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addEstudiante(@FormParam("nombre") String nombre, @FormParam("apellido") String apellido, @FormParam("ciudad_residencia") String ciudad, @FormParam("dni") int dni, @FormParam("edad") int edad, @FormParam("genero") String genero) {
		int legajo = LectorCicloVida.estudiante.getUltimoId() + 1;
		Estudiante e = new Estudiante(legajo, nombre, apellido, edad, genero, dni, ciudad);
		LectorCicloVida.estudiante.insert(e);
	}

	/*
	 * Resolucion ejercicio 2.C
	 */

	@GET
	@Path("/obtenerEstudiante")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getEstudianteLegajo(@QueryParam("id") int id) {
		List<Estudiante> l = new ArrayList<Estudiante>();
		l.add(LectorCicloVida.estudiante.getEstudianteLegajo(id));
		return l;
	}

	/*
	 * Resolucion ejercicio 2.D
	 */

	@GET
	@Path("/listaEstudiantes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getListaEstudiantes() {
		return LectorCicloVida.estudiante.getEstudiantesSortDNI();
	}

	/*
	 * Resolucion ejercicio 2.E
	 */

	@GET
	@Path("/genero")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getEstudianteGenero(@QueryParam("genero") String genero) {
		return LectorCicloVida.estudiante.getEstudianteGenero(genero);
	}
	
	/*
	 * Resolucion ejercicio 2.G
	 */
	
	@GET
	@Path("/listaEstudiantesCarrerasResidencia")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getEstudianteGenero(@QueryParam("carrera") String carrera, @QueryParam("ciudad") String residencia) {
		return LectorCicloVida.estudiante.getEstudiantesCarreraResidencia(carrera, residencia);
	}
	
	
}