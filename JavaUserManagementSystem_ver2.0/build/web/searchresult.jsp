<%@page import="jums.UserDataBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    ArrayList<UserDataBeans> udbList = (ArrayList<UserDataBeans>)request.getAttribute("udbList");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <%for(int i=0;i<udbList.size();i++){%>
            <tr>
                <td><a href="ResultDetail?id=<%= udbList.get(i).getUserID()%>"><%= udbList.get(i).getName()%></a></td>
                <td><%= udbList.get(i).getYear()%></td>
                <td><%= jh.exTypenum(udbList.get(i).getType())%></td>
                <td><%= udbList.get(i).getNewDate()%></td>
                 </tr>
                 <%}%>
        </table>
        <br><br>
        <%=jh.home()%>
    </body>
    
</html>
