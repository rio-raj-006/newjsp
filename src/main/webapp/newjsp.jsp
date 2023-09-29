<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String[] name={"Rajkumar", "Mari" ,"Balaji"};
pageContext.setAttribute("Nameslist",name);
%>
<html>
<body>
<c:forEach var="temp" items="${Nameslist}" >
${temp}
</br>
</c:forEach>
</body>
</html>