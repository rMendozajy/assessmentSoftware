<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<html>
<head>
<title>Especialista</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body class="fondo1">

<fieldset style="width: 650px">
	<legend class="h3"><bean:message key="lista.evalsoft"/></legend>	
	<br><br><br><br>
	<form action="especialista.do" method="get" onsubmit="return valida(this)">		
		<input type="hidden" name="acc" value="eval1">
		<input type="hidden" name="login" value="<bean:write name="login" property="login"/>">
		<table align="left" style="margin-left: 50px" width="550px">
  			<tr>  				
    			<td><h1><bean:message key="lista.softeva"/></h1><input type="hidden" name="estoyEn" value="item002"><input type="hidden" name="flageval" value="1"></td>
    		</tr>   			
   			<tr>   	
   				<td style="padding-left: 300px">Software:<br>			
    			<select name="codSoftware">
	       		<option value="0"><bean:message key="lista.softeva"/></option>
	        	<logic:iterate id="softwares" name="listasoft">		      	  
		          <option value="<bean:write name="softwares" property="codigo"/>">          		
		          		<bean:write name="softwares" property="nombre"/> 		
		         </logic:iterate>	        	     	
	       		 </select>
    		</tr>   		
    		<tr>  				
    			<td><h1><bean:message key="lista.aspepeda"/></h1></td>
    		</tr>
    		<tr>  				
    			<td><h4><bean:message key="lista.aprensign"/></h4></td>
    		</tr>
    		<tr>  				
    			<td><h5><bean:message key="lista.matesoftedu"/></h5></td>
    		</tr>	
			<tr>		
				<td style="border-style: solid">
				<bean:message key="lista.muestrainf1"/><br><br>				
					<input type="hidden" name="codPreg1" value="preg001">
					<select style="margin-left: 400px;" name="nota1">
    				<option selected value="-1"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>  				    				
    			</select><br></td>
			</tr>		
			<tr>
				
				<td style="border-style: solid">				
				<bean:message key="lista.muestrainf2"/><br><br>				
					<input type="hidden" name="codPreg2" value="preg002">
					<select style="margin-left: 400px;" name="nota2">
    				<option selected value="-1"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>  		  				    				
    			</select><br></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.muestrainf3"/><br><br> 
					<input type="hidden" name="codPreg3" value="preg003">
					<select style="margin-left: 400px;" name="nota3">
    				<option selected value="-1"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>  		 				    				
    			</select><br></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
			
				<bean:message key="lista.muestrainf4"/><br><br>
					<input type="hidden" name="codPreg4" value="preg004">
					<select style="margin-left: 400px;" name="nota4">
    				<option selected value="-1"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>  		 	  				    				
    			</select><br></td>
			</tr>				
			<tr align="right">
           		<td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="submit" value="Seguir"></td>
            </tr>				
		</table>
	</form>
</fieldset>
</body>
</html>