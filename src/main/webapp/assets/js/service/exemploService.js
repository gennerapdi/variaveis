'use strict';

app.factory('ExemploService', ['$http', 
    function($http) {
	
	var usuarios = {};
	usuarios.listar = function() {
		return $http({method: "GET", url: _contextPath + "/api/usuario"});
	}

    return usuarios;
    
}]);