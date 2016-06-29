<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%

//課題１
  int num = 2;
  String mes =" ";
  switch(num){
      case 1:
         mes ="one";
         break;
      case 2:
         mes ="two";
         break;
      default:
         mes ="想定外";
}
   out.print(mes);

%>
</body>
</html>