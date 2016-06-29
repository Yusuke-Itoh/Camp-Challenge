<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%
  String aka = "A";
  for(int i= 1;i<30;i++){
    aka = aka + "A";
  }
  out.print(aka);

%>
</body>
</html>