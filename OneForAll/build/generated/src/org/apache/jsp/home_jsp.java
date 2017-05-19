package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0052)https://int305-kademy.firebaseapp.com/one-4-all.html -->\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>\n");
      out.write("        <link rel=\"icon\" href=\"http://localhost:8080/OneForAll/kademy.png\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n");
      out.write("        <link href=\"./KADEMY_files/css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/bootstrap-switch.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link href=\"./KADEMY_files/components-md.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/plugins-md.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\">\n");
      out.write("        <link href=\"./KADEMY_files/custom.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://int305-kademy.firebaseapp.com/favicon.ico\">\n");
      out.write("        <link href=\"./KADEMY_files/cubeportfolio.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/portfolio.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./KADEMY_files/style.css\">\n");
      out.write("        <link href=\"./KADEMY_files/search.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./KADEMY_files/todo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
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
      out.write("                                        <img src=\"./KADEMY_files/kademy.png\" alt=\"logo\" width=\"70px\" height=\"70px\">\n");
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
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/one-4-all.html\">Ma-Tew\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--- Begin content-->\n");
      out.write("            <div class=\"page-wrapper-row full-height\">\n");
      out.write("                <div class=\"page-wrapper-middle\">\n");
      out.write("                    <div class=\"page-container\">\n");
      out.write("                        <div class=\"page-content-wrapper\">\n");
      out.write("                            <div class=\"page-content\">\n");
      out.write("                                <!---content here -->\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"portlet light\">\n");
      out.write("                                                <div class=\"portlet-title\">\n");
      out.write("                                                    <div class=\"caption font-kademy\">\n");
      out.write("                                                        <span class=\"caption-subject bold uppercase\">\t\t\t<img src=\"./KADEMY_files/one4all_v3_white.png\"> ONE FOR ALL <a href=\"https://int305-kademy.firebaseapp.com/upload-conclude.html\"><button style=\"margin-left : 30px;\" class=\"btn dark\">Share yours</button></a></span>\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                                <div class=\"search-filter\">\n");
      out.write("                                                                    <div class=\"input-icon right\">\n");
      out.write("                                                                        <i class=\"icon-magnifier\"></i>\n");
      out.write("                                                                       \n");
      out.write("                                                                        <form action=\"FileServlet\" method=\"post\">\n");
      out.write("                                                                            <input type=\"text\" class=\"form-control\" width=\"200px\" placeholder=\"Search by keywords\" name=\"filename\">\n");
      out.write("                                                                            <input type=\"submit\" value=\"Search\">\n");
      out.write("                                                                        </form>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"portlet-body form\">\n");
      out.write("                                                    <ul class=\"nav nav-tabs\">\n");
      out.write("                                                        <li class=\"active\">\n");
      out.write("                                                            <a href=\"https://int305-kademy.firebaseapp.com/one-4-all.html#tab_1_1\" data-toggle=\"tab\">Newest</a>\n");
      out.write("                                                        </li>\n");
      out.write("                                                        <li>\n");
      out.write("                                                            <a href=\"https://int305-kademy.firebaseapp.com/one-4-all.html#tab_1_2\" data-toggle=\"tab\">Top Download</a>\n");
      out.write("                                                        </li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                     \n");
      out.write("                                                    <div class=\"todo-container\">\n");
      out.write("                                                        <ul class=\"todo-projects-container\">\n");
      out.write("                                                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                             \n");
      out.write("                                                           ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                                        </ul>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"todo-projects-divider\"></div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"search-pagination\">\n");
      out.write("                                                        <ul class=\"pagination\">\n");
      out.write("                                                            <li class=\"page-active\">\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 1 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 2 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 3 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 4 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"portlet light\">\n");
      out.write("                                                <div class=\"portlet-title\">\n");
      out.write("                                                    <div class=\"caption font-kademy\">\n");
      out.write("                                                        <span class=\"caption-subject bold uppercase\">Tags</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"portlet-body form\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <a href=\"\">\n");
      out.write("                                                            \n");
      out.write("                                                           ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                           ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                          ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"search-pagination\">\n");
      out.write("                                                        <ul class=\"pagination\">\n");
      out.write("                                                            <li class=\"page-active\">\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 1 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 2 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 3 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"javascriptt:;\"> 4 </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <!--end -content here -->\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!--end -content here -->\n");
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
      out.write("                    <div class=\"scroll-to-top\">\n");
      out.write("                        <i class=\"icon-arrow-up\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END INNER FOOTER -->\n");
      out.write("                    <!-- END FOOTER -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"./KADEMY_files/jquery.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/bootstrap.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/js.cookie.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/jquery.slimscroll.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/jquery.blockui.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/bootstrap-switch.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/firebase.js.download\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/app.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("        <script src=\"./KADEMY_files/jquery.cubeportfolio.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- BEGIN THEME LAYOUT SCRIPTS -->\n");
      out.write("        <script src=\"./KADEMY_files/layout.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/demo.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./KADEMY_files/quick-sidebar.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- end footer -->\n");
      out.write("    </body></html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                             <li class=\"todo-projects-item\">\n");
          out.write("                                                                 <h3 > <a href=\"\" style=\"color: black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.fileName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                                 <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                 <p>\n");
          out.write("                                                                     ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                 </p>\n");
          out.write("                                                                 <div class=\"todo-project-item-foot\">\n");
          out.write("                                                                     <p class=\"todo-red todo-inline\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.stID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></p>\n");
          out.write("                                                                     <p class=\"todo-inline todo-float-r\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.d}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.t}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                     </p>\n");
          out.write("                                                                 </div>\n");
          out.write("                                                             </li>\n");
          out.write("                                                             <div class=\"todo-projects-divider\"></div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c2");
    _jspx_th_c_forEach_1.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                         <span class=\"label label-sm label-info labelTag\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c2.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>     \n");
          out.write("                                                                     ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lf}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("c5");
    _jspx_th_c_forEach_2.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                             <li class=\"todo-projects-item\">\n");
          out.write("                                                                 <h3 > <a href=\"\" style=\"color: black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c5.fileName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                                 <p>list by time<P>\n");
          out.write("                                                                 <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c5.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                 <p>\n");
          out.write("                                                                     ");
          if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                                                 </p>\n");
          out.write("                                                                 <div class=\"todo-project-item-foot\">\n");
          out.write("                                                                     <p class=\"todo-red todo-inline\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c5.stID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></p>\n");
          out.write("                                                                     <p class=\"todo-inline todo-float-r\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c5.d}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c5.t}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                     </p>\n");
          out.write("                                                                 </div>\n");
          out.write("                                                             </li>\n");
          out.write("                                                             <div class=\"todo-projects-divider\"></div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagNames}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("c6");
    _jspx_th_c_forEach_3.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                         <span class=\"label label-sm label-info labelTag\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c6.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>     \n");
          out.write("                                                                     ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tt}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("c3");
    _jspx_th_c_forEach_4.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                         \n");
          out.write("                                                             <div class=\"col-md-4\">\n");
          out.write("\n");
          out.write("                                                            <div class=\"color-demo tooltips\" data-original-title=\"\" title=\"\">\n");
          out.write("                                                                <div class=\"color-view font-white  \"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c3.tagName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("c2");
    _jspx_th_c_forEach_5.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                         \n");
          out.write("                                                             <div class=\"col-md-4\">\n");
          out.write("\n");
          out.write("                                                            <div class=\"color-demo tooltips\" data-original-title=\"\" title=\"\">\n");
          out.write("                                                                <div class=\"color-view font-white  \"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c2.tagName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ft}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("c4");
    _jspx_th_c_forEach_6.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                         \n");
          out.write("                                                             <div class=\"col-md-4\">\n");
          out.write("\n");
          out.write("                                                            <div class=\"color-demo tooltips\" data-original-title=\"\" title=\"\">\n");
          out.write("                                                                <div class=\"color-view font-white  \"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c4.tagName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }
}
