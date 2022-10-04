<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis Player Application</title>
</head>
<body>
    <h2>
    JSP Player Name is :<i> ${player_Name} </i>
    </h2>

 <%
    System.out.println("Hello From the JSP file inside sout: "+ request.getAttribute("player_Name"));
 %>


 <h1>
 Player Information
 </h1>
 <p>
 Name: ${player_Name} <br>
 Age: ${player_Age} <br>
 Nationality : ${player_Nationality} <br>
 Id: ${player_Id} <br>
 </p>

</body>
</html>