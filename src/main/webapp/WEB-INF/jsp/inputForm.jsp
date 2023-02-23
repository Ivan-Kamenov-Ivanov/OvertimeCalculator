<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>IMS Overtime Calculator</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="employee">

	    <h1>IMS Overtime Calculator</h1>

	    <br><br>

		Income: <form:input path="income" />

		<br><br>

		Worked hours: <form:input path="workedHours" />

		<br><br>

		Working hours: <form:input path="workingHoursInCurrentMonth" />

		<br><br>

		<input type="submit" value="Calculate" />

	</form:form>

    <br><br>

        <a href="https://kik-info.com/spravochnik/calendar/2023/">Check working hours for current month</a>

    <br><br>
    <br><br>


        Today's date: <%= (new java.util.Date()).toLocaleString()%>

</body>

</html>