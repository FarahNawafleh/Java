<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Simple Calculator</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<h2>In this Example I used (method="post")</h2>

	<form method="post">
	
		<label>Number 1</label><input type="text" name="num1" /> <br /> <br />
		<label>Number 2</label><input type="text" name="num2" /> <br /> <br />
		<select name="option">
			<option value="select">Select</option>
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select> <input type="submit" value="calculate" />
		<br />
	<br /> 
	<h3> Result = </h3>
		<%
		if (request.getParameter("num1") != null) {
		int a, b;
		String c;
		a = Integer.parseInt(request.getParameter("num1"));
		b = Integer.parseInt(request.getParameter("num2"));
		c = request.getParameter("option");
		if (c.equals("+")) {
			out.println(a + b);
		} else if (c.equals("-")) {
			out.println(a - b);
		} else if (c.equals("*")) {
			out.println(a * b);
		} else if (c.equals("/")) {
			out.println(a / b);
		}
	}
	%>
	</form>
	
	

</body>
</html>