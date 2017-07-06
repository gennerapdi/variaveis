'use strict';

app.controller('ExemploController', ['$scope', 'ExemploService', 
  function ($scope, ExemploService) {

	var init = function () {
		$scope.usuarios = [];
		$scope.listar();
	};
	
	$scope.listar = function() {
		ExemploService.listar()
		    .then(function(response) {
		    	$scope.usuarios = response.data;
		    }, function(response) {
				console.log(response)
		    });
	};	
	
	$scope.salvar = function(usuario) {
		$scope.usuarios.push(angular.copy(usuario));
	};
	
  	init();

}]);