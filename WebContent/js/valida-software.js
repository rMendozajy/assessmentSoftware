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
  		if(F.grado.selectedIndex==0)
  		{ alert('Selecciones un docente');	
  		}
  		else
  		{
  			if(F.tema.selectedIndex==0)
  			{ alert('Selecciones un tema');}
  			else
  			{
  			if(vacio(F.nombre_s.value)==false)
	         	{alert('Introduzca el nombre del software del docente');
	         	} 
	       		else
	         	{if(vacio(F.descripcion_s.value)==false)
	            	{alert('Introduzca la descripción del software del docente');
	            	} 
	          	 else
	            	{if(vacio(F.tipoSoftware.value)==false)
	            	   {alert('Introduzca el tipo de software del docente');
	            	   } 
	          	     else
	            	   {alert('Muchas gracias por enviar el formulario');
	             	    F.submit(); 		             	                                  			
	            	    }
	        	    }
	             }
  			}
  		}  		
  		return false;
  	}