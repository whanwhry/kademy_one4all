package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0058)https://int305-kademy.firebaseapp.com/admin-one-4-all.html -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n");
      out.write("        <link href=\"./admin_files/css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/bootstrap-switch.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/components-md.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/plugins-md.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\">\n");
      out.write("        <link href=\"./admin_files/custom.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://int305-kademy.firebaseapp.com/favicon.ico\">\n");
      out.write("        <link href=\"./admin_files/search.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"./admin_files/todo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./admin_files/style.css\">\n");
      out.write("        <!-- END HEAD -->\n");
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
      out.write("                                        <a href=\"https://int305-kademy.firebaseapp.com/index.html\">\n");
      out.write("                                            <img src=\"./admin_files/kademy.png\" alt=\"logo\" width=\"70px\" height=\"70px\">\n");
      out.write("                                        </a>\n");
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
      out.write("                                                <span class=\"badge badge-default\">2</span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"dropdown-menu\">\n");
      out.write("                                                <li class=\"external\">\n");
      out.write("                                                    <h3>Your\n");
      out.write("                                                        <strong>Notification</strong> tasks</h3>\n");
      out.write("                                                    <a href=\"https://int305-kademy.firebaseapp.com/admin-notification.html\">view all</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <div class=\"slimScrollDiv\" style=\"position: relative; overflow: hidden; width: auto; height: 250px;\"><ul class=\"dropdown-menu-list scroller\" style=\"height: 250px; overflow: hidden; width: auto;\" data-handle-color=\"#637283\" data-initialized=\"1\">\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/report-detail.html\">\n");
      out.write("                                                                    <span class=\"time\">just now</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-success\">\n");
      out.write("                                                                            <i class=\"fa fa-plus\"></i>\n");
      out.write("                                                                        </span> New Report From Mrs.JAraya Eiei </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"https://int305-kademy.firebaseapp.com/report-detail.html\">\n");
      out.write("                                                                    <span class=\"time\">10 mins</span>\n");
      out.write("                                                                    <span class=\"details\">\n");
      out.write("                                                                        <span class=\"label label-sm label-icon label-warning\">\n");
      out.write("                                                                            <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                                                                        </span> New answer on Omise re-brand </span>\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul><div class=\"slimScrollBar\" style=\"background: rgb(99, 114, 131); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;\"></div><div class=\"slimScrollRail\" style=\"width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;\"></div></div>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!-- BEGIN INBOX DROPDOWN -->\n");
      out.write("\n");
      out.write("                                        <!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("                                        <li class=\"dropdown dropdown-user dropdown-dark\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("                                                <span class=\"username\"></span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- END USER LOGIN DROPDOWN -->\n");
      out.write("                                        <!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("                                        <li class=\"dropdown dropdown-user dropdown-dark\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("                                                <span class=\"username\">");
out.print(session.getAttribute("username"));
      out.write("</span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"dropdown-menu dropdown-menu-default\">\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"https://int305-kademy.firebaseapp.com/page_user_profile_1.html\">\n");
      out.write("                                                        <i class=\"icon-user\"></i> My Profile </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"divider\"> </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"LogoutServlet\">\n");
      out.write("                                                        <i class=\"icon-key\"></i> Log out </a>\n");
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
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/admin-index.html\">Home\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/admin-return.html\">Return\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/admin-matew.html\">Ma-Tew\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/admin-kookle.html\">Kookle\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"active\">\n");
      out.write("                                            <a href=\"https://int305-kademy.firebaseapp.com/admin-one-4-all.html\">One for all\n");
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
      out.write("            <div class=\"page-wrapper-row full-height\">\n");
      out.write("                <div class=\"page-wrapper-middle\">\n");
      out.write("                    <div class=\"page-container\">\n");
      out.write("                        <div class=\"page-content-wrapper\">\n");
      out.write("                            <div class=\"page-content\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"portlet light\">\n");
      out.write("                                                <div class=\"portlet-title\">\n");
      out.write("                                                    <div class=\"caption\">\n");
      out.write("                                                        <span class=\"caption-subject font-kademy bold uppercase\">Reported Sheet</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"portlet-body\">\n");
      out.write("                                                    <div class=\"table-responsive\">\n");
      out.write("                                                        <table class=\"table table-hover table-bordered\">\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th> Sheet</th>\n");
      out.write("                                                                    <th> Report </th>\n");
      out.write("                                                                    <th></th>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
      out.write("        <script src=\"./admin_files/jquery.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/bootstrap.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/js.cookie.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/jquery.slimscroll.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/jquery.blockui.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/bootstrap-switch.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/app.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/layout.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/demo.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./admin_files/quick-sidebar.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body></html>");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${report}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("rp");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                <tr>\n");
          out.write("                                                                        <td>\n");
          out.write("                                                                            <a href=\"javascript:;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rp.fileID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                                        </td>\n");
          out.write("                                                                        <td>12</td> \n");
          out.write("                                                                        <td>\n");
          out.write("                                                                            <a href=\"javascript:;\" class=\"btn btn-sm btn-default\">\n");
          out.write("                                                                                <i class=\"fa fa-search\"></i> Download </a>\n");
          out.write("                                                                            <a href=\"javascript:;\" class=\"btn btn-sm red-mint\">\n");
          out.write("                                                                                <i class=\"fa fa-ban\"></i>Delete Sheet</a>\n");
          out.write("                                                                                <br>\n");
          out.write("                                                                        </td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                                ");
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
}
