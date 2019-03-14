function valid()
{
	var nombre = document.getElementById("nombre").value;
	var año = document.getElementById("año").value;
	var opcion = document.getElementsByName("opciones");
	
	if(nombre == null || nombre.length == 0 || /^\s+$/.test(nombre))
	{
		alert("Introduzca el nombre");
		return false;
	}
	
	if(año == null || año.length == 0 || año != parseInt(año))
	{
		alert("Introduzca el año de nacimiento");
		return false;
	}
	
	var activado = false;
	
	for(var i = 0; i < opcion.length && !activado; i++)
	{
		if(opcion[i].checked)
		{
			activado = true;
		}
	}
	
	if(!activado)
	{
		alert("Debe seleccionar un elemento de la lista");
		return false;
	}
	
	if(parseInt(año) > 2000 && opcion[2].checked)
	{
		alert("No es un adulto");
		return false;
	}
	
	alert("Formulario enviado");
	return true;  
}