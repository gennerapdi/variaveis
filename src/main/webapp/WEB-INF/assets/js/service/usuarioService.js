'use strict';

app.factory('UsuarioService', ['$http', 
    function($http) {
	
	var usuarios = {};
	usuarios.listar = function() {
		return $http({method: "GET", url: _contextPath + "/api/usuario"});
	}
	usuarios.salvar = function(usuario) {
		return $http({method: "POST", url: _contextPath + "/api/usuario", data: usuario}).then(function(data) {
			data.pdi = "Eh nox!!!!";
			return data;
		});
	}

    return usuarios;
    
}]);