do
{
	var numero = parseInt(prompt("Escribe un número"));
	var resultado = numero;
	if(resultado == 0)
	{
		alert("Su factorial es 1")
	}
	else
	{
		for(var i = numero; i > 0; i--)
		{
			resultado *= i;
		}

		alert("Su factorial es " + resultado);
	}
}while(confirm("¿Comprobar otro número?"));
