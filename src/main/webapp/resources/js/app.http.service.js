(function() {
    'use strict';

   angular
    .module('app')
    .factory('cedHttp', cedHttp);
    
    cedHttp.$inject = ['$http','$log'];

function cedHttp($http,$log) {
    
    var service = {
       getOcasiones : getOcasiones
    };
    return service;

    function getOcasiones() {
        return $http.get('ocasion')
            .then(returnOcasiones,handleError);
    
      function returnOcasiones(response) {
            return response.data;
        }
        
      function handleError(response) {
             $log.error(response);
        }
    };
   };
}
)();