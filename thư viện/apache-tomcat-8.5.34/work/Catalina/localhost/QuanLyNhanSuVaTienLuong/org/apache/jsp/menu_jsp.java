/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-12-22 23:54:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Menu</title>\n");
      out.write("        <!-- javascripts -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui-1.10.4.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.9.2.custom.min.js\"></script>\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- nice scroll -->\n");
      out.write("        <script src=\"js/jquery.scrollTo.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- charts scripts -->\n");
      out.write("        <script src=\"assets/jquery-knob/js/jquery.knob.js\"></script>\n");
      out.write("        <script src=\"js/jquery.sparkline.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <!-- jQuery full calendar -->\n");
      out.write("        <script src=\"js/fullcalendar.min.js\"></script>\n");
      out.write("        <!-- Full Google Calendar - Calendar -->\n");
      out.write("        <script src=\"assets/fullcalendar/fullcalendar/fullcalendar.js\"></script>\n");
      out.write("        <!--script for this page only-->\n");
      out.write("        <script src=\"js/calendar-custom.js\"></script>\n");
      out.write("        <script src=\"js/jquery.rateit.min.js\"></script>\n");
      out.write("        <!-- custom select -->\n");
      out.write("        <script src=\"js/jquery.customSelect.min.js\"></script>\n");
      out.write("        <script src=\"assets/chart-master/Chart.js\"></script>\n");
      out.write("\n");
      out.write("        <!--custome script for all page-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <!-- custom script for this page-->\n");
      out.write("        <script src=\"js/sparkline-chart.js\"></script>\n");
      out.write("        <script src=\"js/easy-pie-chart.js\"></script>\n");
      out.write("        <script src=\"js/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("        <script src=\"js/xcharts.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.autosize.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.placeholder.min.js\"></script>\n");
      out.write("        <script src=\"js/gdp-data.js\"></script>\n");
      out.write("        <script src=\"js/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/sparklines.js\"></script>\n");
      out.write("        <script src=\"js/charts.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"  />\n");
      out.write("        <script>\n");
      out.write("            //knob\n");
      out.write("            $(function () {\n");
      out.write("                $(\".knob\").knob({\n");
      out.write("                    'draw': function () {\n");
      out.write("                        $(this.i).val(this.cv + '%')\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //carousel\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#owl-slider\").owlCarousel({\n");
      out.write("                    navigation: true,\n");
      out.write("                    slideSpeed: 300,\n");
      out.write("                    paginationSpeed: 400,\n");
      out.write("                    singleItem: true\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //custom select box\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("                $('select.styled').customSelect();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            /* ---------- Map ---------- */\n");
      out.write("            $(function () {\n");
      out.write("                $('#map').vectorMap({\n");
      out.write("                    map: 'world_mill_en',\n");
      out.write("                    series: {\n");
      out.write("                        regions: [{\n");
      out.write("                                values: gdpData,\n");
      out.write("                                scale: ['#000', '#000'],\n");
      out.write("                                normalizeFunction: 'polynomial'\n");
      out.write("                            }]\n");
      out.write("                    },\n");
      out.write("                    backgroundColor: '#eef3f7',\n");
      out.write("                    onLabelShow: function (e, el, code) {\n");
      out.write("                        el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"cssAdmin/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- bootstrap theme -->\n");
      out.write("        <link href=\"cssAdmin/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("        <!--external css-->\n");
      out.write("        <!-- font icon -->\n");
      out.write("        <link href=\"cssAdmin/elegant-icons-style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- full calendar css-->\n");
      out.write("        <link href=\"assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- easy pie chart-->\n");
      out.write("        <link href=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/owl.carousel.css\" type=\"text/css\">\n");
      out.write("        <link href=\"cssAdmin/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/fullcalendar.css\">\n");
      out.write("        <link href=\"cssAdmin/widgets.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/style-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/xcharts.min.css\" rel=\" stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--sidebar start-->\n");
      out.write("        ");

            if (session.getAttribute("user") == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <aside>\n");
      out.write("            <div id=\"sidebar\" class=\"nav-collapse \">\n");
      out.write("                <!-- sidebar menu start-->\n");
      out.write("                <ul class=\"sidebar-menu\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a id=\"a\" href=\"indexAdmin.jsp\">\n");
      out.write("                            <i class=\"icon_house_alt\"></i>\n");
      out.write("                            <span>Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"a\" href=\"QuanLyNhanVienMoi.jsp\">\n");
      out.write("                            <i class=\"fas fa-child\"></i>\n");
      out.write("                            <span>Quản Lý Cộng Tác Viên</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"\" href=\"QuanLyNhanVienChinhThuc.jsp\">\n");
      out.write("                            <i class=\"fas fa-users\"></i>\n");
      out.write("                            <span>Quản Lý Nhân Viên Chính Thức</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"\" href=\"QuanLyNgayVao.jsp\">\n");
      out.write("                            <i class=\"fas fa-calendar-alt\"></i>\n");
      out.write("                            <span>Quản Lý Kỷ Niệm Ngày Vào</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"\" href=\"QuanLyLuong.jsp\">\n");
      out.write("                            <i class=\"fas fa-hand-holding-usd\"></i>\n");
      out.write("                            <span>Quản Lý Lương</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"\" href=\"QuanLySN.jsp\">\n");
      out.write("                            <i style=\"margin-left:0px;\" class=\"fas fa-birthday-cake\"></i>\n");
      out.write("                            <span>Quản Lý Sinh Nhật</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"\" href=\"QuanLyNghiPhep.jsp\">\n");
      out.write("                            <i class=\"fas fa-temperature-low\"></i>\n");
      out.write("                            <span>Quản Lý Ngày Nghỉ</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- sidebar menu end-->\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        <!--sidebar end-->\n");
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
