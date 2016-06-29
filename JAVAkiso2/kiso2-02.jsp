<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%
//課題２
  char aka= 'A';
  String mes =" ";
  switch(aka){
      case 'A':
         mes ="英語";
         out.print(mes);
         break;
      case 'あ':
         mes ="日本語";
         out.print(mes);
         break;
}

%>
</body>
</html>