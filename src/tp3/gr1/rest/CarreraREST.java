package tp3.gr1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tp3.gr1.entidades.Carrera;

@Path("/carreras")
public class CarreraREST {
	
	@GET
	  @Path("/listaCarreras")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Carrera> getListaCarreras() {
	      List<Carrera> carreras = LectorCicloVida.carrera.getCarreras();
	      List<Carrera> result = new ArrayList<Carrera>();
	      
	      for (Carrera carrera : carreras) {
			result.add(new Carrera(carrera));
		}
	      return result;
	  }
}
