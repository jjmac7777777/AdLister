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
    <title>Title</title>
  </head>
  <body>
<%
        if(request.getMethod().equalsIgnoreCase("post")) {
            if (request.getParameter("UserName").equals("admin"))
                        &&request.getParameter("password").equals("password") {
            }
            response.sendRedirect("/profile.jsp");
        }
%>
  </body>
</html>
