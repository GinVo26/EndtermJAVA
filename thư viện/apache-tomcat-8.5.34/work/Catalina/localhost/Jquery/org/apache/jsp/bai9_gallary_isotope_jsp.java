/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-01-05 08:47:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bai9_gallary_isotope_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- responsive--><meta name=\"viewport\" content=\"width = device-width,initial-scale = 1.0,maximum - scale = 1.0 ,user-scalable=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"resources/css/bootstrap-grid.min.css\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/animate.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            ul.menu {\n");
      out.write("                width: 800px;\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-around;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul.menu li {\n");
      out.write("                padding: 13px 23px;\n");
      out.write("                box-shadow: 1px 2px 1px 1px rgba(3,306,63,0.4);\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background: rgba(255,2,4,0.4);\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1.title {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.content {\n");
      out.write("                width: 1300px;\n");
      out.write("                height: auto;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img.hinh.all {\n");
      out.write("                width: 24%;\n");
      out.write("                padding: 12px 5px;\n");
      out.write("            }\n");
      out.write("            html\n");
      out.write("            {\n");
      out.write("                font-size: 10px; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("            <li data-type=\"type1\">Loại 1</li>\n");
      out.write("            <li data-type=\"type2\">Loại 2</li>\n");
      out.write("            <li data-type=\"type3\">Loại 3</li>\n");
      out.write("            <li data-type=\"type4\">Loại 4</li>\n");
      out.write("            <li data-type=\"all\">Tất Cả</li>\n");
      out.write("        </ul>\n");
      out.write("        <h1 class=\"title\">Tất Cả</h1>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <img class=\"hinh all type1\" src=\"resources/img/1.png\">\n");
      out.write("            <img class=\"hinh all type2\" src=\"resources/img/2.png\">\n");
      out.write("            <img class=\"hinh all type1\" src=\"resources/img/3.png\">\n");
      out.write("            <img class=\"hinh all type2\" src=\"resources/img/4.png\">\n");
      out.write("            <img class=\"hinh all type4\" src=\"resources/img/5.png\">\n");
      out.write("            <img class=\"hinh all type4\" src=\"resources/img/6.png\">\n");
      out.write("            <img class=\"hinh all type3\" src=\"resources/img/7.png\">\n");
      out.write("            <img class=\"hinh all type4\" src=\"resources/img/8.png\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/isotope-layout@3/dist/isotope.pkgd.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".content\").isotope({\n");
      out.write("\n");
      out.write("                    itemSlector: \"img\"\n");
      out.write("                });\n");
      out.write("                $(\"ul li\").click(function (event)\n");
      out.write("                {\n");
      out.write("                    var type = $(this).attr(\"data-type\");\n");
      out.write("                    console.log(type);\n");
      out.write("                    var ten_loai = $(this).text();\n");
      out.write("                    $(\".title\").text(ten_loai);\n");
      out.write("                    type = \".\" + type;\n");
      out.write("                    $(\".content\").isotope({\n");
      out.write("\n");
      out.write("                        filter: type //lọc class\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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
