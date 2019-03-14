function valid(){
        var valor = document.getElementById("nombre").value;
//El tercer operando de la siguiente expresión lógica obliga a que el valor 
//introducido por el usuario no esté formado sólo por espacios en blanco. 
        if( valor == null || valor.length == 0 || /^\s+$/.test(valor) ){
	alert("Campo obligatorio");
	return false;
       }
       alert("Formulario enviado");
       return true;
    }