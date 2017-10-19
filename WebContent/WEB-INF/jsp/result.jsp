<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
	<head>
	  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	  <title>Esito inserimento DB</title>
	</head>
	<body>
	  <h3>Inserimento avvenuto con successo!</h3>
      <table>
         <tr>
            <td>First name:</td>
            <td>${emp[1]}</td>
         </tr>
         <tr>
            <td>Last name:</td>
            <td>${emp[2]}</td>
         </tr>
         <tr>
            <td>Age:</td>
            <td>${emp[0]}</td>
         </tr>
      </table>
   </body>
</html>