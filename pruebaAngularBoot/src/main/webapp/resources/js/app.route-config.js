angular.module('app')
.config(config);

function config($routeProvider){
	$routeProvider
		.when('/',{
			templateUrl:'home.html',
			controller:'appController'


		})
		.when('/ubicacion',{
			templateUrl:'ubicacion.html',
			controller:'UbicacionController'
		})
		.when('/clima',{
			templateUrl:'clima.html',
			controller:'UbicacionController'
		});
	}