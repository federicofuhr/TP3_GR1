package tp3.gr1.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tp3.gr1.controller.EstudianteDAO;
import tp3.gr1.entidades.Carrera;
import tp3.gr1.entidades.Estudiante;

@Path("/estudiantes")
public class EstudianteREST {
	
	/*
	 * Resolucion ejercicio 2.A
	 */
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addEstudiante(Estudiante e) {
		LectorCicloVida.estudiante.insert(e);
	}

	/*
	 * Resolucion ejercicio 2.C
	 */

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Estudiante getEstudianteLegajo(@PathParam("id") int id) {
		Estudiante estudiante = LectorCicloVida.estudiante.getEstudianteLegajo(id);
		return new Estudiante(estudiante);
	}

	/*
	 * Resolucion ejercicio 2.D
	 */

	@GET
	@Path("/listaEstudiantes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getListaEstudiantes() {
		List<Estudiante> estudianteListResponse = LectorCicloVida.estudiante.getEstudiantesSortDNI();

		List<Estudiante> result = new ArrayList<Estudiante>();

		for (Estudiante estudiante : estudianteListResponse) {
			result.add(new Estudiante(estudiante));
		}
		return result;
	}

	/*
	 * Resolucion ejercicio 2.E
	 */

	@GET
	@Path("/genero/{genero}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getEstudianteGenero(@PathParam("genero") String genero) {
		List<Estudiante> estudianteListResponse = LectorCicloVida.estudiante.getEstudianteGenero(genero);

		List<Estudiante> result = new ArrayList<Estudiante>();

		for (Estudiante estudiante : estudianteListResponse) {
			result.add(new Estudiante(estudiante));
		}
		return result;
	}
}