(function () {
    'use strict';

angular.module("module.controllerFormularioMor", [])
.controller("controllerFormMor",controllerFormMor);
controllerFormMor.$inject = ['$scope', 'formulariomorService'];
function controllerFormMor($scope , formulariomorService ){

   $scope.Coninue = function(){
     
     var parameter  = "1";
   	formulariomorService.service1(parameter);
   }
}

})();