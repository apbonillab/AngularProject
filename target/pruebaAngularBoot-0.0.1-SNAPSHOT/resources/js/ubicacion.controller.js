angular.module('app').controller('tuLookController', ["$scope","$http","$location",function($scope,$http,$location) {
    
    $scope.ciudades = [];
    $scope.clima = 3;
    $scope.visibleRopa=false;
    getCiudades();
    
    function getCiudades(){
    	$http.get("get-ciudades").then(function(response){
	    	if(response != undefined && response.data !=undefined){
	    		$scope.ciudades = response.data;
	    	}
	    },function(response){
	    	$scope.ciudades = [{nombre:"Bogota", id:1},{nombre:"Cali", id:2},{nombre:"Medellin",id:3},{nombre:"Barranquilla", id:4},{nombre:"Bucaramanga", id:5}];
	    });
    }
    
    $scope.climas = ["Caluroso","Nublado","Lluvioso"];
    
    $scope.getClima = function(){

         $scope.formUbicacion.$submitted = true;
         if ($scope.formUbicacion.$invalid) {
            
             // invalid
            }
            else
            {

                $location.path('/clima')

            var idCiudad = $scope.ciudadSeleccionada;
                var idCiudad = "1";
                $http.post("ciudades/"+idCiudad+"/clima").then(function(response){
                    var tlClima = response.data;
                    angular.forEach($scope.climas, function(value){
                         if(tlClima.clima == value){
                             $scope[value]="";
                         }else{
                             $scope[value]="gray-image"; 
                         }
                    });
                },function(response){
                    console.log(response);
                });
            }




    }
    $scope.getRopa = function(){
    	$scope.visibleRopa=true;
    }
}]);