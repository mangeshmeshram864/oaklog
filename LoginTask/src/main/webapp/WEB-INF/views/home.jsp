<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
<title>Jmailer</title>

<spring:url value="/resources/core/css/jmailer.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<body>
   <div align="center">
    <h1>REgisteration And login page</h1>
      <table>
      
        <tr><td><a href="${pageContext.request.contextPath}/employee/register">Register</a><td></tr>
        <tr><td><a href="${pageContext.request.contextPath}/employee/login">login</a><td></tr>
        
      </table>
   
   </div>

</body>

</html>