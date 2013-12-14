<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CSEC Website - Home</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body class="fondo">
<div id="contenedor">
   
    <div id="cabecera_logo">
    	<div id="seccion_logo">
		   <div class="img_logo"></div>
        	<div class="txt_logo">CSEC</div>
      </div>
        <div id="cabecera">
        	<div class="titulo">
            	<p class="bigtext"><bean:message key="lista.presentacion1"/></p>
    	    	<bean:message key="lista.presentacion2"/>
    	    </div>
        </div>
	</div>
    
	<div id="menu1">
    	<div id="buscar">
				<input class="textfield" type="text" value="<bean:message key="lista.buscar"/>"/> 
				<input class="send_btn" type="submit" value="<bean:message key="lista.ir"/>" />
    	</div>
        <div id="menu2">        	
            <ul>            	
                <li><a href="PaginaWeb/Inicio.jsp" target="contenido"><bean:message key="lista.casa"/></a></li>
                <li><a href="PaginaWeb/Acerca.jsp" target="contenido"><bean:message key="lista.acerca"/></a></li>
                <li><a href="PaginaWeb/Servicios.jsp" target="contenido"><bean:message key="lista.servicios"/></a></li>
                <li><a href="PaginaWeb/Inicio.jsp" target="contenido"><bean:message key="lista.soluciones"/></a></li>
                <li><a href="PaginaWeb/Contact.jsp" target="contenido"><bean:message key="lista.contactenos"/></a></li>               
            </ul>            
        </div>
	</div>
    
    <!-- empieza el contenido -->
    
	<div id="contenido">
    
    	<!-- contenido de la izquierda -->
    
    	<div id="contenido_izq">        	

            <div id="seccion1_izq">
                <div class="top">
                    <h2><bean:message key="lista.ingreso"/></h2>
                </div>
                <div class="bottom">
                    <form action="index.jsp">                   
                     <h2 align="left"><bean:message key="lista.bienvenidoDo"/><br><bean:write name="user" property="nombre"/> <bean:write name="user" property="apellido_p"/></h2><br>
                     <input type="submit" class="send_btn2" value="<bean:message key="lista.salir"/>">
                     </form>
                </div>            
            </div>
                                    
            <div id="section2_izq">
             <div class="top">
                    <h2><bean:message key="lista.opciones"/></h2>
                </div>
                <div class="bottom">
                	<ul>
                        <li><a href="docente.do?acc=estado&codigo=<bean:write name="user" property="login"/>" target="contenido"><bean:message key="lista.listE"/></a></li>  
                        <li><a href="docente.do?acc=historial&codigo=<bean:write name="user" property="login"/>" target="contenido" ><bean:message key="lista.listH"/></a></li>                                        
					</ul>   
					<br><br> 					           
            	</div>
            </div>   
            
            <div class="section3_izq">
            </div>     		        
        </div>
        
        <!-- termina el contenido de la izquierda -->
        
        <!-- comienza contenido del centro -->
        
        <div>
    	<iframe id="contenido_centro"" name="contenido" src="PaginaWeb/Inicio.jsp" frameborder="0">
        
        </iframe>
     	</div>
        
        <!-- termina contenido del centro -->  
        
        
     
    
    </div>
    
    <!-- termina el contenido -->
        
    <!-- pie de pagina  -->
	<div id="templatemo_footer">
        <a href="Docente.jsp"><bean:message key="lista.casa"/></a> | <a href="Acerca.jsp" target="contenido"><bean:message key="lista.acerca"/></a> | <a href="Servicios.jsp" target="contenido"><bean:message key="lista.servicios"/></a> | <a href="Docente.jsp"><bean:message key="lista.soluciones"/></a> | <a href="Contact.jsp" target="contenido"><bean:message key="lista.contactenos"/></a><br />
        <bean:message key="lista.derechos"/> <a href="#"> CSEC</a> </div>
    <div id="templatemo_footer_bottom"></div>

</div>
</body>
</html>