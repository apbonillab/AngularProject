angular.module('app').controller('crearCuentaController',["$scope","$http","$routeParams", function($scope,$http,$routeParams) {
    
	var authService = new AuthenticationService(AWS.CognitoIdentityServiceProvider);
	
	$scope.validPassword = function(){
		
		if($scope.password != $scope.passwordConfirmation){
			return $scope.formCC.$setValidity("pwd-validation",false);
		}else{
			return $scope.formCC.$setValidity("pwd-validation",true);
		}
	}
	
	$scope.signUp = function(){
		saveRegister();
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
	
	function saveRegister(){
			
			var date = new Date($scope.fechaNacimiento);
			var timestamp = date.getTime();
			var params = {nombres:$scope.nombres,apellidos:$scope.apellidos,fechaNacimiento:timestamp,mail:$scope.email,userName:$scope.username}
			$http.post("contacto",params).then(function(response){
	    		$scope.result=response;
		    },function(response){
		    	console.log(response);
		    });
	    }
	function activarCuenta(){
		console.log($routeParams.code)
	}
}]);