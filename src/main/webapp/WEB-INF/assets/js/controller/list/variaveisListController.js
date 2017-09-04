'use strict';

app.controller('variaveisListController', function ($scope, ExemploService) {

	var init = function () {
		$scope.usuario = [];
		$scope.usuario.telefones = [];
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
    	var usuarioHandler = UsuarioHandler.handle(usuario);
    	var telefoneHandler = TelefoneHandler.handleList(usuario.telefones);
    	usuarioHandler.telefones = telefoneHandler;
		ExemploService.salvar(usuarioHandler)
		    .then(function(response) {
		    	console.log(response.pdi);
		    	$scope.usuarios.push(usuario);
		    }, function(response) {
				console.log(response)
		    });
	};
	
  	init();

});