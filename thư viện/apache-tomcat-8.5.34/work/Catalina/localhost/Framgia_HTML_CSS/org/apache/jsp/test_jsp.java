/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-02-25 01:11:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Test </title>\n");
      out.write("        <link href=\"css/reponsive.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/style2.css \" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("                <hr class=\"bentraiqua\">\n");
      out.write("                <p>Ảnh Mùa Xuân</p>\n");
      out.write("                <hr class=\"benphaiqua\">\n");
      out.write("            </center>\n");
      out.write("            <section class=\"xuan\">\n");
      out.write("\n");
      out.write("                <figure class=\"xuann1\">\n");
      out.write("                    <img class=\"xuan1\" src=\"img/muaxuan1.jpg\">\n");
      out.write("                    <figcaption class=\"gachngang\">\n");
      out.write("                        <h2><strong>Cô gái du xuân</strong></h2>\n");
      out.write("                        <h3>Mừng xuân tân hợi 2019</h3>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("                <figure class=\"xuann2\">\n");
      out.write("                    <img class=\"xuan2\" src=\"img/muaxuan2.jpg\">\n");
      out.write("                    <figcaption>\n");
      out.write("                        <h2 class=\"chu\">Chú</h2>\n");
      out.write("                        <h2 class=\"thoo\">thỏ </h2>\n");
      out.write("                        <h2 class=\"trong\">trong</h2>\n");
      out.write("                        <h2 class=\"chau\">chậu</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("\n");
      out.write("                </figure>\n");
      out.write("                <figure class=\"xuann3\">\n");
      out.write("                    <img class=\"xuan3\" src=\"img/muaxuan3.jpg\">\n");
      out.write("                    <figcaption class=\"xeolai\">\n");
      out.write("                        <h2 class=\"xuan3chu1\">Thời</h2>\n");
      out.write("                        <h2 class=\"xuan3chu2\">Khắc</h2>\n");
      out.write("                        <h2 class=\"xuan3chu3\">Giao</h2>\n");
      out.write("                        <h2 class=\"xuan3chu4\">Mùa</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!--Kêt thúc Xuân-->\n");
      out.write("            <!--Phần Hạ-->\n");
      out.write("            <div class=\"chiacat\"></div>\n");
      out.write("            <center>\n");
      out.write("                <hr class=\"bentraiqua\">\n");
      out.write("                <p>Ảnh Mùa Hạ</p>\n");
      out.write("                <hr class=\"benphaiqua\">\n");
      out.write("            </center>\n");
      out.write("            <section class=\"ha\">\n");
      out.write("\n");
      out.write("                <figure class=\"haa\">\n");
      out.write("                    <img class=\"ha1\" src=\"img/muahe1.jpg\">\n");
      out.write("                    <figcaption class=\"manden\">\n");
      out.write("                        <h2 class=\"haaa\"><pre>\n");
      out.write("                        Tháng năm rồi phượng hồng về trước ngõ\n");
      out.write("                        Phố đông người bụi đỏ những hàng cây\n");
      out.write("                        Sao vội vã giọt mưa đầu bất chợt\n");
      out.write("                        Đón em về thương cả những bàn tay.</pre></h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("                <figure class=\"ha2\">\n");
      out.write("                    <img class=\"ha22\" src=\"img/muahe2.jpg\">\n");
      out.write("                    <figcaption class=\"manden\">\n");
      out.write("                        <h2>Mùa hè ở bãi biển</h2>\n");
      out.write("                        <h2>Ghé thăm những bãi biển đẹp mộng mơ khi du lịch</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("                <figure class=\"ha3\">\n");
      out.write("                    <img class=\"ha33\" src=\"img/muahe3.jpg\">\n");
      out.write("                    <figcaption class=\"mandenn\">\n");
      out.write("                        <h2>Mùa hè bát ngát ở bãi biển Từ Nham</h2>\n");
      out.write("                        <h2>Du lịch những bãi biển mới lạ</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("            </section>\n");
      out.write("            <!--Kết thúc phần mùa hạ -->\n");
      out.write("            <!--Phần mùa thu-->\n");
      out.write("            <div class=\"chiacat\"></div>\n");
      out.write("            <center>\n");
      out.write("                <hr class=\"bentraiqua\">\n");
      out.write("                <p>Ảnh Mùa Thu</p>\n");
      out.write("                <hr class=\"benphaiqua\">\n");
      out.write("            </center>\n");
      out.write("            <section class=\"thu\">\n");
      out.write("\n");
      out.write("                <figure class=\"thuu\">\n");
      out.write("                    <img class=\"thu1\" src=\"img/muathu1.jpg\">\n");
      out.write("                    <figcaption class=\"daucheo\">\n");
      out.write("                        <h2>\n");
      out.write("                            Thu là mùa của nỗi nhớ ,của hoài niệm</h2>\n");
      out.write("                        <h2>\n");
      out.write("                            Nhưng không phải mùa để nhớ,và đau về những nỗi buồn cũ.</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("                <figure class=\"thuuu\">\n");
      out.write("                    <img class=\"thu2\" src=\"img/muathu2.jpg\">\n");
      out.write("                    <figcaption class=\"vongtron\">\n");
      out.write("                        <h2>Hãy để cuộc đời đẹp như hoa mùa hạ</h2>\n");
      out.write("                        <h2>,và cái chết đẹp như là mùa thu</h2>\n");
      out.write("\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("                <figure class=\"thuuuu\">\n");
      out.write("                    <img class=\"thu3\" src=\"img/muathu3.jpg\">\n");
      out.write("                    <figcaption class=\"hinhvuong\">\n");
      out.write("                        <h2>Mùa hè ở bãi biển</h2>\n");
      out.write("                        <h2>Ghé thăm những bãi biển đẹp mộng mơ khi du lịch</h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("            </section>\n");
      out.write("            <!--Kết thúc mùa thu -->\n");
      out.write("            <div class=\"chiacat\"></div>\n");
      out.write("            <center>\n");
      out.write("                <hr class=\"bentraiqua\">\n");
      out.write("                <p>Ảnh Mùa Đông</p>\n");
      out.write("                <hr class=\"benphaiqua\">\n");
      out.write("            </center>\n");
      out.write("            <!--Bắt đầu màu đông -->\n");
      out.write("            <section class=\"dong\">\n");
      out.write("\n");
      out.write("                <figure class=\"dongg\">\n");
      out.write("                    <img class=\"dong1\" src=\"img/muadong1.jpg\">\n");
      out.write("                    <figcaption class=\"daugachduoi\">\n");
      out.write("                        <h2>\n");
      out.write("                            Đông này vẫn giống đông xưa</h2>\n");
      out.write("                        <h2>\n");
      out.write("                            vẫn đi xe dream ,vẫn chưa có pồ :(( </h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("                <figure class=\"donggg\">\n");
      out.write("                    <img class=\"dong2\" src=\"img/muadong2.jpg\">\n");
      out.write("                    <figcaption class=\"hinhhvuong\">\n");
      out.write("                        <h2>xuân sang hạ tới thu qua đông về</h2>\n");
      out.write("                        <h2>Trời nặng màu chì,\n");
      out.write("                            Ù ì gió bấc,\n");
      out.write("                            Vật vờ bờ tre</h2>\n");
      out.write("\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("                <figure class=\"dongggg\">\n");
      out.write("                    <img class=\"dong3\" src=\"img/muadong3.jpg\">\n");
      out.write("                    <figcaption class=\"hinhvuongnghien\">\n");
      out.write("                        <h2 class=\"icon1 vitritrong\"><i class=\"fab fa-facebook-square\"></i></h2>\n");
      out.write("                        <h2 class=\"icon2 vitritrong\"><i class=\"fab fa-facebook-messenger\"></i></h2>\n");
      out.write("                        <h2 class=\"icon3 vitritrong\"><i class=\"fab fa-twitter\"></i></h2>\n");
      out.write("                        <h2 class=\"icon4 vitritrong\"><i class=\"fab fa-google-plus\"></i></h2>\n");
      out.write("                        <h2></h2>\n");
      out.write("                    </figcaption>\n");
      out.write("                </figure>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
