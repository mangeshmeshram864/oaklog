<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
 
 
  <h1>Employee Register Form</h1>
  <form action="${pageContext.request.contextPath}/employee/register" method="post">
   <table style="with: 80%">
    
    <tr>
     <td>Employee Name</td>
     <td><s:input path="e_name" /></td>
     <td><s:error path="e_name" cssStyle="color:red" /></td>
    </tr>
    <tr>
     <td>DOB</td>
       <td><s:input path="e_dob" /></td>
     <td><s:error path="e_dob" cssStyle="color:red" /></td>
    </tr>
    <tr>
     <td>Gender</td>
    <td><s:input path="e_dob" /></td>
     <td><s:error path="e_dob" cssStyle="color:red" /></td>
    </tr>
    <tr>
     <td>Address</td>
   
    <td><s:radiobutton path="e_dob" value="male" name="gender"/>Male
        <s:radiobutton path="e_dob" value="male" name="gender"/>Female</td>
     <td><s:radiobutton path="e_dob" /></td>
    
    </tr>
    <tr>
     <td>City</td>
     <td><s:input path="e_city" /></td>
     <td><s:error path="e_city" cssStyle="color:red" /></td>
    </tr>
    <tr>
     <td>LoginId</td>
     <td><s:input path="e_loginId" /></td>
     <td><s:error path="e_loginId" cssStyle="color:red" /></td>
    </tr>
    
    <tr>
     <td>Password</td>
     <td><s:input path="e_password" /></td>
     <td><s:error path="e_password" cssStyle="color:red" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>