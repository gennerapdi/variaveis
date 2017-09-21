'use strict';

app.factory('TelefoneHandler', [function() {
	
    var handleList = function(list) { 
        return list.map(function(item) {
            return handle(item);
        });
    };
    
    var handle = function(item) {  
        var itemHandle = {};
        itemHandle.codigo = item.codigo;
        itemHandle.codigoArea = item.codigoArea;
        itemHandle.numero = item.numero;
        return itemHandle;
    };
	
    return {
        handle: handle,
        handleList: handleList
    };

}]);