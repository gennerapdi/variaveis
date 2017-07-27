'use strict';

app.factory('ExemploService', ['$http', 
    function($http) {
	
	var usuarios = {};
	usuarios.listar = function() {
		return $http({method: "GET", url: _contextPath + "/api/exemplo/"});
	}
	usuarios.salvar = function(usuario) {
		return $http({method: "POST", url: _contextPath + "/api/exemplo/", data: usuario});
	}

    return usuarios;
    
}]);