'use strict';

app.config(['$stateProvider', '$httpProvider', '$urlRouterProvider', '$locationProvider', 
    function ($stateProvider, $httpProvider, $urlRouterProvider, $locationProvider) {

    $locationProvider.html5Mode(true);
	$locationProvider.hashPrefix('');
    $urlRouterProvider.otherwise('/404');

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
       * Exemplo
       */      
      .state('app.exemplo', {
          abstract: true,
          url: '/exemplo',
          template: '<div ui-view></div>'
      })
      .state('app.exemplo.list', {
          url: '/',
          templateUrl: 'assets/views/app/exemplo/exemplo.html',
          controller: 'ExemploController'
      });

  }])