<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body style="background: red">
        <div align="center">
         <h1>EMPLOYEE LIST <a href="viewNewEmployee"> NEW</a></h1>
            <table border="1">
            <tr> <td>NO</td>  <td>EMPLOYEENUMBER</td>  <td>FIRSTNAME</td> <td>LASTNAME</td><td>EXTENSION</td>
            <td>EMAIL</td><td>OFFICECODE</td><td>REPORTSTO</td><td>JOBTITLE</td><td colspan="2">ACTION</td></tr>
                <c:forEach var="emp" items="${employeeList}" varStatus="status">
                <tr>
                
                    <td>${status.index + 1}</td>
                    <td>${emp.employeeNumber}</td>
                    <td>${emp.firstName}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.extension}</td>
                    <td>${emp.email}</td>
                    <td>${emp.officeCode}</td>
                    <td>${emp.reportsTo}</td>
                    <td>${emp.jobTitle}</td>
<%--                      <td colspan="2">  <a href="deleteEmployee/${emp.employeeNumber}">[ Delete ]</a> <a href="viewEditEmployee">  [ Edit ]</a></td>         --%>
                     <td colspan="2">  <a href="deleteEmployee/${emp.employeeNumber}">[ Delete ]</a> <a href="viewEditEmployee/${emp.employeeNumber}">  [ Edit ]</a></td>        
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>