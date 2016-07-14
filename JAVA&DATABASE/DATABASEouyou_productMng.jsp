<%-- 
    Document   : DATABASEouyou_productMng
    Created on : 2016/07/13, 16:54:12
    Author     : maimaimai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品管理ページ</title>
    </head>
    <body>
            <ul>
                商品管理ページ
            </ul>
        <form action="DATABASEouyou2" method="post">
        　　<ul>
                productID:<input type="text" name="id">
            </ul><ul>
                名前:<input type="text" name="name">
            </ul><ul>
                価格:<input type="text" name="price">
            </ul><ul>
                在庫数:<input type="text" name="stock">
            </ul><ul>    
                <input type="submit" value="商品追加">
            </ul></form><ul><form action="DATABASEouyou3" method="post">
                <input type="submit" value="商品データ一覧へ">
                </ul></form><br>
                    <a href="DATABASEouyou_login.jsp">
                        ログアウト
                    </a>
    </body>
</html>
