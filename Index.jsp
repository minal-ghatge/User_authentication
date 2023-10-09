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
<form action="<%= request.getContextPath() %>/Userloginservlet" method="get">


 
  <h1>Registration Form</h1>
 
   <table style="with: 80%">
   <tr>
     <td>Emp_ID</td>
     <td><input type="text" name="ID" /></td>
    </tr>
    <tr>
     <td>Name</td>
     <td><input type="text" name="uname" /></td>
    </tr>
    <tr>
     <td>password</td>
     <td><input type="text" name="pass" /></td>
    </tr>
    <tr>
     <td>email</td>
     <td><input type="text" name="mail" /></td>
    </tr>
    <tr>
     <td>city</td>
     <td><input type="text" name="city" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>


</body>
</html>