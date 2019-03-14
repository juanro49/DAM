var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

do
{
	var dni = parseInt(prompt("Escribe el dni sin letra", "12345678"));
	var posicion = dni % 23;
	var letra = prompt("Escribe la letra del dni", "A")
	
	if(dni + letra == dni + letras[posicion])
	{
		alert("DNI correcto")
	}
	else
	{
		alert("DNI erróneo")
	}
} while(confirm);
