<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<html>
<head>
<title>Especialista</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" type="text/javascript" src="js/valida-eval.js"></script>
</head>
<body class="fondo1">

<fieldset style="width: 650px">
	<legend class="h3"><bean:message key="lista.evalsoft"/></legend>	
	<br><br>
	<form action="especialista.do" method="get" onsubmit="return valida(this)">
	<input type="hidden" name="acc" value="eval6">
	<input type="hidden" name="codSoftware" value="<bean:write name="codSoftware" property="codSoftware"/>">			
		<input type="hidden" name="login" value="<bean:write name="login" property="login"/>">
		<table align="left" style="margin-left: 50px" width="550px">
  			<tr>  				
    			<td><br><br><h1><bean:message key="lista.aspe3"/></h1></td>
    		</tr>    		
    		<tr>  				
    			<td><br><h4><bean:message key="lista.item6"/></h4><input type="hidden" name="estoyEn" value="item007"><input type="hidden" name="flageval" value="0"></td>
    		</tr>
    		<tr>  				
    			<td><h5><bean:message key="lista.matesoftedu"/></h5></td>
    		</tr>	
			<tr>
				<td style="border-style: solid">
				<bean:message key="lista.eje1"/><br><br>
					<input type="hidden" name="codPreg1" value="preg023">
					<select style="margin-left: 400px;" name="nota1">
    				<option value="0"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate> 				    				
    			</select><br></td>
			</tr>
	
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.eje2"/><br><br>
					<input type="hidden" name="codPreg2" value="preg024">
					<select style="margin-left: 400px;" name="nota2">
    				<option value="0"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>   				    				
    			</select><br></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.eje3"/><br><br>
					<input type="hidden" name="codPreg3" value="preg025">
					<select style="margin-left: 400px;" name="nota3">
    				<option value="0"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>    				    				
    			</select><br></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
			
				<bean:message key="lista.eje4"/><br><br>
					<input type="hidden" name="codPreg4" value="preg026">
					<select style="margin-left: 400px;" name="nota4">
    				<option value="0"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>    				    				
    			</select><br></td>
			</tr>
						
			<tr>
				<td style="border-style: solid">
			
				<bean:message key="lista.eje5"/><br><br>
					<input type="hidden" name="codPreg5" value="preg027">
					<select style="margin-left: 400px;" name="nota5">
    				<option value="0"><bean:message key="lista.seleccione"/></option>
    				<logic:iterate id="notas1" name="getNotas1">
    				<option value="<bean:write name="notas1" property="puntaje"/>">
    				<bean:write name="notas1" property="puntaje"/></option>
    				</logic:iterate>  				    				
    			</select><br></td>
			</tr>				
			<tr align="right">
           		<td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="submit" name="validar" value="Siguiente"></td>
            </tr>				
		</table>
	</form>
</fieldset>
</body>
</html>