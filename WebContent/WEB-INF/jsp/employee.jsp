<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Form di inserimento dati</title>
		<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="js/jquery.validate.js"></script>
		<script src="js/my-form.js"></script>
	</head>
	<body>${message}
		<form class="form" id="myForm" name="myForm" method="post" action="registerProcess">
			<fieldset>
				<legend>Please provide your first name, your last name and your age</legend>
				<p>
					<label for="first">First name:</label>
					<input id="first" name="first" type="text"/> <br/>
				</p>
				<p>
					<label for="last">Last name:</label>
					<input id="last" name="last" type="text"/> <br/>
				</p>
				<p>
					<label for="age">Age:</label>
					<input id="age" name="age" type="text"/> <br/>
				</p>
				<p>
					<input class="submit" type="submit" value="Submit"/>
				</p>
			</fieldset>
		</form>
	</body>
</html>