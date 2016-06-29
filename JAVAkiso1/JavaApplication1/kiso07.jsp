<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
<%


//課題７

   out.print("1.雑貨" + " ");
   out.print("2.生鮮食品" + " ");
   out.print("3.その他" + "<br>");

  String zak = request.getParameter("zak");
  String syoku = request.getParameter("syoku");
  String oth = request.getParameter("oth");

  int zakka = Integer.parseInt(zak);
  int syokuhin = Integer.parseInt(syoku);
  int others = Integer.parseInt(oth);

  int zakkaA = zakka * 800;
  int syokuhinA = syokuhin * 600;
  int othersA = others * 300;


  int sougaku = zakkaA + syokuhinA + othersA;
  int kosuu = zakka + syokuhin + others;
  int heikin = sougaku / kosuu;
  out.print("総額は" + sougaku + "です。<br>");
  out.print("一個あたりの値段は" + heikin + "です。<br>");




  if(sougaku >= 5000){
      double poi = sougaku * 0.05;
      int point = (int)poi;
      out.print("今回のポイントは" + point + "ポイントです！");
}else if(sougaku >= 3000){
      double poi = sougaku * 0.04;
      int point = (int)poi;
      out.print("今回のポイントは" + point + "ポイントです！");
}

%>
</body>
</html>