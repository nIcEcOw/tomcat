package to.uk.gagandeepbali.java.enterprise.beer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to.uk.gagandeepbali.java.enterprise.beer.model.BeerAdvice;

public class SelectBeer extends HttpServlet {
	
	@Override
	public void doPost ( HttpServletRequest request, HttpServletResponse response ) 
													throws IOException, ServletException {
		PrintWriter writer = response.getWriter ();
		response.setContentType ( "text/html" );
		writer.println ( "REQUEST: " + request + " \nRECEIVED COLOUR: " + request.getParameter ( "colour" ) );
		
		BeerAdvice beerAdvice = new BeerAdvice ();
		List < String > beerBrands = beerAdvice.getBrands ( request.getParameter ( "colour" ) );
		Iterator < String > iterator = beerBrands.iterator ();
		while ( iterator.hasNext () ) {
			writer.println ( String.format ( "Try: %s%n", iterator.next () ) );
		}
		
		writer.close ();
	}
}