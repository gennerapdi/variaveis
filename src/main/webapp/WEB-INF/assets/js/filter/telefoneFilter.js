'use strict';

app.filter('telefone', function() {
    
    return function(input) {
    	var telefone = "";
        if(!input) return telefone;
        if(input.codigoArea) {
        	telefone += "(" + input.codigoArea + ") ";
        };
        if(input.numero) {
        	var numero = input.numero.toString();
        	if(input.numero.toString().length === 9) {
        		telefone += [numero.slice(0, 5), "-", numero.slice(5)].join('');
        	} else {
        		telefone += [numero.slice(0, 4), "-", numero.slice(4)].join('');
        	}
        };
        return telefone; 
    };
});