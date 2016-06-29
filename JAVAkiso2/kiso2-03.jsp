<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%
  long hati = 8;
  for(int i= 0;i<20;i++){
    hati =hati*8;
    out.print(hati + "<br>");
  }

%>
</body>
</html>