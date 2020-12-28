<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Employee Details View</title>
</head>
<body>

<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
<br>

Your name: ${employee.name}
<br>
Your name: ${employee.surname}
<br>
Your name: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Your phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}

</body>
</html>
