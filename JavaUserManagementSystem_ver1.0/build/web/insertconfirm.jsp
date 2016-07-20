<%@page import="java.util.ArrayList"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>

<%//課題１%>
<%@page import="jums.JumsHelper"%>

<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
    JumsHelper jh= new JumsHelper();
    ArrayList<String> checkList= new ArrayList<String>();
    udb.errcheck(checkList);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <%
    //課題４
    //1．すべてが記入されてるか判断
    //2. 未記入があった場合、if文でそれぞれ見ていき、記述を追加していく
    //JavaBeansにArraylistを生成しておく？
    %>
        <% if(!udb.getName().equals("") && udb.getYear() != 0 && udb.getMonth() != 0 && udb.getDay() != 0
           && !udb.getTell().equals("") && udb.getType() != 0 && !udb.getComment().equals("")){
        //if(checkList.size() == 0){
            String massage ="";
            switch(udb.getType()){
        case 1: massage="エンジニア";break;
        case 2: massage="営業";break;
        case 3: massage="その他";break;
                        }
        
        %>
    
        <h1>登録確認</h1>
        
        <%//課題３
        //udbのgetterを利用して、書き直す%>
        
        名前:<%= udb.getName()%><br>
        <%//以下も変数udbのgetterを使う%>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        <%//typeは表示の判別をする%>
        種別:
        <%= massage%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">            
        <%//課題２%>
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
        
        
    <%}else{%> 
         エラーです。<br> 
     <%}%> 
     <%if(udb.getName().equals("")){ %> 
         名前が未入力です。<br> 
     <%}if(udb.getYear() == 0){%> 
         年が未入力です。<br> 
     <%}if(udb.getMonth() == 0){%> 
         月が未入力です。<br> 
     <%}if(udb.getDay() == 0){%> 
         日が未入力です。<br> 
     <%}if(udb.getTell().equals("")){%> 
         電話番号が未入力です。<br> 
     <%}if(udb.getComment().equals("")){%> 
         自己紹介文が未入力です。<br> 
     <%}%>       
    <%//=jh.insertErr(checkList)%>
    <%//}%>

    <form action="insert.jsp" method="POST"><br>
            <%//課題５
            //hiddenに値を与えておいて、insert.jspで受け取って初期値設定の判断を行う？%>
            <input type="submit" name="no" value="登録画面に戻る">
            <input type="hidden" name="insertFlg" value=reinput>
        </form>
                <%//課題１%>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>