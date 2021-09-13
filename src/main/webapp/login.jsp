<%--
  Created by IntelliJ IDEA.
  User: johnmccloskey
  Date: 9/7/21
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Login</title>

</head>
<body>
<%@include file="partials/navbar.jsp"%>
<%@include file="partials/head.jsp"%>

<%--<p> "username" parameter: <%=request.getParameter("UserName")%></p>--%>
<%--<p> "password" parameter: <%=request.getParameter("password")%></p>--%>

<%
//    String username = request.getParameter("UserName");
//    String password = request.getParameter("password");
//    String requestMethodType = request.getMethod();

    if(request.getMethod().equalsIgnoreCase("POST")) {
        if (request.getParameter("UserName").equals("admin"));
                        request.getParameter("password").equals("password"); {
        }
        response.sendRedirect("/profile.jsp");
    }
%>


<form action="login.jsp" method="post">
    <label for="UserName">UserName</label>
    <input id="UserName" name="UserName" type="text">
    <br>

    <label for="password">password</label>
    <input id="password" name="password" type="text">
    <br>

    <input type="submit">

<%--    <p>"UserName: ${UserName}</p>--%>
<%--    <p>"password: ${password}</p>--%>
</form>






</body>
</html>
