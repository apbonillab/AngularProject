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
		})
		.
		when('/formulario',{
			templateUrl:'formulario.html',
			controller:'controllerForm'
		})
		.
	    when('/formulariomor',{
			templateUrl:'resources/js/formularioMor/mor.html',
			controller:'controllerFormMor'
		})


	}