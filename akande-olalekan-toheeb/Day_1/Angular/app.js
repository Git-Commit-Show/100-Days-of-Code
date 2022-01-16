(function () {
    'use strict';

    angular.module('myFisrtApp', [])

    .controller('myFirstController', function ($scope) {
        $scope.name = "";
        $scope.totalValue = 0;

        $scope.result = function () {
            $scope.totalValue = calChar($scope.name);
        };

        function calChar(string) {
            var num = 0;

            for (var i = 0; i < string.length; i++) {
                num += string.charCodeAt(i);
            }

            return num;
        }
    });
})();