/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-01-06 10:33:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class practice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1546747372592L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Documents/NetBeansProjects/Jquery/build/web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- responsive--><meta name=\"viewport\" content=\"width = device-width,initial-scale = 1.0,maximum - scale = 1.0 ,user-scalable=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"resources/css/bootstrap-grid.min.css\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/animate.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background:#fff;\n");
      out.write("                color:#5f5f5f;\n");
      out.write("                font-size:Arial;\n");
      out.write("                font-size:12px;\n");
      out.write("            }\n");
      out.write("            .container-fluid\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                width:960px;\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            header\n");
      out.write("            {\n");
      out.write("                background:#fff;\n");
      out.write("                border-top:10px solid #2485ca;\n");
      out.write("                height:118px;\n");
      out.write("                border-bottom: 1px solid #e1e1e1;\n");
      out.write("            }\n");
      out.write("            .services\n");
      out.write("            {\n");
      out.write("                border-top:46px solid #efefef;\n");
      out.write("                border-bottom:44px solid #efefef;\n");
      out.write("                margin:0;\n");
      out.write("                background:#2383c9;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .services h1\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("                padding-top:35px;\n");
      out.write("                padding-bottom:44px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                font-size:40px;\n");
      out.write("            }\n");
      out.write("            footer\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                height:87px;\n");
      out.write("                border-top:8px solid #efefef;\n");
      out.write("                background-color:#2077c4;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .right\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("                font-size:12px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                padding-top:18px;\n");
      out.write("                padding-bottom:46px;\n");
      out.write("                margin:0;\n");
      out.write("            }\n");
      out.write("            .left\n");
      out.write("            {\n");
      out.write("                color:#d2e2f0;\n");
      out.write("                font-size:12px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                padding-top:18px;\n");
      out.write("                padding-bottom:46px;\n");
      out.write("                margin:0;\n");
      out.write("                padding-right: 64px;\n");
      out.write("            }\n");
      out.write("            .top\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                justify-content:space-between;\n");
      out.write("                padding-top:28px;\n");
      out.write("            }\n");
      out.write("            input[type=text]\n");
      out.write("            {\n");
      out.write("                padding-left:9px;\n");
      out.write("                border:none;\n");
      out.write("                width:191px;\n");
      out.write("                height:31px;\n");
      out.write("                position:relative;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            header .col-md-12 .search form\n");
      out.write("            {\n");
      out.write("                border : 1px solid black;\n");
      out.write("                border-radius:5px;\n");
      out.write("            }\n");
      out.write("            .row.right\n");
      out.write("            {\n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("            .row .menu ul\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                list-style-type: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .row .menu ul a li\n");
      out.write("            {\n");
      out.write("                font-size:12px;\n");
      out.write("                height:40px;\n");
      out.write("                width:74px;\n");
      out.write("                padding-bottom: 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .row .menu ul a li.service\n");
      out.write("            {\n");
      out.write("                background:#efefef;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 top\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"\"><img src=\"resources/images/logo.png \" ></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"search\">\n");
      out.write("                                <form action=\"\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Search:\">\n");
      out.write("                                    <a href=\"\"><img src=\"resources/images/search-icon.png\"></a>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row right clearfix\">\n");
      out.write("                        <div class=\"menu\" >\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"\"><li>Home</li></a>\n");
      out.write("                                <a href=\"\"><li class=\"service\">Service</li></a>\n");
      out.write("                                <a href=\"\"><li>Project</li></a>\n");
      out.write("                                <a href=\"\"><li>About us</li></a>\n");
      out.write("                                <a href=\"\"><li>Contact us</li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container-fluid services\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1>Services.</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <section class=\"col-md-8\">\n");
      out.write("                        Main Container\n");
      out.write("                    </section>\n");
      out.write("                    <aside class=\"col-md-4\">\n");
      out.write("                        Aside\n");
      out.write("                    </aside>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 left\">\n");
      out.write("                        © Copyright 2009. Your Site Name Dot Com. All Rights Reserved\n");
      out.write("                        Home | Contact | RSS \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 right text-right\">\n");
      out.write("                        Design by DreamTemplate \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/isotope-layout@3/dist/isotope.pkgd.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/imagesloaded.pkgd.min.js\"></script>\n");
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
