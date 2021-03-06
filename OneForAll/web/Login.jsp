<%--  
<%-- 
    Document   : Login
    Created on : Apr 4, 2017, 3:48:19 PM
    Author     : KARTOON
--%>


<!-- saved from url=(0038)https://int305-kademy.firebaseapp.com/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>
         <link rel="icon" href="http://localhost:8080/OneForAll/kademy.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport">
        <meta content="" name="description">
        <meta content="" name="author">
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="./login_files/css" rel="stylesheet" type="text/css">
        <link href="./login_files/font-awesome.css" rel="stylesheet" type="text/css">
        <link href="./login_files/simple-line-icons.css" rel="stylesheet" type="text/css">
        <link href="./login_files/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="./login_files/bootstrap-switch.css" rel="stylesheet" type="text/css">
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <link href="./login_files/select2.css" rel="stylesheet" type="text/css">
        <link href="./login_files/select2-bootstrap.css" rel="stylesheet" type="text/css">
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="./login_files/components-md.css" rel="stylesheet" id="style_components" type="text/css">
        <link href="./login_files/plugins-md.css" rel="stylesheet" type="text/css">
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN PAGE LEVEL STYLES -->
        <link href="./login_files/login.css" rel="stylesheet" type="text/css">
        <!-- END PAGE LEVEL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="https://int305-kademy.firebaseapp.com/favicon.ico"> </head>
    <!-- END HEAD -->

    <body class=" login" waid71fa0d88-5390-4b5b-a2f4-e45fa93d85e2="SA password protect entry checker">
        <!-- BEGIN LOGO -->
        <div class="logo">
            <a href="https://int305-kademy.firebaseapp.com/index.html">
                <img src="./login_files/kademy.png" width="80" height="80" alt=""> </a>
        </div>
        <!-- END LOGO -->
        <!-- BEGIN LOGIN -->
        <div class="content">
            <!-- BEGIN LOGIN FORM -->
            <form class="login-form" action="LoginServlet" method="post" novalidate="novalidate">
                <h3 class="form-title font-green">Sign In</h3>
                <div class="alert alert-danger display-hide">
                    <button class="close" data-close="alert"></button>
                    <span> Enter any username and password. </span>
                </div>
                <div class="form-group">
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">Username</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="Username" name="Username"> </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Password</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="Password" name="Password"> </div>
                    <p class="form-title font-red">${msg}</p>
                    <div class="form-actions">
                    <button type="submit" class="btn dark">Login</button>
                    <label class="rememberme check mt-checkbox mt-checkbox-outline">
                        <input type="checkbox" name="remember" value="1">Remember
                        <span></span>
                    </label>
                    <a href="javascript:;" id="forget-password" class="forget-password">Forgot Password?</a>
                </div>
            </form>
            <!-- END LOGIN FORM -->
            <!-- BEGIN FORGOT PASSWORD FORM -->
            <form class="forget-form" action="https://int305-kademy.firebaseapp.com/main.html" method="post" novalidate="novalidate">
                <h3 class="font-green">Forget Password ?</h3>
                <p> Enter your e-mail address below to reset your password. </p>
                <div class="form-group">
                    <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Email" name="email"> </div>
                <div class="form-actions">
                    <button type="button" id="back-btn" class="btn green btn-outline">Back</button>
                    <button type="submit" class="btn dark">Submit</button>
                </div>
            </form>
            <!-- END FORGOT PASSWORD FORM -->

        </div>
        <div class="copyright"> 2016 � KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</div>
        <!--[if lt IE 9]>
<script src="../assets/global/plugins/respond.min.js"></script>
<script src="../assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
        <!-- BEGIN CORE PLUGINS -->
        <script src="./login_files/jquery.min.js.download" type="text/javascript"></script>
        <script src="./login_files/bootstrap.min.js.download" type="text/javascript"></script>
        <script src="./login_files/js.cookie.min.js.download" type="text/javascript"></script>
        <script src="./login_files/jquery.slimscroll.min.js.download" type="text/javascript"></script>
        <script src="./login_files/jquery.blockui.min.js.download" type="text/javascript"></script>
        <script src="./login_files/bootstrap-switch.min.js.download" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="./login_files/jquery.validate.min.js.download" type="text/javascript"></script>
        <script src="./login_files/additional-methods.min.js.download" type="text/javascript"></script>
        <script src="./login_files/select2.full.min.js.download" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="./login_files/app.min.js.download" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="./login_files/login.min.js.download" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <!-- END THEME LAYOUT SCRIPTS -->
    


</body></html>
