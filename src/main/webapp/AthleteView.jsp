<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Athlete Here</title>
<style>
 body {
            background-image: url("search.jpg");
             background-size: cover;
            color: white;
            font-size: 20px;
           
        }

</style>
</head>
<body>

	<form action="search">
	
		<pre>
       <label><b style="font-family:'Times New Roman', Times, serif;color:black">Search By Name:</b></label>
    <input type="text" name="name" placeholder="name*" /><br>
        <input type="submit" value="Search" />
        </pre>
       
	</form>
	<div style="color:black"><b>
	${dt.name}
	${dt.age}
	${dt.country}
	${dt.state}
	${dt.city}
	${dt.sports}
	</b>
	</div>
	
	<h4 style="color:black">${message}</h4>
	
<!-- 	<div> -->
<!-- 	<br> -->
<%-- 	<h1>${fail}</h1> --%>
<!-- 	<br> -->
	
	
	
	
	
	
</body>
</html>