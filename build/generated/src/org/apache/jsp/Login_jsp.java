package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(' ');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- saved from url=(0038)https://int305-kademy.firebaseapp.com/ -->\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("        <meta content=\"\" name=\"author\">\n");
      out.write("        <!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("        <link href=\"./login_files/css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/bootstrap-switch.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("        <link href=\"./login_files/select2.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/select2-bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL STYLES -->\n");
      out.write("        <link href=\"./login_files/components-md.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\">\n");
      out.write("        <link href=\"./login_files/plugins-md.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- END THEME GLOBAL STYLES -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("        <link href=\"./login_files/login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- END PAGE LEVEL STYLES -->\n");
      out.write("        <!-- BEGIN THEME LAYOUT STYLES -->\n");
      out.write("        <!-- END THEME LAYOUT STYLES -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://int305-kademy.firebaseapp.com/favicon.ico\"> </head>\n");
      out.write("    <!-- END HEAD -->\n");
      out.write("\n");
      out.write("    <body class=\" login\" waid71fa0d88-5390-4b5b-a2f4-e45fa93d85e2=\"SA password protect entry checker\">\n");
      out.write("        <!-- BEGIN LOGO -->\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"https://int305-kademy.firebaseapp.com/index.html\">\n");
      out.write("                <img src=\"./login_files/kademy.png\" width=\"80\" height=\"80\" alt=\"\"> </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- END LOGO -->\n");
      out.write("        <!-- BEGIN LOGIN -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- BEGIN LOGIN FORM -->\n");
      out.write("            <form class=\"login-form\" action=\"/Kademy_OneForAll/LoginServlet\" method=\"post\" novalidate=\"novalidate\">\n");
      out.write("                <h3 class=\"form-title font-green\">Sign In</h3>\n");
      out.write("                <div class=\"alert alert-danger display-hide\">\n");
      out.write("                    <button class=\"close\" data-close=\"alert\"></button>\n");
      out.write("                    <span> Enter any username and password. </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">Username</label>\n");
      out.write("                    <input class=\"form-control form-control-solid placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"Username\" name=\"Username\"> </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">Password</label>\n");
      out.write("                    <input class=\"form-control form-control-solid placeholder-no-fix\" type=\"password\" autocomplete=\"off\" placeholder=\"Password\" name=\"Password\"> </div>\n");
      out.write("                    <p class=\"form-title font-red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <div class=\"form-actions\">\n");
      out.write("                    <button type=\"submit\" class=\"btn dark\">Login</button>\n");
      out.write("                    <label class=\"rememberme check mt-checkbox mt-checkbox-outline\">\n");
      out.write("                        <input type=\"checkbox\" name=\"remember\" value=\"1\">Remember\n");
      out.write("                        <span></span>\n");
      out.write("                    </label>\n");
      out.write("                    <a href=\"javascript:;\" id=\"forget-password\" class=\"forget-password\">Forgot Password?</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- END LOGIN FORM -->\n");
      out.write("            <!-- BEGIN FORGOT PASSWORD FORM -->\n");
      out.write("            <form class=\"forget-form\" action=\"https://int305-kademy.firebaseapp.com/main.html\" method=\"post\" novalidate=\"novalidate\">\n");
      out.write("                <h3 class=\"font-green\">Forget Password ?</h3>\n");
      out.write("                <p> Enter your e-mail address below to reset your password. </p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"Email\" name=\"email\"> </div>\n");
      out.write("                <div class=\"form-actions\">\n");
      out.write("                    <button type=\"button\" id=\"back-btn\" class=\"btn green btn-outline\">Back</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn dark\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- END FORGOT PASSWORD FORM -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copyright\"> 2016 © KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</div>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("<script src=\"../assets/global/plugins/respond.min.js\"></script>\n");
      out.write("<script src=\"../assets/global/plugins/excanvas.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("        <!-- BEGIN CORE PLUGINS -->\n");
      out.write("        <script src=\"./login_files/jquery.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/bootstrap.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/js.cookie.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/jquery.slimscroll.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/jquery.blockui.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/bootstrap-switch.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END CORE PLUGINS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("        <script src=\"./login_files/jquery.validate.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/additional-methods.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./login_files/select2.full.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL SCRIPTS -->\n");
      out.write("        <script src=\"./login_files/app.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("        <script src=\"./login_files/login.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("        <!-- BEGIN THEME LAYOUT SCRIPTS -->\n");
      out.write("        <!-- END THEME LAYOUT SCRIPTS -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</body></html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
