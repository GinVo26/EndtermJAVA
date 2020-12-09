

<%@page import="dao.ChoThueDAO"%>
<%@page import="model.ChoThue"%>
<%@page import="java.util.HashMap"%>
<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Users"%>
<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
        <script type="text/javascript" src="js/jquery.flexisel.js"></script>
        <style>
            .col-md:hover
            {
                border : 1px solid #00c6d7;
                box-shadow: 2px 2px 16px 0px violet;
            }
            ul.callbacks_tabs.callbacks1_tabs
            {
                left: 45%;
            }
            .col-md{
                transition:1s all ease;
                perspective: 600px;
            }
            .col-md_img{
                overflow: hidden;
            }
            .col-md a img{
                transition: 2s all ease;
            }
            .col-md:hover{
                transform : rotate(5deg);
                box-shadow: 2px 2px 16px 0px violet!important;
            }
            .col-md:hover a img{
                transform: scale(1.2);
            }
        </style>

        <script type="text/javascript">
            $(document).ready(function ()
            {
                $("#luuthongtin").click(function ()
                {

                    $("#luuthongtin").html("Đã Lưu");
                    $("#luuthongtin").css('cursor', 'unset');
                });
            });
        </script>
    </head>
    <body>


        <!---->
        <%
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        <div class="container" style="margin-top: 60px;">
            <div class="content">
                <div class="content-top">
                    <h2 style="color : white; text-align: center;">Danh Mục</h2>
                    <h3 class="future" style="color:white; margin-left: 100px">    </h3>
                    <div class="row">
                        <div class="left col-md-6">
                            <h3 style="color : white;">Điện Thoại</h3>
                        </div>
                        <div class="right col-md-6">
                            <h3 style="color : white;" >Máy Tính Bảng</h3>
                        </div>
                    </div> 
                    

                </div>
            </div>
        </div>


    </body>
</html>
