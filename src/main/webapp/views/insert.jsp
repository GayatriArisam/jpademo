<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>

<body>
<a href="insert">Add New Employee.....</a>
<div class="container-fluid">

    <form:form action="insertEmp" modelAttribute="emp" method="post">
    <table>
        <tr><td>Empno</td><td><form:input path="empid" />  </td></tr>
        <tr><td>Ename</td><td><form:input path="ename" /> </td></tr>
        <tr><td>Gender</td><td><form:input path="gender" /> </td></tr>
        <tr><td><input type="submit" class="btn btn-primary" />  </td></tr>
    </table>
    </form:form>


</body>
</html>
<c:out value="${S}"/>

