<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>


	<h1>Simple Calculator</h1>
	<%
		String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
	int sub = Integer.parseInt(num1) - Integer.parseInt(num2);
	int mul = Integer.parseInt(num1) * Integer.parseInt(num2);
	int div = Integer.parseInt(num1) / Integer.parseInt(num2);
	out.println("Sum =" + sum);
	%>
	<br/>

	<%
		out.println("Subtraction =" + sub);
	%>
	<br/>
	<%
		out.println("Multiplication  =" + mul);
	%>
		<br/>
	
	<%
		out.println("Division =" + div);
	%>



</body>
</html>