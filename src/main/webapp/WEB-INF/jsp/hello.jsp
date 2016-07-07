<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<html>
<body>
<h2>Hello World!</h2>
<p><%= new SimpleDateFormat("HH:mm:dd SSS").format(new Date()) %></p>
<p> Message: ${data}</p>
</body>
</html>
