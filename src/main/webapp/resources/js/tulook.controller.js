(function () {
	'use strict';

angular.module('app').controller('tuLookController', ["$scope","$http","cedHttp","$location",function($scope,$http,cedHttp,$location) {
    
    $scope.ciudades = [];
    $scope.visibleRopa=false;
    $scope.ocasion={
    		 id: 0
    };

    
	$scope.validarCamposRequeridos = function() {
		if ($scope.ciudadSeleccionada) {
			if(!angular.equals($scope.ocasion, {})){
					getCiudades();
					$location.url("clima");	
			}else{
				$(".selectOcasion").notify("Seleccionar Ocasion", "warn");
			}
			
		} else {
			$(".selectCiudad").notify("Seleccionar Ciudad", "warn");
			
		}
	};
    
    getCiudades();
    getOcasiones();
    
    function getCiudades(){
    	$http.get("ciudades").then(function(response){
	    	if(response != undefined && response.data !=undefined){
	    		$scope.ciudades = response.data;
	    	}
	    },function(response){
	    	$scope.ciudades = [{nombre:"Bogota", id:1},{nombre:"Cali", id:2},{nombre:"Medellin",id:3},{nombre:"Barranquilla", id:4},{nombre:"Bucaramanga", id:5}];
	    });
    }
    
    function getOcasiones() {
    cedHttp.getOcasiones().then(function(data) {
       $scope.ocasionesList = data;
    }, function(response) {
      console.log(response);
    });
  }

    

    
}]);

})();
