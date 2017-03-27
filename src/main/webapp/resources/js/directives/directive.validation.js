(function () {
    'use strict';

    angular.module('validations.directive', [])
        .directive('pinteger', PosInteger)
        .directive('alphabetic', Alphabetic)
        .directive('alphanumeric', Alphanumeric)
        .directive('allowPattern', allowPatternDirective);


    function allowPatternDirective() {
        return {
            restrict: "A",
            compile: function (tElement, tAttrs) {
                return function (scope, element, attrs) {
                    element.bind("keypress", function (event) {
                        var keyCodeExclude = ['ArrowRight', 'ArrowLeft', 'ArrowUp', 'ArrowDown', 'Backspace', 'Tab']
                        var keyCode = event.which || event.keyCode;
                        var key = event.key;
                        var keyCodeChar = String.fromCharCode(keyCode);
                        if ((!keyCodeChar.match(new RegExp(attrs.allowPattern, "i"))) && keyCodeExclude.indexOf(key)<0) {
                            event.preventDefault();
                            return false;
                        }

                    });
                };
            }
        };
    }

    function PosInteger() {
        var regex = /^[0-9\s]+$/; // /^\-?\d+$/;
        var msg = 'Este campo debe ser numérico.'; // TODO : add multi language support
        return {
            require: 'ngModel',
            link: function (scope, elm, attrs, ctrl) {
                ctrl.$validators.pinteger = Delfo(ctrl, ValidateRegex, [regex, msg]);
            }
        };
    }

    function Alphabetic() {
        var regex = /^[a-zA-ZñÑ\sáéíóúÁÉÍÓÚ]+$/;
        var msg = 'Este campo debe ser alfabético.';
        return {
            require: 'ngModel',
            link: function (scope, elm, attrs, ctrl) {
                ctrl.$validators.alphabetic = Delfo(ctrl, ValidateRegex, [regex, msg]);
            }
        };
    }

    function Alphanumeric() {
        var regex = /^[a-z0-9A-ZñÑ\sáéíóúÁÉÍÓÚ,.-]+$/;
        var msg = 'Este campo debe ser alfanumérico.';
        return {
            require: 'ngModel',
            link: function (scope, elm, attrs, ctrl) {
                ctrl.$validators.alphanumeric = Delfo(ctrl, ValidateRegex, [regex, msg]);
            }
        };
    }

    // -------------------------
    // Overloaded angular method
    // -------------------------
    function ValidateRegex(modelValue, viewValue, regex, msg) {
        this.$error.msg = null;
        if (this.$isEmpty(modelValue)) {
            // consider empty models to be valid
            return true;
        }
        if (regex.test(viewValue)) {
            // it is valid
            return true;
        }
        // it is invalid
        this.$error.msg = msg
        return false;
    }

    // TODO : set this into a Tool Service
    // -----------------------------
    //  DELegate Function Overloader
    // -----------------------------
    function Delfo(obj, func, parameters) {
        return function () { // receive any number of parameters
            var args = Array.prototype.slice.call(arguments);
            args.push.apply(args, parameters);
            return func.apply(obj, args);
        };
    }
})();