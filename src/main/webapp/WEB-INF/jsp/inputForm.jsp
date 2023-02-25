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

		<form:select path="workingHoursInCurrentMonth">
        		    <form:option value="160" label="January"/>
        		    <form:option value="160" label="February"/>
        		    <form:option value="176" label="March"/>
        		    <form:option value="152" label="April"/>
        		    <form:option value="152" label="May"/>
        		    <form:option value="176" label="June"/>
        		    <form:option value="168" label="July"/>
        		    <form:option value="184" label="August"/>
        		    <form:option value="160" label="September"/>
        		    <form:option value="168" label="October"/>
        		    <form:option value="176" label="November"/>
        		    <form:option value="152" label="December"/>
        		</form:select>

		<br><br>

                Method of payment:
        		1 : 1 <form:radiobutton path="methodOfPayment" value="1"/>
        		1 : 1.5 <form:radiobutton path="methodOfPayment" value="1.5"/>
        		1 : 2 <form:radiobutton path="methodOfPayment" value="2"/>

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