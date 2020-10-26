
<%
	String name = request.getParameter("username");
String pass = request.getParameter("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<link rel="stylesheet" href="css/style.css">

<title>Login Form</title>
</head>
<body>
	<h1>Login Form</h1>

	<%
		//	if ((name != null && !name.equals("")) && (pass != null && pass.equals("12345"))) {
	if (name != null && !name.equals("")) {
		if (pass != null && pass.equals("123456")) {
	%>
	<h3>Hello</h3>
	<%
		out.print(name);
	}} else {
	%>
	<form method="GET">
		<label>Username</label> <input type="text" name="username" /> <br>
		<br> <label>password</label> <input type="password" name="password" />
		<br> <br> <input type="submit" value="login" />
	</form>
	<%}
	%>
</body>
</html>


