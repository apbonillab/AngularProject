angular.module('app')
.config(config);

function config($routeProvider){
	$routeProvider
		.when('/',{
			templateUrl:'index.html'
		})
		.when('/ubicacion',{
			templateUrl:'ubicacion.html'
		});
	}