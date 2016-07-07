<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>



<html lang="en">

<body>
<%
	request.setAttribute("rnd",new Random().nextInt());
%>
<c:if test="${ rnd %2==1 }">
	<h1>${ rnd }</h1>
	¡¡¡¡ADMINÄúºÃ!! //body²¿·Ö
</c:if>

<c:if test="${ rnd  %2==0 }">
	<h1>${ rnd }</h1>
	¡¡¡¡Hello World
</c:if>
</body>

</html>