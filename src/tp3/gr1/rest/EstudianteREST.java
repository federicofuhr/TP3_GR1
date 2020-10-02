package tp3.gr1.rest;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tp3.gr1.controller.EstudianteDAO;
import tp3.gr1.entidades.Estudiante;

@Path("/estudiantes")
public class EstudianteREST {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estudiante> getEstudiantes(){
		List<Estudiante> estudiantes = new EstudianteDAO().getEstudiantesSortDNI();
		System.out.println(estudiantes);
		return estudiantes;
//		return IntStream.
//				range(0, 20).
//				mapToObj(i -> new Estudiante(legajo, nombre, apellido, edad, genero, dni, ciudad_residencia)).collect(Collectors.toList());
	}
}
