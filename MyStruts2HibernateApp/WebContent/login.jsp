<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
 	<s:form action="login">
        <s:textfield name="user.username" label="Username"/>
        <s:password name="user.password" label="Password"/>
        <s:submit value="Login"/>
      
    </s:form>
      <a href="register.jsp"><button>Register</button></a>
</body>
</html>