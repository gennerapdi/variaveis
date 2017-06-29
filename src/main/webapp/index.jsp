<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <base href="/variaveis/">
    
	<title>Variáveis</title>

    <!-- Bootstrap -->
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/bower_components/bootstrap/dist/css/bootstrap.css">
    <!-- Font Awesome -->
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/bower_components/font-awesome/css/font-awesome.min.css">
    
</head>

<body>

	<div class="container">
	    <label>Name:</label>
	    <input type="text" ng-model="yourName" placeholder="Enter a name here">
	    <hr>
	    <h1>Hello {{yourName}}!</h1>
    </div>
	
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/jquery/dist/jquery.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/jquery-ui/jquery-ui.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/bootstrap/dist/js/bootstrap.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/angular/angular.js"></script>
	
</body>

</html>