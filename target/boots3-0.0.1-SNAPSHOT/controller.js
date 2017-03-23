(function(){
	'use strict';
	var myApp = angular.module('myApp');
	myApp.controller('controllerhm',controllerhm);
	
	controllerhm.$inject=['$scope','servicehm'];
	
	function controllerhm($scope ,servicehm){
		
		var vm = this;
		vm.model;
		
		vm.nombre;
		//alert(servicehm.resultservice.cargainicial());
		
		//servicehm.resultservice.cargainicial(success,functionerror);
		
		servicehm.resultservice.cargainicial().then(function(data){
			$scope.lista=data.data;			
			
		});
		
		function success(response){
			console.log(response);
					
		}		
		function functionerror(response){
			console.log(response);			
		}
		
		$scope.saludo = function saludo(){
			if($scope.opt.id!=undefined && $scope.nombre!=undefined){
				servicehm.resultservice.saludo($scope.opt.id,$scope.nombre).then(function(data){
					$scope.respsaludo=data.data;
				});

			}

		}
	
	}
})();