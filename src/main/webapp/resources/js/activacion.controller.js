angular.module('app').controller('autenticacionController',["$scope","$http","$routeParams", function($scope,$http,$routeParams) {
	var authService = new AuthenticationService(AWS.CognitoIdentityServiceProvider);
	authService.confirmUser($routeParams.user, $routeParams.code, function(error, response){
		$scope.showModal = true;
		if(error != undefined){
			$scope.mensaje="Error en activacion!!";
		}else{
			$scope.mensaje="Usuario activo exitosamente!!";
		}
		
	})
	
	$scope.ok = function() {
		  $scope.showModal = false;
		};

		$scope.cancel = function() {
		  $scope.showModal = false;
		};
		
}]);