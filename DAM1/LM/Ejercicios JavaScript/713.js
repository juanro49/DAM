function valid()
{
	var valor = document.getElementById("numero").value;
	
    if( valor != parseInt(valor))
	{
		alert("Campo obligatorio");
		return false;
    }
	else
	{
       alert("Formulario enviado");
       return true;
    }
}