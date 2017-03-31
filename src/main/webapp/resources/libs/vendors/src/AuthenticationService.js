//
// Module to authenticate users in frontend
//
// NOTE: callbacks must be in format: function(err, otherArgs)
//

var userPoolId = 'us-west-2_9UYhLrVlG';											// Your user pool id here
var clientId = '71covpv8u216476hq04ug5p9uv';									// Your client id here
var identityPoolId = 'us-west-2:e2a2b796-46e9-4b64-9335-7e83f1784b87';	 		// your identity pool id here
var region = 'us-west-2';

var cognitoUser;
var authToken;

var AuthenticationService = function(identityServiceProvider) {	
	this.identityServiceProvider = identityServiceProvider
};

AuthenticationService.prototype.signUp = function(username, email, password, cb) {
    var attributeList = [];
    var dataEmail = {Name: 'email', Value:  email};
    var dataUsername = {Name: 'preferred_username', Value: username};

    var attributeEmail = new this.identityServiceProvider.CognitoUserAttribute(dataEmail);
    var attributeUsername = new this.identityServiceProvider.CognitoUserAttribute(dataUsername);

    attributeList.push(attributeEmail);
    attributeList.push(attributeUsername);

    this.getUserPool().signUp(username, password, attributeList, null, function(err, result){
        if (!err) {
        	cognitoUser = result.user;
        }	        
        cb(err, cognitoUser);
    });
} 

AuthenticationService.prototype.login = function(username, password, cb) {
	var authenticationData = { Username : username, Password : password };
	var authenticationDetails = new this.identityServiceProvider.AuthenticationDetails(authenticationData);

	var userData = { Username : username, Pool : this.getUserPool() };
	cognitoUser = new this.identityServiceProvider.CognitoUser(userData);
	cognitoUser.authenticateUser(authenticationDetails, {

	   onSuccess: function (result) {
	    	authToken = result.getIdToken().getJwtToken()
	        cb(null, authToken);
	    },

	   onFailure: function(err) {
	    	this.signOut();
	        cb(err);
	    },

	});
}

AuthenticationService.prototype.confirmUser = function(username, confirmationCode, cb) {
    var userData = { Username : username, Pool : this.getUserPool() };
    var cognitoUser = new this.identityServiceProvider.CognitoUser(userData);
    cognitoUser.confirmRegistration(confirmationCode, true, cb);
}

AuthenticationService.prototype.resendConfirmationCode = function(username, cb) {
    var userData = { Username : username, Pool : this.getUserPool() };
    var localCognitoUser = new this.identityServiceProvider.CognitoUser(userData);
    cognitoUser.resendConfirmationCode(cb);
}

AuthenticationService.prototype.signOut = function() {
	if (cognitoUser && cognitoUser.signOut) {
		cognitoUser.signOut();
	}
	authToken = cognitoUser = null;
}

AuthenticationService.prototype.deleteUser = function(cb) {
	cognitoUser.deleteUser(cb);
}

AuthenticationService.prototype.isAuthenticated = function() {
	return cognitoUser !== null;
}

AuthenticationService.prototype.authToken = function() {
	return authToken;
}

// helpers
AuthenticationService.prototype.setIdentityServiceProvider = function(provider) {
	this.identityServiceProvider = provider;
}

AuthenticationService.prototype.getUserPool = function() {
	var poolData = { UserPoolId : userPoolId, ClientId : clientId };
	var userPool = new this.identityServiceProvider.CognitoUserPool(poolData);
	return userPool;
}

 module.exports = AuthenticationService;