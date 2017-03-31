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
			controller:'tuLookController'
		}).
		when('/clima',{
			templateUrl:'clima.html',
			controller:'climaController'
		}).when('/crear-cuenta',{
			templateUrl:'crear-cuenta.html',
			controller:'crearCuentaController'
		})
		.when('/activacion',{
			templateUrl:'activacion.html',
			controller:'autenticacionController'
		})
	}