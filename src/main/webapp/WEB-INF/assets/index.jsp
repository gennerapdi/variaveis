<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html ng-app="variaveis">
<head>

    <base href="${pageContext.request.contextPath}/">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="cache-control" content="max-age=0" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
	<meta http-equiv="pragma" content="no-cache" />
	
    <title>Variáveis</title>
    
    <script type="text/javascript">var _contextPath = "${pageContext.request.contextPath}";</script>
	
	<!-- CSS -->
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/lib/bootstrap/dist/css/bootstrap.css?r=<%= session.getId()%>"></script>
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/lib/font-awesome/css/font-awesome.css?r=<%= session.getId()%>"></script>
    <link media="screen" charset="utf-8" rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css?r=<%= session.getId()%>"></script>

    <!-- Libs -->
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/angular/angular.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/angular-ui-router/release/angular-ui-router.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/jquery/dist/jquery.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/jquery-ui/jquery-ui.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/bootstrap/dist/js/bootstrap.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/angular-bootstrap/ui-bootstrap-tpls.js?r=<%= session.getId()%>"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/moment/moment.js?r=<%= session.getId()%>"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/lib/ngMask/dist/ngMask.js?r=<%= session.getId()%>"></script>
    
</head>
<body>
	<div ui-view></div>
	
	<!-- App -->
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/app.js?r=<%= session.getId()%>"></script>
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/app.router.js?r=<%= session.getId()%>"></script>


	<!-- Services -->
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/service/exemploService.js?r=<%= session.getId()%>"></script>
	
	<!-- Controllers -->
	<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/assets/js/controller/list/variaveisListController.js?r=<%= session.getId()%>"></script>

	
</body>
</html>
