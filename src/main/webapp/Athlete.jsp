<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        * {
            margin: 0;
            padding: 0;
            font-family: sans-serif;
        }
        
        body {
            background-image: url("sport1.jpg");
             background-size: cover;
            color: white;
            font-size: 20px;
           
        }
        
        .registration-form {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 300px;
        }
        
        .registration-form h1 {
            font-size: 25px;
            text-align: center;
            text-transform: uppercase;
            margin: 40px 0;
            color: cornsilk;
            font-family: 'Times New Roman', Times, serif;
        }
               
        .registration-form input {
            padding: 8px 12px;
            color: black;
            background-color: white;
            border: 1px solid blue;
            cursor: pointer;
            border-radius: 5px;
            width: 105%;
            font-size: 18px;
            font-family: 'Times New Roman', Times, serif;
        }
        
        .select {
            padding: 8px 12px;
            color: black;
            background-color: white;
            border: 1px solid blue;
            cursor: pointer;
            border-radius: 5px;
            width: 115%;
        }
        
        .select:focus,
        .select:hover {
            outline: none;
            border: 1px solid black;
        }
       
        
        .registration-form href:hover {
            color: white;
        }
        .col:hover{
        color:white;
        }
       
    </style>

</head>

</head>
<body >


 <span style="color: white ;"><b style="font-size: 20px">${message}</b></span><br><br> 
 <form action="register" method="post">
<div class="registration-form">
    <h1>Athlete Details</h1>
    <label><b style="font-family:'Times New Roman', Times, serif">NAME:</b></label>
    <input type="text" name="name" placeholder="name*" /><br><br>
    <label><b style="font-family:'Times New Roman', Times, serif">AGE:</b></label>
    <input type="text" name="age" placeholder="age*" /><br><br>

    <label><b style="font-family:'Times New Roman', Times, serif">COUNTRY:</b></label>
    <select name=country class="select">
        <option disabled selected>Select</option>
		   <option value="austrlia">Australia</option>
       <option value="India">India</option>
       <option value="usa">USA</option>
       <option value="china">China</option>
     </select> <br> <br>

    <label><b style="font-family:'Times New Roman', Times, serif">STATE:</b></label>
    <select name=state class="select">
        <option disabled selected>Select</option>
		   <option value="karnataka">Karnataka</option>
       <option value="goa">Goa</option>
       <option value="tamilnadu">Tamilnadu</option>
       <option value="kerala">Kerala</option>
     </select><br><br>

    <label><b style="font-family:'Times New Roman', Times, serif">CITY:</b></label>
    <select name=city class="select">
        <option disabled selected>Select</option>
		   <option value="bijapur">Bijapur</option>
       <option value="banglore">Banglore</option>
       <option value="mysore">Mysore</option>
       <option value="davangere">Davangere</option>
     </select><br><br>

    <label><b style="font-family:'Times New Roman', Times, serif">SPORTS:</b></label>
    <select name=sports class="select">
        <option disabled selected>Select</option>
		   <option value="swimming">Swimming</option>
       <option value="running">Running</option>
       <option value="footBall">FootBall</option>
       <option value="tennis">Tennis</option>
       </select><br><br><br>

    <!--   <label class="spa">DOB</label>     -->
    <!--   <input type="date" name="dob" placeholder="date of birth"><br><br> -->
    <input type="submit" value="save">


</div>
</form>
<div>
<a class="col" href="AthleteView.jsp">View Athlete Details..</a>
</div>
</body>
</html>