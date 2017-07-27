'use strict';

app.factory('UsuarioHandler', [function() {
    
    var handleList = function(list) { 
        return list.map(list, function(item) {
            return handle(item);
        });
    };
    
    var handle = function(item) {  
        var itemHandle = {};
        itemHandle.codigo = item.codigo;
        itemHandle.nome = item.nome || null;
        itemHandle.idade = item.idade || null;
        itemHandle.data = item.data || null;
        return itemHandle;
    };
	
    return {
        handle: handle,
        handleList: handleList
    };

}]);