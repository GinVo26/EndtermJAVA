/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-12-31 05:50:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bai5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"resources/css/bootstrap-grid.min.css\" type=\"text/css\" >\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin:0;\n");
      out.write("                padding: 0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: white;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .jquery-accordion{\n");
      out.write("                width: 40%;\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("            .khoi h3{\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                padding:  10px 12px;\n");
      out.write("                color: #212121;\n");
      out.write("                border-radius:  1px;\n");
      out.write("                text-align:  center;\n");
      out.write("                box-shadow: 1px 2px 2px rgb(0,0,0,0.23);\n");
      out.write("            }\n");
      out.write("            .noi-dung {\n");
      out.write("                padding: 10px 12px;\n");
      out.write("                border: 1px #212121 solid;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function()\n");
      out.write("            {\n");
      out.write("                $(\".noi-dung\").slideUp();\n");
      out.write("                $(\".khoi h3\").on('click',function(event)\n");
      out.write("                {\n");
      out.write("                    $(this).next().fadeToggle();\n");
      out.write("                    \n");
      out.write("        \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!-- tự làm bằng jquery -->\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"jquery-accordion\">\n");
      out.write("                <div class=\"khoi\">\n");
      out.write("                    <h3>Collapse 1</h3>\n");
      out.write("                    <div class=\"noi-dung\">\n");
      out.write("                        Similique ut, inventore, voluptatibus, eros inventore. Aptent sociis. Delectus suscipit rhoncus hic. Fames ex gravida, suspendisse, cum temporibus, dicta diamlorem dignissimos illo eos venenatis mus aenean pulvinar ut? Tempore ultricies! Maecenas quisquam unde commodi. Morbi vitae? Laoreet lobortis penatibus convallis cupidatat eget soluta magna? Aspernatur fugiat repudiandae diamlorem? Delectus, laborum accumsan rem non magna, dui ullamco! Magnam ab consequuntur laoreet. Sit montes? Laudantium, veritatis, sit? Blandit nec venenatis, laboris minus dolorem explicabo! Elementum ducimus mollis! Sagittis. Nec, morbi similique rem. Posuere ipsa necessitatibus malesuada. Adipiscing quas harum corrupti aliquet nostrud quod faucibus morbi mollit! Venenatis dolore itaque repellendus autem, nisl\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end div khoi -->\n");
      out.write("                <div class=\"khoi\">\n");
      out.write("                    <h3>Collapse 2</h3>\n");
      out.write("                    <div class=\"noi-dung\">\n");
      out.write("                        Similique ut, inventore, voluptatibus, eros inventore. Aptent sociis. Delectus suscipit rhoncus hic. Fames ex gravida, suspendisse, cum temporibus, dicta diamlorem dignissimos illo eos venenatis mus aenean pulvinar ut? Tempore ultricies! Maecenas quisquam unde commodi. Morbi vitae? Laoreet lobortis penatibus convallis cupidatat eget soluta magna? Aspernatur fugiat repudiandae diamlorem? Delectus, laborum accumsan rem non magna, dui ullamco! Magnam ab consequuntur laoreet. Sit montes? Laudantium, veritatis, sit? Blandit nec venenatis, laboris minus dolorem explicabo! Elementum ducimus mollis! Sagittis. Nec, morbi similique rem. Posuere ipsa necessitatibus malesuada. Adipiscing quas harum corrupti aliquet nostrud quod faucibus morbi mollit! Venenatis dolore itaque repellendus autem, nisl\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end div khoi -->\n");
      out.write("                <div class=\"khoi\">\n");
      out.write("                    <h3>Collapse 3</h3>\n");
      out.write("                    <div class=\"noi-dung\">\n");
      out.write("                        Similique ut, inventore, voluptatibus, eros inventore. Aptent sociis. Delectus suscipit rhoncus hic. Fames ex gravida, suspendisse, cum temporibus, dicta diamlorem dignissimos illo eos venenatis mus aenean pulvinar ut? Tempore ultricies! Maecenas quisquam unde commodi. Morbi vitae? Laoreet lobortis penatibus convallis cupidatat eget soluta magna? Aspernatur fugiat repudiandae diamlorem? Delectus, laborum accumsan rem non magna, dui ullamco! Magnam ab consequuntur laoreet. Sit montes? Laudantium, veritatis, sit? Blandit nec venenatis, laboris minus dolorem explicabo! Elementum ducimus mollis! Sagittis. Nec, morbi similique rem. Posuere ipsa necessitatibus malesuada. Adipiscing quas harum corrupti aliquet nostrud quod faucibus morbi mollit! Venenatis dolore itaque repellendus autem, nisl\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end div khoi -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- l;àm accordion bằng bootstrap -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"accordion\" id=\"accordionExample\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingOne\">\n");
      out.write("                                <h5 class=\"mb-0\">\n");
      out.write("                                    <button class=\"btn btn-link\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                        Collapsible Group Item #1\n");
      out.write("                                    </button>\n");
      out.write("                                </h5>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"collapseOne\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingTwo\">\n");
      out.write("                                <h5 class=\"mb-0\">\n");
      out.write("                                    <button class=\"btn btn-link collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                        Collapsible Group Item #2\n");
      out.write("                                    </button>\n");
      out.write("                                </h5>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                <h5 class=\"mb-0\">\n");
      out.write("                                    <button class=\"btn btn-link collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                        Collapsible Group Item #3\n");
      out.write("                                    </button>\n");
      out.write("                                </h5>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button type=\"button\" id=\"btn-top\">back to top</button>\n");
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
