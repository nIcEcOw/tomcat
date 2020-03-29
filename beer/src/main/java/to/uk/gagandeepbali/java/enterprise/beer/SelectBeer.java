package to.uk.gagandeepbali.java.enterprise.beer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectBeer extends HttpServlet {
	
	@Override
	public void doPost ( HttpServletRequest request, HttpServletResponse response ) 
													throws IOException, ServletException {
		PrintWriter writer = response.getWriter ();
		response.setContentType ( "text/html" );
		writer.println ( "REQUEST: " + request + " \nRECEIVED COLOUR: " + request.getParameter ( "colour" ) );
		
		writer.close ();
	}
}