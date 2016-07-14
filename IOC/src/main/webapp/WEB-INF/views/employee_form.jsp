<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

	.error {
		color: #ff0000;
	}
</style>
</head>
<body style="background: -webkit-linear-gradient(left top, red, yellow);">
<div align="center">
<h1> ADD OR EDIT</h1>
<form:form action="addOrEditEmployee" modelAttribute="emp" method="post">
	<table border="0"> 
<!-- 		<tr><td align="right">EMPLOYEENUMBER :</td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">FIRSTNAME : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">LASTNAME : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">EXTENSION : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">EMAIL : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">OFFICECODE : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">REPORTSTO : </td><td><input type="text" value=""/></td></tr> -->
<!-- 		<tr><td align="right">JOBTITLE: </td><td><input type="text" value=""/></td></tr> -->
		
<%-- 		   <td>${status.index + 1}</td> --%>
<%--                     <td>${emp.employeeNumber}</td> --%>
<%--                     <td>${emp.firstName}</td> --%>
<%--                     <td>${emp.lastName}</td> --%>
<%--                     <td>${emp.extension}</td> --%>
<%--                     <td>${emp.email}</td> --%>
<%--                     <td>${emp.officeCode}</td> --%>
<%--                     <td>${emp.reportsTo}</td> --%>
<%--                     <td>${emp.jobTitle}</td> --%>
		
		<tr>
	       <td align="right"><form:label path="employeeNumber">EMPLOYEENUMBER : </form:label></td>
	       <td><form:input path="employeeNumber" id="employeeNumber"/><form:errors path="employeeNumber" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="firstName">FIRSTNAME : </form:label></td>
	       <td><form:input path="firstName" id="firstName"/> <form:errors path="firstName" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="lastName">LASTNAME :</form:label></td>
	       <td><form:input path="lastName" id="lastName"/> <form:errors path="lastName" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="extension">EXTENSION :</form:label></td>
	       <td><form:input path="extension"/><form:errors path="extension" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="email">EMAIL :</form:label></td>
	       <td><form:input path="email" /><form:errors path="email" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="officeCode">OFFICECODE :</form:label></td>
	       <td><form:input path="officeCode" /><form:errors path="officeCode" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="reportsTo">REPORTSTO :</form:label></td>
	       <td><form:input path="reportsTo" id="reportsTo"/><form:errors path="reportsTo" cssClass="error"/></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="jobTitle">JOBTITLE :</form:label></td>
	       <td><form:input path="jobTitle" /><form:errors path="jobTitle" cssClass="error"/></td>
	   	</tr>
   		<tr>
   			<td align="center" colspan="2"><input type="submit"  value="Submit"/></td>
   		</tr>
	</table>
	</form:form>
</div>
</body>
</html>