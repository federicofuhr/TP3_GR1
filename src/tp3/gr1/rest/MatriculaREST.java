package tp3.gr1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tp3.gr1.entidades.Matricula;

@Path("/matriculas")
public class MatriculaREST {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addMatricula(Matricula m) {
		LectorCicloVida.matricula.insert(m);
	}
}
