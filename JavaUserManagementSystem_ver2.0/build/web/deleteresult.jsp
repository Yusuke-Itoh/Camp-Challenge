<%@page import="jums.JumsHelper"%>
<%JumsHelper jh = JumsHelper.getInstance();%>
<%HttpSession hs = request.getSession();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除結果画面</title>
    </head>
    <body>
    <h1>削除確認</h1>
    削除しました。<br><br>
    
    <form action="SearchResult" method="POST">
        <input type="submit" name="NO" value="検索結果に戻る" style="width:100px"><br><br>
        <input type="hidden" name="mode" value="REINPUT">
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
    </form>
    <br><br>
    <%=jh.home()%>
    </body>
</html>
