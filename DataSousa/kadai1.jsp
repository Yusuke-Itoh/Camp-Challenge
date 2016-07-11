<%-- 
    Document   : kadai1
    Created on : 2016/07/07, 11:28:07
    Author     : maimaimai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  
    <form action="kadai2" method="post">
    名前:<input type="text" name="txtName">
    <br>
    男:<input type="radio" name="seibetu" value="男">
    <br>
    女:<input type="radio" name="seibetu" value="女">
    <br>
    趣味欄:<textarea name="mulText"></textarea>
    <br>
    <input type="submit" value="送信">
    
    
    </body>
</html>
