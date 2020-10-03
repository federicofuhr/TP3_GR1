package tp3.gr1.rest;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Application;

import tp3.gr1.controller.CarreraDAO;
import tp3.gr1.controller.EstudianteDAO;
import tp3.gr1.controller.MatriculaDAO;

/**
 * Servlet implementation class LectorCicloVida
 */

@WebListener
public class LectorCicloVida  implements ServletContextListener{
	
	   public static EstudianteDAO estudiante = null;
	    public static MatriculaDAO matricula= null;
	    public static CarreraDAO carrera= null;

		@Override
		public void contextInitialized(ServletContextEvent sce) {
			estudiante = new EstudianteDAO();
			matricula = new MatriculaDAO();
			carrera = new CarreraDAO();
//			try {
//				Application.csv();
//			} catch (IOException ioException) {
//				System.out.print(ioException);
//			}

		}}
