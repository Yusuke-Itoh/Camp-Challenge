<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%


//課題1０

  String moto = request.getParameter("moto");
  int motoA = Integer.parseInt(moto);
  out.print("元の値：" + motoA + "<br>"+ "1ケタの素因数：");

  while(motoA % 2 == 0){
    out.print(2);
    out.print(" ");
    motoA /= 2;
  }

  while(motoA % 3 == 0){
    out.print(3);
    out.print(" ");
    motoA /= 3;
}
  while(motoA % 5 == 0){
    out.print(5);
    out.print(" ");
    motoA /= 5;
}
  while(motoA % 7 == 0){
    out.print(7);
    out.print(" ");
    motoA /= 7;
}
  if(motoA > 10){
    out.print("<br>"+"その他：" + motoA);

}

%>
</body>
</html>