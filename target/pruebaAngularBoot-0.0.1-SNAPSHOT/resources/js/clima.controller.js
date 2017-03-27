angular.module('app').controller('climaController', ["$scope","$http",function($scope,$http) {
    
	$scope.visibleRopa=false;
	$scope.fecha = new Date();
	$scope.currentDate = new Date();
	$scope.maxDate = new Date();
	$scope.maxDate.setDate($scope.maxDate.getDate() + 7); 
	$scope.msg = "hoy";

	$scope.msgValidate = function(){
		$scope.getClima(1);
		if($scope.fecha == new Date()){
			$scope.msg = "hoy";	
		}else{
			$scope.msg = "para la fecha";	
		}
		
	}
    $scope.getClima = function(idCiudad){
    	//debugger;
    	/*$http.post("ciudades/"+idCiudad+"/clima").then(function(response){
    		var tlClima = response.data;
    		$scope.clima = tlClima.idClima;
    		
	    },function(response){
	    	console.log(response);
	    });*/
    }
    
    $scope.getClima(1);
    console.log("climaController");
    
    $scope.getRopa = function(){
    	$scope.visibleRopa=true;
    }
}]);