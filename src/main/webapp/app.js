(function(){
	'use strict';
	 angular.module('myApp', ["ngRoute"])
	 .config(function ($routeProvider){
	 	$routeProvider
	 	.when("/",{
	 		templateUrl:"index.jsp"
	 	})
	 	.when("/probar",{
	 		templateUrl:"index.jsp"
	 	})
	 });



})();