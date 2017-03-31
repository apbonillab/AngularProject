var sinon = require('sinon'),
	assert = require('assert'),
	AuthenticationService = require('../src/AuthenticationService');

require('./../node_modules/amazon-cognito-identity-js/dist/amazon-cognito-identity.min');
require('mocha');

describe('AuthenticationService', function() {
	it('can signUp', function () {
		var signUpMock = sinon.spy();
		var cognitoUserAttributeMock = sinon.spy();

		var mockProvider = {
			CognitoUserPool: function(userPool) { 
				this.userPool = userPool;
				this.signUp = signUpMock;
			},
			CognitoUserAttribute: cognitoUserAttributeMock
		}
	    
	    var authService = new AuthenticationService(mockProvider);
	    var cb = function(err, res) {};
	    authService.signUp('myUsername', 'myEmail', 'myPassword', cb);

	    assert(signUpMock.calledOnce);
	    assert.equal('myUsername', signUpMock.getCall(0).args[0]);
	    assert.equal('myPassword', signUpMock.getCall(0).args[1]);
	    assert.equal(null, signUpMock.getCall(0).args[3]);
	    
	    assert.equal('email', cognitoUserAttributeMock.getCall(0).args[0].Name);
	    assert.equal('myEmail', cognitoUserAttributeMock.getCall(0).args[0].Value);

	    assert.equal('preferred_username', cognitoUserAttributeMock.getCall(1).args[0].Name);
	    assert.equal('myUsername', cognitoUserAttributeMock.getCall(1).args[0].Value);
	});

	it('can login', function () {
		var authenticationDetailsMock = sinon.spy();
		var authenticateUserMock = sinon.spy();

		var mockProvider = {
			AuthenticationDetails: authenticationDetailsMock,
			CognitoUserPool: function(userPool) { 
				this.userPool = userPool;
			},
			CognitoUser: function() {
				this.authenticateUser = authenticateUserMock
			}
		}
	    
	    var authService = new AuthenticationService(mockProvider);
	    var cb = function(err, res) {};
	    authService.login('myUsername', 'myPassword', cb);

	    assert(authenticationDetailsMock.calledOnce);
	    assert.equal('myUsername', authenticationDetailsMock.getCall(0).args[0].Username);
	    assert.equal('myPassword', authenticationDetailsMock.getCall(0).args[0].Password);

	    assert(authenticateUserMock.calledOnce);
	});

	function generateAuthInstance() {
		var authenticationDetailsMock = sinon.spy();
		var authenticateUserMock = sinon.spy();

		var mockProvider = {
			AuthenticationDetails: authenticationDetailsMock,
			CognitoUserPool: function(userPool) { 
				this.userPool = userPool;
			},
			CognitoUser: function() {
				this.authenticateUser = authenticateUserMock;
				this.signOut = function() { }
			}
		}
	    
	    var authService = new AuthenticationService(mockProvider);

	    return authService;
	}

	it('all instances are logged in or logged out', function () {
		var authService1 = generateAuthInstance();
		authService1.signOut();
		assert.equal(false, authService1.isAuthenticated());
	    
	    var cb = function(err, res) {};
	    authService1.login('myUsername', 'myPassword', cb);
	    assert.equal(true, authService1.isAuthenticated());

		var authService2 = generateAuthInstance();
		assert.equal(true, authService2.isAuthenticated());

		authService1.signOut();
		assert.equal(false, authService1.isAuthenticated());
		assert.equal(false, authService2.isAuthenticated());
	});
});