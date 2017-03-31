angular.module('app').controller('crearCuentaController', function($scope) {
    
	var authService = new AuthenticationService(AWS.CognitoIdentityServiceProvider);
	
	$scope.validPassword = function(){
		if($scope.password != $scope.passwordConfirmation){
			return $scope.formCC.$setValidity("pwd-validation",false);
		}else{
			return $scope.formCC.$setValidity("pwd-validation",true);
		}
	}
	
	$scope.signUp = function(){
		if($scope.validPassword()){
			authService.signUp($scope.username, $scope.email, $scope.password, function(error, result){
				if(error != undefined){
					alert("Por favor verifica tu constraseña pues debe tener: 6 o mas caracteres, una mayuscula y un numero. ");
				}else{
					alert("Se ha enviado un correo para que verifiques tu cuenta.");
				}
			});
		}else{
			alert("Las contraseñas no son iguales.");
		}
	}
});