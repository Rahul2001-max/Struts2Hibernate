<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Details Page</h1>
 	<s:form action="user">
        <s:textfield name="user.username" label="Username"/>
        <s:submit value="submit"/>
    </s:form>
</body>
</html>