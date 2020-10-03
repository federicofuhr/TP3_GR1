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

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Estudiante> getEstudiantes(){
//		List<Estudiante> estudiantes = new EstudianteDAO().getEstudiantesSortDNI();
//		System.out.println("ENTRO AL METODO");
//		return estudiantes;
//		//return mapToObj(new Estudiante(0, "legajo", "nombre", 0, "apellido", 0, null)).collect(Collectors.toList());
//	}
	
	
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
	 
	 

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Estudiante> getEstudiantes(){
//		List<Estudiante> estudiantes = new EstudianteDAO().getEstudiantesSortDNI();
//		System.out.println(estudiantes);
//		return estudiantes;
////		return IntStream.
////				range(0, 20).
////				mapToObj(i -> new Estudiante(legajo, nombre, apellido, edad, genero, dni, ciudad_residencia)).collect(Collectors.toList());
//	}

}
