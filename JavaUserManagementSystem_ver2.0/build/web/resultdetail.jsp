<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataBeans ubd = (UserDataBeans)session.getAttribute("udb");
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMSユーザー情報詳細画面</title>
    </head>
    <body>
        <h1>詳細情報</h1>

        名前:<%= ubd.getName()%><br>
        生年月日:<%= ubd.getYear()%>/<%=ubd.getMonth()%>/<%=ubd.getDay()%><br>
        種別:<%= jh.exTypenum(ubd.getType())%><br>
        電話番号:<%= ubd.getTell()%><br>
        自己紹介:<%= ubd.getComment()%><br>
        登録日時:<%= ubd.getNewDate()%><br>
        <form action="Update" method="POST">
            <input type="submit" name="update" value="変更" style="width:100px">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
        <br>
        <form action="Delete" method="POST">
        <input type="submit" name="delete" value="削除" style="width:100px">
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
        <br><br>
        <%=jh.home()%>
    </body>
</html>
