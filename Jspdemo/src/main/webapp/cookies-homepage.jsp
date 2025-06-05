<html>

<body>
	<h3>Training Portal</h3>

	<!-- read the favorite programing language cookie -->
	<%

//the default....if there are no cookies
String favLang = "Java";

//get the cpookies from the browser request
Cookie[] theCookies = request.getCookies();

//find the favorite language cookie
if(theCookies != null){
	
	for(Cookie tempCookie : theCookies){
		
		if("myApp.favoriteLanguage".equals(tempCookie.getName()))
		{
			favLang = tempCookie.getValue();
			break;
			
		
		}
		}
}
%>

	<!-- now show a personalize page--use the "favLang variable -->

	<!-- show new books for this Lang -->
	<h4>
		New Books for<%=favLang %></h4>
		
		
		<ul>
		<li>blah blah blah</li>
		<li>blah blsh blsh</li>
		
		</ul>
		
		<h4>
		Latest reports for<%=favLang %></h4>
		
		
		<ul>
		<li>blah blah blah</li>
		<li>blah blsh blsh</li>
		
		</ul>
		
		<h4>
		Jobs for<%=favLang %></h4>
		
		
		<ul>
		<li>blah blah blah</li>
		<li>blah blsh blsh</li>
		
		
		</ul>
		
		<hr>
		
		<a href="cookie-personalize-form.html">Personalize this page</a>
</body>
</html>