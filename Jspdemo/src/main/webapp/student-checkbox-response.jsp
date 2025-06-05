<html>
<head><title>Student Confirmation Title</title></head>

<body>
The student is confirmed :${param.FirstName} ${param.LastName}
<br/><br/>


<ul>
<%
String[] langs=request.getParameterValues("favoritelanguage");
for(String tempLang: langs){
	out.println("<li>"+tempLang+"</li>");
}
%>
</ul>
</body>
</html>