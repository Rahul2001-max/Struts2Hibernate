<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>Register User</h2>
    <s:form action="register">
        <s:textfield name="username" label="Username"/>
        <s:password name="password" label="Password"/>
        <s:submit value="Register"/>
    </s:form>
</body>
</html>
