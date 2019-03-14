var datos = prompt("Introduce una fecha dd/mm/yyyy");
var array = new Array();
var mes = new Array("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
array = datos.split("/");


if(array.length != 3)
{
	alert("El carácter separador tiene que ser /");
}
else if(array[0] != parseInt(array[0]) || array[1] != parseInt(array[1]) || array[2] != parseInt(array[2]))
	{
		alert("La fecha no es un número");
	}
else if(array[0] < 1 || array[0] > 31 || array[1] < 1 || array[1] > 12 || array[2] < 2000 || array[2] > 2050)
	{
		alert("Fecha fuera de rango");
	}
else
{
	var fecha = new Date(array[2], array[1] - 1, array[0]);
	alert("Hoy es " + fecha.getDate() + " de " + mes[fecha.getMonth()] + " de " + fecha.getFullYear());
}
