<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Employee Details View</title>
</head>
<body>

<h2>Dear Employee, please enter your details</h2>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    Department:
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>
