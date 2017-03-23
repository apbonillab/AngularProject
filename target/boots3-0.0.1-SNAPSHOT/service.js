(function(){
	'use strict';
	angular.module('myApp')
	.factory('servicehm',servicehm);
	
	servicehm.$inject=['$q', '$http'];
	function servicehm($q ,$http) {
		var result = {};
		
		result.cargainicial=_cargainicial;
		result.saludo = _saludo;


	
	function _saludo(tipo,nombre){
		var def = $q.defer();
		var url = "../saludo/"+nombre+"/"+tipo;
		$http.get(url).then(function(response){
			def.resolve(response);
		} ,function(error){
			def.reject(error);
		});
		return def.promise;
	}
	
	/*PROMISE*/
	function _cargainicial(){
		
		 var deferred = $q.defer();//INICIALIZA
		
		 var url = "../prueba";
		  $http.get(url).then(Success(deferred), Error(deferred));//devuelve funciones que se ejecuta segun sea el caso
       
          return deferred.promise; //Retorna obligatorio para uso de then desde el controllador		 	
		}
	
	/*DELEGADOS*/
	/*function _cargainicial(funsucess , funerror){
		 var url = "../prueba";
		 $http.get(url).then(function(response, zx){ funsucess(response); },function (mensa){funerror(mensa); });
		 	
		}
	*/
    function Success (deferred){
    	return function (response){
    		 deferred.resolve(response);
    	}
   	
    }
	  
 function Error (deferred){     	 
	 return function (response){
		 deferred.reject(response);
	 }	
    }
	
 
 
	return {
        	resultservice: result
        }
	
	}
	
})();