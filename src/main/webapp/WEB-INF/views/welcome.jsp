<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis Player Application</title>
</head>
<body>
    <h1> Welcome to my Application inside JSP</h1>
    <h2> JSP Player Name is :<i> ${jspPlayerName} </i></h2>
    <%@page import="java.time.LocalDate"%>
    <%
    System.out.println("Hello From the JSP file inside sout: "+ request.getAttribute("jspPlayerName"));
    LocalDate getCurrentDate = LocalDate.now();
    System.out.println(getCurrentDate);
    %>

<h1>Today Date is: <%= getCurrentDate %></h1>

<form action="/player.do" method="post">
<label> Player Name : </label>
    <input type="text" name="name" />
    <input type="submit" value="Enter" />
</form>

</body>
</html>