function valid()
{
	var nombre = document.getElementById("nombre").value;
	var año = document.getElementById("año").value;
	var indice = document.getElementById("lista").value;
	
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
	
	if(indice == null || indice == "")
	{
		alert("Debe seleccionar un elemento de la lista");
		return false;
	}
	
	if(parseInt(año) > 2000 && indice == "adultos")
	{
		alert("No es un adulto");
		return false;
	}
	
	alert("Formulario enviado");
	return true;  
}