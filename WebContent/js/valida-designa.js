function vacio(q)
		{ for (i=0;i<q.length;i++)
			{ if(q.charAt(i)!="")
				{return true;
				}
			} 
			return false;
		}
  	//valida que el el campo no esta vacio y no tenga
  	//solo espacios en blanco
  	function valida(F)
  	{  	
  		if(F.codEspecialista.selectedIndex==0)
  		{alert('Elija un especialista');  			
  		}else{
  			if(F.codSoftware.selectedIndex==0)
  	  		{alert('Elija un software');  	  			
  	  		}
  			else
      	   {alert('Muchas gracias por enviar el formulario');
      	    F.submit(); 		             	                                  			
      	    }
  		}
  		return false;
  	}