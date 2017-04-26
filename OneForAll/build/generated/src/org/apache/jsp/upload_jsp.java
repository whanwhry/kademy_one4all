package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n");
      out.write("        <link href=\"./upload_files/css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/bootstrap-switch.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/dropzone.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/basic.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/components-md.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/plugins-md.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\">\n");
      out.write("        <link href=\"./upload_files/custom.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://int305-kademy.firebaseapp.com/favicon.ico\">\n");
      out.write("        <link href=\"./upload_files/cubeportfolio.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/portfolio.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./upload_files/style.css\">\n");
      out.write("        <link href=\"./upload_files/search.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./upload_files/todo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"page-container-bg-solid page-md\" waid71fa0d88-5390-4b5b-a2f4-e45fa93d85e2=\"SA password protect entry checker\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <div class=\"page-wrapper-row\">\n");
      out.write("                <div class=\"page-wrapper-top\">\n");
      out.write("                    <!-- BEGIN HEADER -->\n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                        <!-- BEGIN HEADER TOP -->\n");
      out.write("                        <div class=\"page-header-top\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- BEGIN LOGO -->\n");
      out.write("                                <div class=\"page-logo\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <img src=\"./upload_files/kademy.png\" alt=\"logo\" width=\"70px\" height=\"70px\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END LOGO -->\n");
      out.write("                                <!-- BEGIN RESPONSIVE MENU TOGGLER -->\n");
      out.write("                                <a href=\"javascript:;\" class=\"menu-toggler\"></a>\n");
      out.write("                                <!-- END RESPONSIVE MENU TOGGLER -->\n");
      out.write("                                <!-- BEGIN TOP NAVIGATION MENU -->\n");
      out.write("                                <div class=\"top-menu\">\n");
      out.write("                                    <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("                                        <li class=\"dropdown dropdown-extended dropdown-notification dropdown-dark\" id=\"header_notification_bar\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("                                                <i class=\"icon-bell\"></i>\n");
      out.write("                                                <span class=\"badge badge-default\">7</span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"dropdown-menu\">\n");
      out.write("                                                <li class=\"external\">\n");
      out.write("                                                    <h3>Your\n");
      out.write("                                                        <strong>Notification</strong> tasks</h3>\n");
      out.write("                                                    <a href=\"https://int305-kademy.firebaseapp.com/notification.html\">view all</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <div class=\"slimScrollDiv\" style=\"position: relative; overflow: hidden; width: auto; height: 250px;\"><ul class=\"dropdown-menu-list scroller\" style=\"height: 250px; overflow: hidden; width: auto;\" data-handle-color=\"#637283\" data-initialized=\"1\">\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/video-subject.html\">\n");
      out.write("                                                                    <span class=\"time\">just now</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-success\">\n");
      out.write("                                                                            <i class=\"fa fa-plus\"></i>\n");
      out.write("                                                                        </span> New MTH111 video available </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/question.html\">\n");
      out.write("                                                                    <span class=\"time\">10 mins</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-warning\">\n");
      out.write("                                                                            <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                                                                        </span> New answer on Omise re-brand </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/question.html\">\n");
      out.write("                                                                    <span class=\"time\">30 mins</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-warning\">\n");
      out.write("                                                                            <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                                                                        </span> New answer on Omise re-brand </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/question.html\">\n");
      out.write("                                                                    <span class=\"time\">40 mins</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-warning\">\n");
      out.write("                                                                            <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                                                                        </span> New answer on Omise re-brand </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/matew.html\">\n");
      out.write("                                                                    <span class=\"time\">9 days</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-danger\">\n");
      out.write("                                                                            <i class=\"fa fa-bolt\"></i>\n");
      out.write("                                                                        </span> Tutorial video ready to watch again </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul><div class=\"slimScrollBar\" style=\"background: rgb(99, 114, 131); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;\"></div><div class=\"slimScrollRail\" style=\"width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;\"></div></div>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!-- BEGIN INBOX DROPDOWN -->\n");
      out.write("\n");
      out.write("                                        <!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("                                        <li class=\"dropdown dropdown-user dropdown-dark\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("                                                <span class=\"username\">MR . Patchara Leelalumplert</span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"dropdown-menu dropdown-menu-default\">\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"https://int305-kademy.firebaseapp.com/page_user_profile_1.html\">\n");
      out.write("                                                        <i class=\"icon-user\"></i> My Profile </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"divider\"> </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"https://int305-kademy.firebaseapp.com/page_user_login_1.html\">\n");
      out.write("                                                        <i class=\"icon-key\"></i> Log Out </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- END USER LOGIN DROPDOWN -->\n");
      out.write("                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->\n");
      out.write("                                        <li class=\"dropdown dropdown-extended quick-sidebar-toggler\">\n");
      out.write("                                            <span class=\"sr-only\">Toggle Quick Sidebar</span>\n");
      out.write("                                            <i class=\"icon-logout\"></i>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- END QUICK SIDEBAR TOGGLER -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END TOP NAVIGATION MENU -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END HEADER TOP -->\n");
      out.write("                        <!-- BEGIN HEADER MENU -->\n");
      out.write("                        <div class=\"page-header-menu\" style=\"display: block;\">\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"hor-menu\">\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/main.html\">Home\n");
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/return-main.html\">Return\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/matew.html\">Ma-Tew\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/kookle.html\">Kookle\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"active\">\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/one-4-all.html\">One for all\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END HEADER MENU -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END HEADER -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--- Begin content-->\n");
      out.write("            <div class=\"page-wrapper-row full-height\">\n");
      out.write("                <div class=\"page-wrapper-middle\">\n");
      out.write("                    <div class=\"page-container\">\n");
      out.write("                        <div class=\"page-content-wrapper\">\n");
      out.write("                            <div class=\"page-content\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <!---content here -->\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"portlet light\">\n");
      out.write("                                                <div class=\"portlet-title\">\n");
      out.write("                                                    <div class=\"caption font-kademy\">\n");
      out.write("                                                        <span class=\"caption-subject bold uppercase\">\t\t\t\n");
      out.write("                                                            <img src=\"./upload_files/one4all_v3_white.png\"> ONE FOR ALL <a href=\"https://int305-kademy.firebaseapp.com/upload-conclude.html\">\n");
      out.write("                                                                <button style=\"margin-left : 30px;\" class=\"btn dark\">Share yours</button></a></span>\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <div class=\"search-filter\">\n");
      out.write("                                                                    <div class=\"input-icon right\">\n");
      out.write("                                                                        <i class=\"icon-magnifier\"></i>\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" width=\"200px\" placeholder=\"Search by keywords\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"portlet-body form\">\n");
      out.write("                                                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                                                        <form class=\"form-horizontal\" role=\"form\" action=\"Upload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                                            <div class=\"form-body\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-md-3 control-label\">Title</label>\n");
      out.write("                                                                    <div class=\"col-md-7\">\n");
      out.write("                                                                        <input type=\"text\" name=\"title\" class=\"form-control\" placeholder=\"Qustion here\" maxlength=\"50\" required>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-md-3 control-label\">Tag </label>\n");
      out.write("                                                                    <div class=\"col-md-7\">\n");
      out.write("                                                                        <input type=\"text\" name=\"tag\" class=\"form-control\" value=\"\" placeholder=\"At least one tag such as mth111 midterm\" data-role=\"tagsinput\" \n");
      out.write("                                                                               style=\"display: none;\" maxlength=\"50\" required>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-md-3 control-label\">Description</label>\n");
      out.write("                                                                    <div class=\"col-md-7\">\n");
      out.write("                                                                        <textarea class=\"form-control\" name=\"detail\" placeholder=\"description here (Maximum 50 character)\" maxlength=\"50\" name=\"detail\"></textarea>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-actions\">\n");
      out.write("                                                                <div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("                                                                    \n");
      out.write("                                                                    <input type=\"file\" name=\"file\" id=\"myFile\" required />\n");
      out.write("                                                                    <script>\n");
      out.write("                                                                    //binds to onchange event of your input field\n");
      out.write("                                                                    $('#myFile').bind('change', function() {\n");
      out.write("\n");
      out.write("                                                                    //this.files[0].size gets the size of your file.\n");
      out.write("                                                                    alert(this.files[0].size);\n");
      out.write("\n");
      out.write("                                                                    });\n");
      out.write("                                                                    </script>\n");
      out.write("                                                                    <input type=\"submit\" class=\"btn dark\" value=\"share\" onClick=\"\" name=\"file\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </form>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!--end -content here -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--- End content-->\n");
      out.write("            <!-- begin footer -->\n");
      out.write("            <div class=\"page-wrapper-row\">\n");
      out.write("                <div class=\"page-wrapper-bottom\">\n");
      out.write("                    <!-- BEGIN FOOTER -->\n");
      out.write("\n");
      out.write("                    <!-- BEGIN INNER FOOTER -->\n");
      out.write("                    <div class=\"page-footer\">\n");
      out.write("                        <div class=\"container\"> 2016 © KADEMY 2016\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"scroll-to-top\" style=\"display: none;\">\n");
      out.write("                        <i class=\"icon-arrow-up\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END INNER FOOTER -->\n");
      out.write("                    <!-- END FOOTER -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"./upload_files/jquery.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/bootstrap.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/js.cookie.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/jquery.slimscroll.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/jquery.blockui.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/bootstrap-switch.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/firebase.js.download\"></script>\n");
      out.write("        <script src=\"./upload_files/app.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("        <script src=\"./upload_files/jquery.cubeportfolio.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/dropzone.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/bootstrap-tagsinput.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"./upload_files/bootstrap-tagsinput.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- BEGIN THEME LAYOUT SCRIPTS -->\n");
      out.write("        <script src=\"./upload_files/layout.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/demo.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./upload_files/quick-sidebar.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- end footer -->\n");
      out.write("        <input type=\"file\" multiple=\"multiple\" class=\"dz-hidden-input\" style=\"visibility: hidden; position: absolute; top: 0px; left: 0px; height: 0px; width: 0px;\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
