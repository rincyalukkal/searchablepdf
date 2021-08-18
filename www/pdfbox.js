var exec = require('cordova/exec');

module.coolMethod = function (arg0, success, error) {
    exec(success, error, 'pdfbox', 'coolMethod', [arg0]);
};
module.exports.createsearchablepdf=function (arg0,success,error){

    exec(success,error,'pdfbox','createsearchablepdf',[arg0]);
}