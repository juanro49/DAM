function calcular()
{
	var cantidad = document.getElementById("cantidad").value;
	var fruta = document.getElementsByName("frutas");
	var fpago = document.getElementById("forma").value;
	var transporte = document.getElementById("transporte");
	var activado = false;
	var precio;
	
	//Comprobar que se ha chequeado una fruta
	for(var i = 0; i < fruta.length && !activado; i++)
	{
		if(fruta[i].checked)
		{
			activado = true;
		}
	}
	
	if(!activado)
	{
		alert("Debe seleccionar un elemento de la lista");
		return false;
	}
	
	//Comprobar que la cantidad es válida
	if(cantidad == null || cantidad.length == 0 || /^\s+$/.test(cantidad) || cantidad < 1 || cantidad != parseInt(cantidad))
	{
		alert("Introduzca una cantidad válida");
		return false;
	}
	
	//Precio de cada fruta
	if(fruta[0].checked)
	{
		precio = 0.75;
	}
	else if(fruta[1].checked)
	{
		precio = 1.50;
	}
	else if(fruta[2].checked)
	{
		precio = 2.25;
	}
	
	precio *= cantidad;

	//Descuentos forma de pago
	if(fpago == "Contado")
	{
		precio = precio - (precio * 0.10);
	}
	
	if(fpago == "1Mes")
	{
		precio = precio - (precio * 0.05);
	}
	
	//Gastos transporte
	if(transporte.checked)
	{
		precio += 10;
	}
	
	alert(precio.toFixed(2));
	return true;
}