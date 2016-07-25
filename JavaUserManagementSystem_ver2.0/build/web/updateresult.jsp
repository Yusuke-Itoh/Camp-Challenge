<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<%=udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= jh.exTypenum(udb.getType())%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br><br>
        以上の内容で登録しました。<br><br>
        
        <form action="ResultDetail" method="POST">
            <input type="submit" name="NO" value="詳細画面に戻る" style="width:100px"><br><br>
            <input type="hidden" name="mode" value="REINPUT">
        </form>

    <%=jh.home()%>
    </body>
</html>
