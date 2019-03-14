function valid()
{
	var preguntas=document.getElementsByName("pregunta");
	for(var i=0;i<preguntas.length;i++)
		alert(preguntas[i].value);//Muestra si no nsnc
	return true;
}