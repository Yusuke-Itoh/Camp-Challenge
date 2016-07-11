<%-- 
    Document   : DataOuyou1
    Created on : 2016/07/07, 13:32:58
    Author     : maimaimai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession hs = request.getSession();
    String a = "";
    String b = "";
    String c = "";
    if(hs.getAttribute("txtName") != null){a = (String)hs.getAttribute("txtName");}
    if(hs.getAttribute("seibetu") != null){b = (String)hs.getAttribute("seibetu");}
    if(hs.getAttribute("mulText") != null){c = (String)hs.getAttribute("mulText");}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <form action="DataOuyou2" method="post">
    名前:<input type="text" name="txtName" value="<%=a%>">
    <br>
    
    男:<input type="radio" name="seibetu" value="男" <%if(b.equals("男")){%>checked="checked"<%}%>>
    <br>
    女:<input type="radio" name="seibetu" value="女" <%if(b.equals("女")){%>checked="checked"<%}%>>
    <br>
    趣味:<textarea name="mulText"><%=c%></textarea>
    <br>
    <input type="submit" value="更新">
    </body>
</html>
