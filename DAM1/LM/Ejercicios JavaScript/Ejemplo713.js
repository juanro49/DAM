function valid(){
  var indice=document.getElementById("lista").selectedIndex;
  if(indice == null || indice==0){
	alert("Debe seleccionar un elemento de la lista");
	return false;
  }	
  alert("Formulario enviado");
  return true;  
}