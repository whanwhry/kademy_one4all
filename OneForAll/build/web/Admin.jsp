
<!DOCTYPE html>
<!-- saved from url=(0058)https://int305-kademy.firebaseapp.com/admin-one-4-all.html -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>
        <link rel="icon" href="http://localhost:8080/OneForAll/kademy.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport">
        <link href="./admin_files/css" rel="stylesheet" type="text/css">
        <link href="./admin_files/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/simple-line-icons.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/bootstrap-switch.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/components-md.css" rel="stylesheet" id="style_components" type="text/css">
        <link href="./admin_files/plugins-md.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/layout.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/default.css" rel="stylesheet" type="text/css" id="style_color">
        <link href="./admin_files/custom.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="https://int305-kademy.firebaseapp.com/favicon.ico">
        <link href="./admin_files/search.css" rel="stylesheet" type="text/css">
        <link href="./admin_files/todo.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" type="text/css" href="./admin_files/style.css">
        <!-- END HEAD -->
    </head>
    <body class="page-container-bg-solid page-md" waid71fa0d88-5390-4b5b-a2f4-e45fa93d85e2="SA password protect entry checker">
        <div class="page-wrapper">
            <div class="page-wrapper-row">
                <div class="page-wrapper-top">
                    <!-- BEGIN HEADER -->
                    <div class="page-header">
                        <!-- BEGIN HEADER TOP -->
                        <div class="page-header-top">
                            <div class="container">
                                <!-- BEGIN LOGO -->
                                <div class="page-logo">
                                    <div class="container">
                                        <a href="https://int305-kademy.firebaseapp.com/index.html">
                                            <img src="./admin_files/kademy.png" alt="logo" width="70px" height="70px">
                                        </a>
                                    </div>
                                </div>
                                <!-- END LOGO -->
                                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                                <a href="javascript:;" class="menu-toggler"></a>
                                <!-- END RESPONSIVE MENU TOGGLER -->
                                <!-- BEGIN TOP NAVIGATION MENU -->
                                <div class="top-menu">
                                    <ul class="nav navbar-nav pull-right">
                                        <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar">
                                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                                <i class="icon-bell"></i>
                                                <span class="badge badge-default">2</span>
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li class="external">
                                                    <h3>Your
                                                        <strong>Notification</strong> tasks</h3>
                                                    <a href="https://int305-kademy.firebaseapp.com/admin-notification.html">view all</a>
                                                </li>
                                                <li>
                                                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 250px;"><ul class="dropdown-menu-list scroller" style="height: 250px; overflow: hidden; width: auto;" data-handle-color="#637283" data-initialized="1">
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/report-detail.html">
                                                                    <span class="time">just now</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-success">
                                                                            <i class="fa fa-plus"></i>
                                                                        </span> New Report From Mrs.JAraya Eiei </span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/report-detail.html">
                                                                    <span class="time">10 mins</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-warning">
                                                                            <i class="fa fa-bell-o"></i>
                                                                        </span> New answer on Omise re-brand </span>
                                                                </a>
                                                            </li>
                                                        </ul><div class="slimScrollBar" style="background: rgb(99, 114, 131); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
                                                </li>
                                            </ul>
                                        </li>



                                        <!-- BEGIN INBOX DROPDOWN -->

                                        <!-- BEGIN USER LOGIN DROPDOWN -->
                                        <li class="dropdown dropdown-user dropdown-dark">
                                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                                <span class="username"></span>
                                            </a>
                                        </li>
                                        <!-- END USER LOGIN DROPDOWN -->
                                        <!-- BEGIN USER LOGIN DROPDOWN -->
                                        <li class="dropdown dropdown-user dropdown-dark">
                                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                                <span class="username"><%out.print(session.getAttribute("username"));%></span>
                                            </a>
                                            <ul class="dropdown-menu dropdown-menu-default">
                                                <li>
                                                    <a href="https://int305-kademy.firebaseapp.com/page_user_profile_1.html">
                                                        <i class="icon-user"></i> My Profile </a>
                                                </li>
                                                <li class="divider"> </li>
                                                <li>
                                                    <a href="LogoutServlet">
                                                        <i class="icon-key"></i> Log out </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <!-- END USER LOGIN DROPDOWN -->
                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                                        <li class="dropdown dropdown-extended quick-sidebar-toggler">
                                            <span class="sr-only">Toggle Quick Sidebar</span>
                                            <i class="icon-logout"></i>
                                        </li>
                                        <!-- END QUICK SIDEBAR TOGGLER -->
                                    </ul>
                                </div>
                                <!-- END TOP NAVIGATION MENU -->
                            </div>
                        </div>
                        <!-- END HEADER TOP -->
                        <!-- BEGIN HEADER MENU -->
                        <div class="page-header-menu" style="display: block;">

                            <div class="container">
                                <div class="hor-menu">
                                    <ul class="nav navbar-nav">
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/admin-index.html">Home
                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/admin-return.html">Return
                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/admin-matew.html">Ma-Tew
                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/admin-kookle.html">Kookle
                                            </a>
                                        </li>
                                        <li class="active">
                                            <a href="https://int305-kademy.firebaseapp.com/admin-one-4-all.html">One for all
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                        <!-- END HEADER MENU -->
                    </div>
                    <!-- END HEADER -->
                </div>
            </div>
            <div class="page-wrapper-row full-height">
                <div class="page-wrapper-middle">
                    <div class="page-container">
                        <div class="page-content-wrapper">
                            <div class="page-content">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="portlet light">
                                                <div class="portlet-title">
                                                    <div class="caption">
                                                        <span class="caption-subject font-kademy bold uppercase">Reported Sheet</span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body">
                                                    <div class="table-responsive">
                                                        <table class="table table-hover table-bordered">
                                                            <thead>
                                                                <tr>
                                                                    <th> Sheet</th>
                                                                    <th> Report </th>
                                                                    <th></th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach items= "${report}" var="rp" varStatus="vs">
                                                                <tr>
                                                                        <td>
                                                                            <a href="javascript:;">${rp.fileName}</a>
                                                                        </td>
                                                                       
                                                                        <td>
                                                                            <a href="DownloadServlet?id=${rp.fileID}" class="btn btn-sm btn-default">
                                                                                <i class="fa fa-search"></i> Download </a>
                                                                            <a href="DeleteServlet?id=${rp.fileID}" class="btn btn-sm red-mint">
                                                                                <i class="fa fa-ban"></i>Delete Sheet</a>
                                                                                <br>
                                                                        </td>
                                                            </tr>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="page-wrapper-row">
                <div class="page-wrapper-bottom">
                    <!-- BEGIN FOOTER -->

                    <!-- BEGIN INNER FOOTER -->
                    <div class="page-footer">
                        <div class="container"> 2016 © KADEMY 2016
                        </div>
                    </div>
                    <div class="scroll-to-top">
                        <i class="icon-arrow-up"></i>
                    </div>
                    <!-- END INNER FOOTER -->
                    <!-- END FOOTER -->
                </div>
            </div>
        </div>
        <script src="./admin_files/jquery.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/bootstrap.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/js.cookie.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/jquery.slimscroll.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/jquery.blockui.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/bootstrap-switch.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/app.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/layout.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/demo.min.js.download" type="text/javascript"></script>
        <script src="./admin_files/quick-sidebar.min.js.download" type="text/javascript"></script>


    </body></html>