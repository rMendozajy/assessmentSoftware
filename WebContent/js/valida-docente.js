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
  	function validanombre(F)
  	{
  		if(vacio(F.nombre.value)==false)
  			{alert('Introduzca el nombre del docente');
  			}	
  		else
  		{ if(vacio(F.ap.value)==false)
			{alert('Introduzca el Apellido Paterno del docente');}
  		  else
  		  {  if(vacio(F.am.value)==false)
			   {alert('Introduzca el Apellido Materno del docente');}
  		    else
  		    { 
    		   if(F.Departamento.selectedIndex==0)
                  {alert('Debe seleccionar un Departamento para el docente');
	              } 	            
		          else
 		            {  if(F.Provincia.selectedIndex==0)
                       {alert('Debe seleccionar una Provincia para el docente');
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
 		         
  		   
   
  	
  	