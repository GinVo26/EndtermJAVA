/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-12-22 23:56:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.employee;
import dao.PersonalDAO;

public final class QuanLyNghiPhep_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.PersonalDAO");
    _jspx_imports_classes.add("model.employee");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản Lý Ngày Nghỉ Của Nhân Viên</title>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/fullcalendar.css\" />\n");
      out.write("        <link href=\"cssAdmin/widgets.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/style-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/xcharts.min.css\" rel=\" stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"  />\n");
      out.write("        <style>\n");
      out.write("            #bang {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bang td, #customers th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bang trtd:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #bang tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            #bang th\n");
      out.write("            {   \n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color:  white;\n");
      out.write("            }\n");
      out.write("            .blue-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .brown-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .dark-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .green-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .fa-temperature-high\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 415px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0);\n");
      out.write("                color: white;\n");
      out.write("                font-size: 30px;\n");
      out.write("                margin-top: 6px;\n");
      out.write("            }\n");
      out.write("            #Searchhhh\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 178px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0);\n");
      out.write("                color: white;\n");
      out.write("                font-size:17px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            input[type=text]\n");
      out.write("            {\n");
      out.write("                background-color: rgba(0,0,0,0);\n");
      out.write("                border-radius: 6px;\n");
      out.write("                color: #f2ffff;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                background-color: rgba(0,0,0,0);\n");
      out.write("                border-radius: 6px;\n");
      out.write("                color: #f2ffff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body style=\"background: url(images/bann.jpg) fixed;font-size: 14px !important;\">\n");
      out.write("        <section id=\"container\" class=\"\">\n");
      out.write("            ");

                if (session.getAttribute("user") == null) {
                    response.sendRedirect("404.jsp");
                }
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                <!--main content start-->\n");
      out.write("                <section id=\"main-content\" style=\"padding-top: 39px;\">\n");
      out.write("                    <section class=\"wrapper\">\n");
      out.write("                        <!--overview start-->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <h3 class=\"page-header\"><i class=\"fa fa-laptop\"></i>Hồ Sơ Nhân Viên</h3>\n");
      out.write("                                <div style=\"margin-left:423px;font-size:22px;margin-top:-31px;\">\n");
      out.write("                                ");

                                    String sua = (String) request.getAttribute("sua");
                                    if (sua != null) {
                                
      out.write("\n");
      out.write("                                <i class=\"far fa-smile-beam\" style=\"color:red;margin-right: 6px;\"></i><span style=\"color:red;\">");
out.print(sua); 
      out.write("</span>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <ol class=\"breadcrumb\" style=\"background-color: rgba(0, 0, 0, 0.34);\">\n");
      out.write("                                <li><i class=\"fa fa-home\"></i><a href=\"indexAdmin.jsp\">Home</a></li>\n");
      out.write("                                <li><i class=\"fa fa-laptop\"></i>Hồ Sơ Nhân Viên</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <div>\n");
      out.write("                    <i class=\"fas fa-temperature-high\">Quản Lý Nghỉ Phép</i>\n");
      out.write("                    <span id=\"Searchhhh\"><a href=\"\"><i style=\" opacity:0.7;\" class=\"fas fa-search\"></i></a><input style=\"color:red;opacity:0.7;width:257px;border-radius:14px;background-color: rgba(0, 0, 0, 0.34);\" type=\"text\" placeholder=\"Tìm Kiếm Theo Tên\" /></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div>\n");
      out.write("                    <table id=\"bang\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>STT</th>\n");
      out.write("                            <th>Họ Và Tên</th>\n");
      out.write("                            <th>SSN</th>\n");
      out.write("                            <th>Số Ngày Nghỉ</th>\n");
      out.write("                            <th>Tùy Chỉnh</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            int count = 0;
                            for (employee e : PersonalDAO.getAllEmployee()) {
                                count++;
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getLast_Name() + e.getFrist_Name());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getSSN());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getVacation_Days());
      out.write("</td>\n");
      out.write("                            <td><form action=\"XuLyNgayNghi\" method=\"GET\"><i class=\"fas fa-wrench\">Sửa Ngày Nghỉ</i>\n");
      out.write("                                    <input type=\"text\" name=\"ngaynghi\" placeholder=\"Nhập Số\">\n");
      out.write("                                    <input type=\"hidden\" name=\"Employee_ID\" value=\"");
      out.print(e.getEmolyee_id());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"Sửa\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
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
