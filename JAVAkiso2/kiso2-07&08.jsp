<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%@ page import="java.util.ArrayList" %>
<%

//課題７
    ArrayList<String> al = new ArrayList<String>();
    
    al.add("10");
    al.add("100");
    al.add("soeda");
    al.add("hayashi");
    al.add("-20");
    al.add("118");
    al.add("ED");

//課題８
    out.print(al.get(2) + "<br>");
    al.set(2, "33");
    out.print(al.get(2));


%>


</body>
</html>