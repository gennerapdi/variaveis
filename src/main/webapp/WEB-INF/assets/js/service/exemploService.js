'use strict';

app.factory('ExemploService', ['$http', 
    function($http) {
	
	var exemplos = {};
	exemplos.listar = function() {
		return $http({method: "GET", url: _contextPath + "/api/exemplo/"});
	}
	exemplos.salvar = function(usuario) {
		return $http({method: "POST", url: _contextPath + "/api/exemplo/", data: usuario}).then(function(data) {
			data.pdi = "Eh nox!!!!";
			return data;
		});
	}

    return exemplos;
    
}]);