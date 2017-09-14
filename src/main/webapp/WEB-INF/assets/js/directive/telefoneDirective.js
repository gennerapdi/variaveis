app.directive('telefone', function($filter) {
    
    return {
        restrict: 'A',
        require: 'ngModel',
//        templateUrl: 'js/directive/html/telefone.html',
        scope: {
            telefoneModel: '='
        },
        link: function($scope, element, attr, ngModel) { 

            var init = function () { 
            	$scope.telefoneModel = {};
            	$scope.telefoneModel.codigoArea = 00;
            	$scope.telefoneModel.numero = 00000000;
            };
            
            var getRegex = function(numero, index) {
            	var regex = /^(\([0-9]{2}\))\s([9]{1})?([0-9]{4})-([0-9]{4})$/g;   
            	var matches = regex.exec(numero);   
            	if(!matches) return null; 
            	return matches[index];
            };
            
            var getCodigoArea = function(telefone) {
            	var codigoArea = getRegex(telefone, 1);
            	if(!codigoArea) return;
            	$scope.telefoneModel.codigoArea = codigoArea.replace(/\D/g,"");
            	console.log($scope.telefoneModel.codigoArea);
            };
            
            var getNumero = function(telefone) {
            	var numero9 = getRegex(telefone, 2);
            	var numeroInicial = getRegex(telefone, 3);
            	var numeroFinal = getRegex(telefone, 4);
            	if(!numero9 || !numeroInicial || !numeroFinal) return;
            	$scope.telefoneModel.numero = numero9 + numeroInicial + numeroFinal;
            	console.log($scope.telefoneModel.numero);
            };
            
            $scope.$watch(function() {
                return ngModel.$modelValue;
            }, function(newValue, oldValue) {
            	getCodigoArea(newValue);
            	getNumero(newValue);
            });
            
            init();
        }
    }
});