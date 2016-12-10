<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Courses for students">
    <meta name="author" content="vovas11">
    <link rel="icon" href="favicon.ico">

    <title>Log in</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/main.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
              <h3 class="masthead-brand"></h3>
              <nav>
                <ul class="nav masthead-nav">
                  <li><a href="index.html">HOME</a></li>
                  <li><a href="about.html">ABOUT</a></li>
                  <li class="active"><a href="login.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> LOG IN</a></li>
                  <li><a href="signup.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> SIGN UP</a></li>
                </ul>
              </nav>
            </div>
          </div>

          <div class="inner cover">
            
            <div class="well col-xs-12 col-md-6 col-md-offset-3">
              <div class="row">
                <h3>Login</h3>
              </div>
              <div class="row">
                <form action="login" method="post">
                  <div class="row">
                    <div class="form-group col-xs-10 col-xs-offset-1 col-md-8 col-md-offset-2">
                      <input type="text" class="form-control" name="login" placeholder="Username">
                    </div>
                    <div class="form-group col-xs-10 col-xs-offset-1 col-md-8 col-md-offset-2">
                      <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                  </div>
                  <div class="row">
                    <p class="wrnmessage">${message}</p>
                  </div>
                  <div class="row">
                    <div class="form-group col-xs-10 col-xs-offset-1 col-md-8 col-md-offset-2">
                      <button type="submit" class="btn btn-primary col-xs-5 col-md-5" name="command" value="login">Log in</button>
                      <a class="btn btn-default col-xs-5 col-xs-offset-2 col-md-5 col-md-offset-2" href="index.html" role="button">Cancel</a>
                    </div>
                  </div>
                </form>
              </div>
              
            </div>
          </div>

          <div class="mastfoot">
            <div class="inner">
              <p>Source code on <a href="http://github.com/vovas11">GitHub</a></p>
            </div>
          </div>

        </div>

      </div>

    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
