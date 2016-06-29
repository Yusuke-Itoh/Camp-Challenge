<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%@ page import="java.util.HashMap" %>

<%
//課題９
    HashMap<String, String> hMap = new HashMap<String, String>();
    
    hMap.put("1", "AAA");
    hMap.put("hello", "world");
    hMap.put("soeda","33");
    hMap.put("20","20");
    out.println(hMap.get("hello"));
%>
</body>
</html>