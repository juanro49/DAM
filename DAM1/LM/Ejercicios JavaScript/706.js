var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

var dni = parseInt(prompt("Escribe el dni sin letra", "12345678"));

if(dni <= 99999999 && dni >= 1)
{
	var posicion = dni % 23;
	
	alert("El DNI con letra es:\t" + dni + letras[posicion])
}
else
{
	alert("DNI erróneo")
}