<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<div align="centre">
<form action="LoginController" method="Post">
<div>
<jsp:include page="Header.jsp"></jsp:include></div>
<h3>Please Enter Your Username</h3>
<input type="text" name="txtName" required>
<h3>Enter Your Password</h3>
<input type="password" name="txtpassword"  required>
<br><br>
<input type="submit" id="submit" name="submit" value="Submit">

<div>
<jsp:include page="Footer.jsp"></jsp:include>
</div>

</form>

</div>
</body>
</html>