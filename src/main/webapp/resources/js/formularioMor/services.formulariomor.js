(function () {
    'use strict';
    angular.module('formulariomor.service', [])
        .factory('formulariomorService', formulariomorService);
    formulariomorService.$inject = ['$http', '$q'];
    function formulariomorService($http,$q) {
        

        function _service1(parametro) {
         var prueba =  "yA";
        };

        function _service2() {
         var pruebas =  "ysA";
        };


        return {
            service1: _service1,
            servicedos: _service2
        }
    }
})();