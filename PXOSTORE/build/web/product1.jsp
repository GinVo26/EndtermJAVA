
<%@page import="model.Users"%>
<%@page import="model.ChoThue"%>
<%@page import="dao.ChoThueDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sản Phẩm</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" />
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($)
            {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function ()
            {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 100,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>    
    </head>
    <body style="background:url(video/background.jpg) fixed">
        <jsp:include page="header.jsp"></jsp:include>
        <%
            ChoThueDAO x = new ChoThueDAO();
            String category_tablet_id = "";
            if (request.getParameter("category") != null) {
                category_tablet_id = request.getParameter("category");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            int pages = 0, firstResult = 0, maxResult = 0, total = 0;
            if (request.getParameter("pages") != null) {
                pages = Integer.parseInt(request.getParameter("pages"));
            }
            
            
            


        %>

        <div class="container">
            <div class="content">
                <div class="content-top">
                    <h2 style="color: white; text-align: center;">SẢN PHẨM</h2>
                    <h3 class="future" style="margin-left: 60px"></h3>
                    <%                        for (ChoThue c : ChoThueDAO.getListChoThueByChapNhan(Integer.parseInt(category_tablet_id))) {
                    %>
                    <div class="col-md-3 md-col" style="margin-top:30px;">
                        <div  class="col-md" style="background:rgba(0,0,0,0.4)">
                            <div><i class="fas fa-home" style="color: white;" ><%=c.getChothue_loainhadat()%></i><span><i style="padding-left: 53px;float: right;color: white;" class="far fa-calendar-alt"><%=c.getChothue_ngaydang()%></i></span></div>
                            <div class="clearfix"></div> 
                            <a href="single2.jsp?ChoThueID=<%=c.getChothue_id()%>"><img  src="<%=c.getChothue_hinhanh()%>" style="height: 253px;" alt="<%=c.getChothue_tieude()%>" /></a>	
                            <div class="top-content">
                                <h5><a style="color:white; font-size: 20px" href="single.jsp?ChoThueID=<%=c.getChothue_id()%>"><%=c.getChothue_tieude()%></a></h5>

                                <%
                                    Users users = null;
                                    if (session.getAttribute("user") != null) {
                                        users = (Users) session.getAttribute("user");
                                    }
                                    if (users != null) {
                                %>
                                <div class="white">
                                    <%
                                        if (!cart.getCartItems().containsKey(c.getChothue_id())) {
                                    %>
                                    <a href="CartServlet1?command=add&ChoThueID=<%=c.getChothue_id()%>" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Lưu Thông Tin</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="#" style="cursor:unset;background:black;" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Đã Lưu</a>
                                    <%
                                        }
                                    %>
                                    <p class="dollar"><span><%=c.getChothue_gia()%></span><span>Tr</span><span class="in-dollar">VNĐ</span></p>
                                    <div class="clearfix"></div>
                                </div>
                                <%
                                    }
                                %>

                            </div>							
                        </div>
                    </div>
                    <%
                        }
                    %>                                   
                    <div class="clearfix"></div>
                </div>
            </div>
            <ul class="start">
                <% int i = 1;%>
                <li ><a href="product1.jsp?category=<%=category_tablet_id%>&pages=<%=i%>"><i></i></a></li>
                            <% for (i = 1; i <= (total / 4) + 1; i++) {%>
                <li class="arrow"><a href="product.jsp?category=<%=category_tablet_id%>&pages=<%=i%>"><%=i%></a></li>
                    <% }%>
                <li ><a href="product1.jsp?category=<%=category_tablet_id%>&pages=<%=i = (total / 4) + 1%>"><i  class="next"> </i></a></li>

            </ul>
        </div>
    </div>
    <!---->

    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
