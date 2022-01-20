(function () {
    'use strict';

    angular.module('MyApp', [])

    .controller('testingSplit', ListChecker);

    ListChecker.$inject = ['$scope'];

    function ListChecker ($scope) {
        $scope.name = '';
        $scope.message = '';
        $scope.myClass = '';

        $scope.Checker = function () {
            var menu = $scope.name.split(","),
            count = 0;

            for(var i = 0; i < menu.length; i++){
                if(menu[i].length > 0) {
                    count++;
                }
            }

            if(count == 0) {
                showYellowMsg("Please input something!");
            } else if (count <= 5) {
                showGreenMsg("This is perfect");
            }else {
                showRedMsg("You re too greedy,reduce your lunch");
            }
        };


        var showGreenMsg = function(message) {
            $scope.message = message;
            $scope.myClass = 'greenclass';
        };

        var showYellowMsg = function (message) {
            $scope.message = message;
            $scope.myClass = 'yellowclass';
        };

        var showRedMsg = function (message) {
            $scope.message = message;
            $scope.myClass = 'redclass';
        }
    }
})(); 