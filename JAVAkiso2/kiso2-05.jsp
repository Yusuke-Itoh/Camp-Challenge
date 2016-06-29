<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%

//課題５
  int x = 0;
  int y = 0;
  for(int i= 0;i<=100;i++){
    x = x + y;
    y = y + 1;
}
  out.print(x);



%>
</body>
</html>