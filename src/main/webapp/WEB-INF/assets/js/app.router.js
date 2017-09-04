'use strict';

app.config(['$stateProvider', '$httpProvider', '$urlRouterProvider', '$locationProvider', 
    function ($stateProvider, $httpProvider, $urlRouterProvider, $locationProvider) {

    $locationProvider.html5Mode(true);
	$locationProvider.hashPrefix('');
    $urlRouterProvider.otherwise('/list/');

    $stateProvider

      /*
       * Application
       */
      .state('app', {
    	  abstract: true,
    	  url: '',
    	  templateUrl: 'assets/views/app/app.html'
      })
      
      /*
       * Lista de variáveis
       */      
      .state('app.variaveis', {
          abstract: true,
          url: '/',
          template: '<div ui-view></div>'
      })
      .state('app.variaveis.list', {
          url: 'list/',
          templateUrl: 'assets/views/app/list/variaveis-list.html',
          controller: 'variaveisListController'
      });

  }])