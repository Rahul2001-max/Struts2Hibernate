<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>User Details</h1>
    ID : <s:property value="%{user.id}" /> <br> 
    Username : <s:property value="%{user.username}" /> <br>
    Password : <s:property value="%{user.password}" /> <br>
	<a href="loginSuccess.jsp">Home page</a>
	<a href="login.jsp">Login Page</a>
</body>
</html>