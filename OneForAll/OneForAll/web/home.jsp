<%-- 
    Document   : home
    Created on : Mar 31, 2017, 12:48:09 PM
    Author     : nunnnunns
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<!-- saved from url=(0052)https://int305-kademy.firebaseapp.com/one-4-all.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>
        <link rel="icon" href="http://localhost:8080/OneForAll/kademy.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport">
        <link href="./KADEMY_files/css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/simple-line-icons.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/bootstrap-switch.css" rel="stylesheet" type="text/css">

        <link href="./KADEMY_files/components-md.css" rel="stylesheet" id="style_components" type="text/css">
        <link href="./KADEMY_files/plugins-md.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/layout.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/default.css" rel="stylesheet" type="text/css" id="style_color">
        <link href="./KADEMY_files/custom.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="https://int305-kademy.firebaseapp.com/favicon.ico">
        <link href="./KADEMY_files/cubeportfolio.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/portfolio.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="./KADEMY_files/style.css">
        <link href="./KADEMY_files/search.css" rel="stylesheet" type="text/css">
        <link href="./KADEMY_files/todo.css" rel="stylesheet" type="text/css">

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
                                        <img src="./KADEMY_files/kademy.png" alt="logo" width="70px" height="70px">
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
                                                <span class="badge badge-default">7</span>
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li class="external">
                                                    <h3>Your
                                                        <strong>Notification</strong> tasks</h3>
                                                    <a href="https://int305-kademy.firebaseapp.com/notification.html">view all</a>
                                                </li>
                                                <li>
                                                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 250px;"><ul class="dropdown-menu-list scroller" style="height: 250px; overflow: hidden; width: auto;" data-handle-color="#637283" data-initialized="1">
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/video-subject.html">
                                                                    <span class="time">just now</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-success">
                                                                            <i class="fa fa-plus"></i>
                                                                        </span> New MTH111 video available </span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/question.html">
                                                                    <span class="time">10 mins</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-warning">
                                                                            <i class="fa fa-bell-o"></i>
                                                                        </span> New answer on Omise re-brand </span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/question.html">
                                                                    <span class="time">30 mins</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-warning">
                                                                            <i class="fa fa-bell-o"></i>
                                                                        </span> New answer on Omise re-brand </span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/question.html">
                                                                    <span class="time">40 mins</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-warning">
                                                                            <i class="fa fa-bell-o"></i>
                                                                        </span> New answer on Omise re-brand </span>
                                                                </a>
                                                            </li>

                                                            <li>
                                                                <a href="https://int305-kademy.firebaseapp.com/matew.html">
                                                                    <span class="time">9 days</span>
                                                                    <span class="details">
                                                                        <span class="label label-sm label-icon label-danger">
                                                                            <i class="fa fa-bolt"></i>
                                                                        </span> Tutorial video ready to watch again </span>
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
                                                <span class="username"><%out.print("Hello  " + session.getAttribute("username"));%></span>
                                            </a>
                                            <ul class="dropdown-menu dropdown-menu-default">
                                                <li>
                                                    <a href="https://int305-kademy.firebaseapp.com/page_user_profile_1.html">
                                                        <i class="icon-user"></i> My Profile </a>
                                                </li>
                                                <li class="divider"> </li>
                                                <li>
                                                    <a href="LogoutServlet">
                                                        <i class="icon-key"></i> Log Out </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <!-- END USER LOGIN DROPDOWN -->
                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                                        <li class="dropdown dropdown-extended quick-sidebar-toggler">
                                            <span class="sr-only">Toggle Quick Sidebar</span>
                                            <i  class="icon-logout"></i>
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
                                            <a href="https://int305-kademy.firebaseapp.com/main.html">Home

                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/return-main.html">Return
                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/one-4-all.html">Ma-Tew
                                            </a>
                                        </li>
                                        <li>
                                            <a href="https://int305-kademy.firebaseapp.com/kookle.html">Kookle
                                            </a>
                                        </li>
                                        <li class="active">
                                            <a href="HomeServlet">One for all
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



            <!--- Begin content-->
            <div class="page-wrapper-row full-height">
                <div class="page-wrapper-middle">
                    <div class="page-container">
                        <div class="page-content-wrapper">
                            <div class="page-content">
                                <!---content here -->
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="portlet light">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <span class="caption-subject bold uppercase">			
                                                            <img src="./KADEMY_files/one4all_v3_white.png"> ONE FOR ALL <a href="upload.jsp"><button style="margin-left : 30px;" class="btn dark">Share yours</button></a></span>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="search-filter">
                                                                    <div class="input-icon right">
                                                                        

                                                                        <form action="FileHomeServlet" method="post">
                                                                            <div style="float:left; ">
                                                                                <input type="text" class="form-control" width="200px" placeholder="Search by keywords" name="filename" >
                                                                            </div>
                                                                            
                                                                          
                                                                            <div class="portlet-title">
                                                                            <button style="width:100px; height: 34px; color:#f50;font-size:16px" class="btn btn-default ">
                                                                                Search</button>
                                                                            </div>
                                                                        </form>
                                                                       
                                                                        
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="portlet-body form">
                                                    <ul class="nav nav-tabs">
                                                        <li>
                                                            <a href="HomeServlet">Newest</a>
                                                        </li>
                                                        
                                                    </ul>

                                                    <div class="todo-container">
                                                        <ul class="todo-projects-container">
                                                            <p>${msg}</p>
                                                            <%
                                                                if (request.getAttribute("name") != null) {
                                                            %>
                                                            <c:forEach items="${nameSearch}" var="c" varStatus="vs">
                                                                <li class="todo-projects-item">
                                                                    <h3 > <a href="" style="color: black; float: left;">${c.fileName}</a></h3>
                                                                    <a href="DownloadServlet?id=${c.filesID}" class="btn btn-sm btn-default" style="float: right;">
                                                                                 Download </a>
                                                                    <p style="clear: both;">${c.detail}</p>
                                                                    <p >
                                                                        <c:forEach items="${showTagMatch}" var="c2" varStatus="vs">
                                                                            <span class="label label-sm label-info labelTag">${c2.tagName}</span>     
                                                                        </c:forEach>
                                                                    </p>
                                                                    
                                                                    
                                                                    <div class="todo-project-item-foot">
                                                                        <p class="todo-red todo-inline"><p>${c.username}</p></p>
                                                                        <p class="todo-inline todo-float-r">${c.d} ${c.t}
                                                                        </p>
                                                                    </div>
                                                                </li>
                                                                <div class="todo-projects-divider"></div>
                                                            </c:forEach>
                                                            <%} else {%>

                                                            
                                                            <c:forEach items="${searchAll}" var="c5" varStatus="vs">
                                                                <li class="todo-projects-item">
                                                                    <h3 > <a href="" style="color: black; float: left;">${c5.fileName}</a></h3>
                                                                     <a href="DownloadServlet?id=${c5.filesID}" class="btn btn-sm btn-default" style="float: right;">
                                                                                 Download </a>
                                                                    <p style="clear: both;">${c5.detail}</p>
                                                                    <p >
                                                                       
                                                                            <span class="label label-sm label-info labelTag">${c5.tagName}</span>     
                                                                       
                                                                    </p>
                                                                   
                                                                   
                                                                    <div class="todo-project-item-foot">
                                                                        <p class="todo-red todo-inline"><p>${c5.username}</p></p>
                                                                        <p class="todo-inline todo-float-r">${c5.d} ${c5.t}
                                                                        </p>
                                                                    </div>
                                                                </li>
                                                                <div class="todo-projects-divider"></div>
                                                            </c:forEach>
                                                            <%}%>
                                                        </ul>																																																	<div class="todo-projects-divider"></div>
                                                    </div>
                                                    <div class="search-pagination">
                                                        <ul class="pagination">
                                                            <li class="page-active">
                                                                <a href="javascriptt:;"> 1 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 2 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 3 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 4 </a>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="portlet light">
                                                <div class="portlet-title">
                                                    <div class="caption font-kademy">
                                                        <span class="caption-subject bold uppercase">Tags</span>
                                                    </div>
                                                </div>
                                                <div class="portlet-body form">
                                                    <div class="row">
                                                        <a href="">

                                                            <c:forEach items="${showTagMatch}" var="c3" varStatus="vs">

                                                                <div class="col-md-4">

                                                                    <div class="color-demo tooltips" data-original-title="" title="">
                                                                        <div class="color-view font-white  "> ${c3.tagName }</div>
                                                                    </div>
                                                                </div>
                                                            </c:forEach>

                                                            <c:forEach items="${listTag}" var="c2" varStatus="vs">

                                                                <div class="col-md-4">

                                                                    <div class="color-demo tooltips" data-original-title="" title="">
                                                                        <div class="color-view font-white  "> ${c2.tagName }</div>
                                                                    </div>
                                                                </div>
                                                            </c:forEach>

                                                            <c:forEach items="${nameTag}" var="c4" varStatus="vs">

                                                                <div class="col-md-4">

                                                                    <div class="color-demo tooltips" data-original-title="" title="">
                                                                        <div class="color-view font-white  "> ${c4.tagName }</div>
                                                                    </div>
                                                                </div>
                                                            </c:forEach>
                                                        </a>
                                                    </div>
                                                    <div class="search-pagination">
                                                        <ul class="pagination">
                                                            <li class="page-active">
                                                                <a href="javascriptt:;"> 1 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 2 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 3 </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascriptt:;"> 4 </a>
                                                            </li>
                                                        </ul>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                        <!--end -content here -->
                                    </div>





                                </div>
                                <!--end -content here -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--- End content-->
            <!-- begin footer -->
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
        <script src="./KADEMY_files/jquery.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/bootstrap.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/js.cookie.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/jquery.slimscroll.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/jquery.blockui.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/bootstrap-switch.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/firebase.js.download"></script>
        <script src="./KADEMY_files/app.min.js.download" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <script src="./KADEMY_files/jquery.cubeportfolio.min.js.download" type="text/javascript"></script>

        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="./KADEMY_files/layout.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/demo.min.js.download" type="text/javascript"></script>
        <script src="./KADEMY_files/quick-sidebar.min.js.download" type="text/javascript"></script>




        <!-- end footer -->
    </body></html>
