app.directive('datepicker', function() {
    
    return {
        restrict: 'E',
        templateUrl: 'assets/js/directive/html/datepicker.html',
        scope: {
        	datepickerModel: '=',
        },
        link: function($scope, element, attr, ngModel) { 

            var init = function () {
            	popup();
            	format();
            	$scope.today();
            };
                        
            var popup = function() {
            	$scope.popup1 = { opened: false };
            };
            
            var format = function() {
            	$scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'dd/MM/yyyy', 'shortDate'];
        	    $scope.altInputFormats = ['M!/d!/yyyy'];
            };
            
            $scope.today = function() {
            	var dateCurrent = moment();
                $scope.datepickerModel = $scope.datepickerModel || dateCurrent.toDate();
            };

            $scope.open1 = function() {
              $scope.popup1.opened = true;
            };

            $scope.dateOptions = {
        		formatYear: 'yy',
        		startingDay: 1
            };
            
            init();
        }
    }
});