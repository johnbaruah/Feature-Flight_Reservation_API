<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Flight Details</h2>
	Flight Number : ${flight.flightNumber }<br/>
	Operating Airlines : ${flight.operatingAirlines }<br/>
	Departure City : ${flight.departureCity }<br/>
	Arrival City : ${flight.arrivalCity }<br/>
	Date of Departure : ${flight.dateOfDeparture }<br/>
	Estimated Departure Time : ${flight.estimatedDepartureTime }<br/>
	<h2>Enter Passenger Details</h2>
	<form action="completeReservation" method="post">
		<pre>
			First Name: <input type="text" name="firstName"/>
			Last Name: <input type="text" name="lastName"/>
			Middle Name: <input type="text" name="middleName"/>
			Email Id: <input type="email" name="email"/>
			Phone No: <input type="number" name="phone"/>
			<input type="hidden" name="flightId" value="${flight.id}"/>
			<br/>
			<h2>Enter Payment Details</h2>
			Name On the Card: <input type="text" name="nameOnTheCard"/>
			Card Number: <input type="text" name="cardNumber"/>
			Expiry Date: <input type="text" name="expiryDate"/>
			CVV: <input type="number" name="cvv"/>
			<input type="submit" value="complete Reservation"/>
		</pre>
	</form>
</body>
</html>