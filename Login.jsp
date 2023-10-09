<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
    
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function ValidateEmail(emailId)
{
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(emailId.value.match(mailformat))
    {
        document.getElementById('password').focus();
        return true;
    }
    else
    {
        alert("You have entered an invalid email address!");
        document.getElementById('emailId').focus();
        return false;
    }
}
</script>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
 
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
 
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}
 
button:hover {
  opacity: 0.8;
}
 
.cancelbutton {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}
 
.container {
  padding: 20px;
}
 
span.psw {
  float: right;
  
}
 
/* Change styles for span and cancel button
   on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbutton {
     width: 100%;
  }
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
    <!-- We should have a servlet in order to process the form in
          server side and proceed further -->
    <form action="<%=request.getContextPath()%>/Userservletinfo" method="post" onclick="ValidateEmail(document.getElementById('emailId'))">
         <div class="container">
    <label for="username"><b>Email</b></label>
    <input type="text" placeholder="Please enter your email" name="emailId" id = "emailId" required>
 
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Please enter Password" name="password" id="password" required>
         
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="rememberme"> Remember me
    </label>
  </div>
 
  <div class="container" style="background-color:#f1f1f1">
    <span class="psw">New User? <a href="<%=request.getContextPath()%>/Index.jsp">Please Login!!!</a></span>
  </div>
    </form>

<%
String data=(String) request.getAttribute("message");
if(data!=null)
{
	out.println(data);
}
%>
</body>
</html>