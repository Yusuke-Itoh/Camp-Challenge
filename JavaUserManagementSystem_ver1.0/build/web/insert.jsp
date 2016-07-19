<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>

<%//課題１%>
<%@page import="jums.JumsHelper" %>

<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = new UserDataBeans();
    //課題５
    //初期値設定
    //セッション内のudbの有無を見る
    //↓
    //Resultでセッション内のデータを捨てるので残ってしまう
    
    //if(hs.getAttribute("udb") != null){
    
    //hiddenで値を参照して、nullじゃなければ初期値の設定をする
    if(request.getParameter("insertFlg") != null){
        udb = (UserDataBeans)hs.getAttribute("udb");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
    
        名前:
        <input type="text" name="name" value="<%=udb.getName()%>"><%//初期値の設定%>
        <br>
        

        生年月日:　
        <select name="year">
            <option value="">----</option>
            <%
                for(int i=1950; i<=2010; i++){ 
            %>
            <option value="<%=i%>" 
                    <%if(i==udb.getYear()){out.print("selected");}%>> <%=i%> </option>
            <%}%>
        </select>年
        <select name="month">
            <option value="">--</option>
            <%for(int i = 1; i<=12; i++){%>
            <option value="<%=i%>" <%if(i==udb.getMonth()){out.print("selected");}%>><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <%for(int i = 1; i<=31; i++){%>
            <option value="<%=i%>" <%if(i==udb.getDay()){out.print("selected");}%>><%=i%></option>
            <% } %>
        </select>日
        <br><br>
<%//種別はvalueが使えない 要調べ%>
        種別:
        <%//getTypeを使って取得した数値でif文書いて分岐%>
        <br>
        <input type="radio" name="type" value="1" <%if(udb.getType() == 1){out.print("checked");}%>>エンジニア<br>
        <input type="radio" name="type" value="2" <%if(udb.getType() == 2){out.print("checked");}%>>営業<br>
        <input type="radio" name="type" value="3" <%if(udb.getType() == 3){out.print("checked");}%>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%=udb.getTell()%>">
        <br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard" value=""><%=udb.getComment()%></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%//課題１%>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
