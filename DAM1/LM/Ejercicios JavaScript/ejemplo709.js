function valid(){
var preguntas=document.getElementsByName("pregunta");
for(var i=0;i<preguntas.length;i++)
	if(preguntas[i].checked)
		alert(preguntas[i].value);
//Muestra el valor del atributo value de la opción seleccionada.
return true;
}