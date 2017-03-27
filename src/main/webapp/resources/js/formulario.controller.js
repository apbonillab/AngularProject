angular.module("module.controllerForm", [])
.controller("controllerForm",controllerForm);

function controllerForm($scope){
	$scope.variableform="hola";
	$scope.tipoDocumentos=[{id:1,nombre:'Cedula ciudadania'},{id:2,nombre:'Cedula Extranjeria'}];
}