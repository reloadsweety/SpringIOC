<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body style="background: -webkit-linear-gradient(left top, red, yellow);">
<div align="center">
<h1> ADD OR EDIT</h1>
<form:form action="addOrEditEmployee" >
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
	       <td><form:input path="employeeNumber" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="firstName">FIRSTNAME : </form:label></td>
	       <td><form:input path="firstName" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="lastName">LASTNAME :</form:label></td>
	       <td><form:input path="lastName" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="extension">EXTENSION :</form:label></td>
	       <td><form:input path="extension" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="email">EMAIL :</form:label></td>
	       <td><form:input path="email" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="officeCode">OFFICECODE :</form:label></td>
	       <td><form:input path="officeCode" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="reportsTo">REPORTSTO :</form:label></td>
	       <td><form:input path="reportsTo" /></td>
	   	</tr>
	   	<tr>
	       <td align="right"><form:label path="jobTitle">JOBTITLE :</form:label></td>
	       <td><form:input path="jobTitle"/></td>
	   	</tr>
   		<tr>
   			<td align="center" colspan="2"><input type="submit"  value="Submit"/></td>
   		</tr>
	</table>
	</form:form>
</div>
</body>
</html>