function valid(){
  var lista=document.getElementById("opciones");
	//lista contiene una referencia al control <select>
	alert(lista.options[lista.selectedIndex].value); 
//Muestra el contenido del atributo value de la opción seleccionada
	alert(lista.options[lista.selectedIndex].text);
//Muestra el contenido de la opción seleccionada
return true;
}