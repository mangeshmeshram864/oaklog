<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
 
 
  <h1>Employee loginForm</h1>
  <s:form action="${pageContext.request.contextPath}/employee/login" method="post">
   <table style="with: 80%">
    
    <tr>
     <td>Employee Id :</td>
     <td><s:input path="e_loginId" /></td>
     <td><s:error path="e_name" cssStyle="color:red" /></td>
    </tr>
    <tr>
     <td>Password :</td>
       <td><s:input path="e_password" /></td>
     <td><s:error path="e_password" cssStyle="color:red" /></td>
    </tr>
    <tr>
   <td></td>
   


   </table>
   <input type="submit" value="Login" />
  </s:form>
  
  <tr>
     <td>
      <td><a href="${pageContext.request.contextPath}/employee/register">Register</a>
          <a href="$"{pageContext.request.contextPath}/">Home</a>
     </td>
  </tr>
  
  
 </div>
 <div>
   <p style="color:red;">${failed}</p>
 </div>
</body>
</html>