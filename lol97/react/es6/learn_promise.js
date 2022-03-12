let myPromise = new Promise(function(myResolve, myReject){
    setTimeout(function() { myResolve("Helloooooooooooooooo") }, 1000);
});

myPromise.then(function(value){
    console.log(value);
})