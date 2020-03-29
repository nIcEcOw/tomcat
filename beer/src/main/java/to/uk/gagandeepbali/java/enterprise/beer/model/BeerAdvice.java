package to.uk.gagandeepbali.java.enterprise.beer.model;

import java.util.ArrayList;
import java.util.List;

public class BeerAdvice {
	
	public List < String > getBrands ( String colour ) {
		List < String > brands = new ArrayList < String > ();
		if ( colour.equalsIgnoreCase ( "amber" ) ) {
			brands.add ( "Dark Amber" );
			brands.add ( "Red Moose" );
		} else {
			brands.add ( "Pale Ale" );
			brands.add ( "Dout Stout" );
		}
		
		return brands;
	}
}