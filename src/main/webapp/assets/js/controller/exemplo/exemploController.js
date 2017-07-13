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
		ExemploService.salvar(usuario)
		    .then(function(response) {
		    	console.log(response.pdi);
		    	$scope.usuarios.push(usuario);
		    }, function(response) {
				console.log(response)
		    });
	};
	
  	init();

}]);