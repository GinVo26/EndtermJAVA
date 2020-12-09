

<%@page import="model.Users"%>
<%@page import="dao.ChoThueDAO"%>
<%@page import="model.ChoThue"%>
<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông Tin Sản Phẩm</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" />
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
        <style>
            .a1
            {
                width:100%;
                height:auto;
                margin-bottom: 50px;
            }
            .a1 .a2
            {
                width:80%;
                height:auto;
                margin: 0 auto;
            }
            #inline
            {
                display: inline;
            }
        </style>
    </head>
    <body style="background:url(video/background.jpg) fixed">
        <%

            ChoThue c = ChoThueDAO.getChoThueByID(Integer.parseInt(request.getParameter("ChoThueID")));

        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="a1">
                <div class="a2">
                    <div style="float: right;position: relative;margin-top: 23px;margin-right: 6px;font-size: 20px;">

                    </div>
                    <div class="single">
                        <div>
                            <a href="#">
                                <img class="a2-1" style="border: 2px solid #312f2c;float: left;height: 390px;width: 450px; margin-left: 75px;" src="<%=c.getChothue_hinhanh()%>" alt="" >
                        </a>
                    </div>

                    <div class="as">

                        <p style="font-size: 28px;color: white;padding-left:729px;background-color:rgba(0,0,0,0.4);;border-top-right-radius: 45px;">Thông Số Sản Phẩm<p>
                        <div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Tên Sản Phẩm</strong><span style="margin-left:100px;"><%=c.getChothue_tieude()%></span> </p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Nhà Sản Xuất</strong><span style="margin-left:108px;"><%=c.getChothue_loainhadat()%></span></p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Giá</strong><span style="margin-left:193px;"><%=c.getChothue_gia()%> Triệu VNĐ</span></p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Hệ Điều Hành</strong><span style="margin-left:110px;"><%=c.getChothue_huongnha()%></span></p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Màn Hình</strong><span style="margin-left:142px;"><%=c.getChothue_diadiem()%></span></p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Pin</strong><span style="margin-left:197px;"><%=c.getChothue_hoten()%></span></p></div>
                            <div style="border: 2px hidden #00c6d7;border-top-right-radius: 23px;color: white;"><p style="padding-left:591px;font-size:18px;"><i></i><strong>Năm Sản Xuất</strong><span style="margin-left:103px;"><%=c.getChothue_dienthoai()%></span></p></div>
                        </div>

                        <div class="top-content" style="float: right;position: relative;margin-top: -86px;">
                            <div class="white" style="line-height: 17px;margin-left: 383px;margin-top: 87px;">
                                <%
                                    Cart cart = (Cart) session.getAttribute("cart");
                                    if (!cart.getCartItems().containsKey(c.getChothue_id())) {
                                %>
                                <a  href="CartServlet?command=plus&chothueID=<%=c.getChothue_id()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">Lưu Thông Tin</a>
                                <%
                                } else {
                                %>
                                <a href=""  style="cursor:unset;background:black;line-height: 17px;margin-left: 383px;margin-top: 3px;" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Đã Lưu</a>
                                <%
                                    }
                                %>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="bottom-content" style="margin-left: 35% ;position: relative;margin-top: 100px;">
                            <div class="white" style="line-height: 17px;margin-left: 383px;margin-top: 54px;">
                                <a class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 "> MUA

                                </a>

                            </div>
                        </div>

                    </div>
                    <div class="clearfix"> </div>    
                </div>
                <div class="as1" style="border: 2px solid black;height: auto;" >
                    <p style="background:rgba(0,0,0,0.4);color: white;font-size: 25px;padding-left: 486px;padding-top: 10px;padding-bottom: 10px;">Mô tả chi tiết</p>
                    <p style="padding-left: 26px;padding-right:26px;font-size:20px;color:white;"><%=c.getChothue_mota()%></p>
                    <div class="clearfix"> </div>

                </div>

                <div class="clearfix"> </div>
                <div style="margin-top: 56px;border: 1px solid white;background: rgba(255,255,255, 0.3);">
                    <div class="fb-comments" data-href="http://localhost:8081/PXOStore/single.jsp?productID=<%=request.getParameter("productID")%>" data-width="700" data-numposts="5"></div><div>
                    </div>
                </div>


            </div>
        </div>
    </div>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
