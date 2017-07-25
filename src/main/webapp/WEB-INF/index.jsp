<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="Variaveis">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <base href="${pageContext.request.contextPath}/">
    
    <script type="text/javascript">
        var _contextPath = "${pageContext.request.contextPath}";
    </script>
    
	<title>Variáveis</title>

    <!-- Bootstrap -->
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/bower_components/bootstrap/dist/css/bootstrap.css">
    <!-- Font Awesome -->
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/bower_components/font-awesome/css/font-awesome.min.css">
    
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
    
</head>

<body>

	<div ui-view></div>
	
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/jquery/dist/jquery.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/jquery-ui/jquery-ui.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/bootstrap/dist/js/bootstrap.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/angular/angular.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/angular-ui-router/release/angular-ui-router.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/angular-bootstrap/ui-bootstrap-tpls.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/ngMask/dist/ngMask.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/bower_components/moment/moment.js"></script>
	
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/app.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/app.router.js"></script>
	
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/filter/telefoneFilter.js"></script>
	
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/directive/telefoneDirective.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/directive/datepickerDirective.js"></script>
	
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/controller/appController.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/controller/exemplo/exemploController.js"></script>
	
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/service/usuarioService.js"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/service/exemploService.js"></script>
	
</body>

</html>