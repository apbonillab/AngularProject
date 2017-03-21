<html  ng-app="myApp">
<head >

<script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.7/angular.min.js"></script> 
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" />
<script type="text/javascript" src="../app.js"></script>
<script type="text/javascript" src="../controller.js"></script>
<script type="text/javascript" src="../service.js"></script>


</head>
<body  ng-controller="controllerhm">
<div class="alert alert-danger"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
  <strong>Warning!</strong> Best check yo self, you're not looking too good.
<h2 class="text-danger">Hello World!</h2>
<div class="container-fluid">
	<div class="row ">
			<div class="col-xs-0  col-md-2"></div>	   		
		    		<div class="col-xs-12  col-md-4 form-group" >
						<label>Ingrese nombre</label>
						<input type="text"class="form-control" ng-model="nombre">			
					</div>
					<div class="col-xs-12 col-md-4 form-group">
						<label>Seleccione tipo</label>
						<select ng-model="opt.id" class="form-control"  ng-options="opt.id as opt.nombre for opt in lista" >
						</select>
					</div>			
				<div class="col-xs-0 col-md-2"></div>
	</div>

	<div class="row text-center from-group" >
					<button ng-click="saludo()"  class="btn btn-primary btn-lg" ng-disabled="opt.id==undefined">generar</button>
	
	</div>

<div class="row text-center form-group">
		{{respsaludo}}
</div>

</body>
</html>
