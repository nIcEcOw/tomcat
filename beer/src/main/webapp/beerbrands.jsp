<%@page import="java.util.List, java.util.Iterator" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Beer Brands</title>
	</head>
	<body>
		<h1>Beer Brands: </h1>
		<br />
		<%
			List < String > beerBrands = ( List < String > ) request.getAttribute ( "beerBrands" );
			Iterator iterator = beerBrands.iterator ();
			while ( iterator.hasNext () ) {
				out.println ( "Try: " + iterator.next () );
			}
		%>
	</body>
</html>