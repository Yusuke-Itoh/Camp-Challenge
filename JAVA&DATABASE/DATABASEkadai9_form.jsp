<%-- 
    Document   : DATABASEkadai9_form
    Created on : 2016/07/13, 11:58:59
    Author     : maimaimai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DATABASEkadai9" method="post">
            <ul>
                ID:<input type="text" name="ID">
            </ul><ul>
                名前:<input type="text" name="name">
            </ul><ul>        
                電話番号:<input type="text" name="tell">
            </ul><ul>
                年齢:<input type="text" name="age">
            </ul><ul>
                誕生日:<input type="text" name="birthday">
            </ul><ul>
                <input type="submit" value="送信">
            </ul>
        </form>
    </body>
</html>
