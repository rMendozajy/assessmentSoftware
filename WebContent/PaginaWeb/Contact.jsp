<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<title>RegistroDelSoftware</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" />

</head>
<body class="fondo1"> 

	<fieldset>
	<legend class="h3"><bean:message key="lista.conta"/></legend>
	<br><br>
	<form action="#." method="post">
	<table align="center">
	   <tr>
	       	<td></td>
	        <td><p><bean:message key="lista.nombre"/></p></td>
	        <td><input class="textfield" type="text" name="nombre" size="30"></td>
       </tr>
       <tr>
	       	<td></td>
	        <td><p><bean:message key="lista.telefono"/></p></td>
	        <td><input class="textfield" type="text" name="phone" size="30"></td>
       </tr>
        <tr>
	       	<td></td>
	        <td><p><bean:message key="lista.correo"/></p></td>
	        <td><input class="textfield" type="text" name="phone" size="30"></td>
       </tr>
       <tr>
       <td></td>
       <td><p><bean:message key="lista.tipo"/></p></td>       
       <td>
       <select name="tipo">
       <option value="0"><bean:message key="lista.seleccione"/></option>
       <option value="1"><bean:message key="lista.queja"/></option>
       <option value="2"><bean:message key="lista.sugerencia"/></option>
       <option value="3"><bean:message key="lista.pregunta"/></option>
       <option value="4"><bean:message key="lista.otros"/></option>
       </select>
       </td>
       </tr>       
       <tr>
	        <td></td>
	        <td><p><bean:message key="lista.descripcion"/></p></td>
	        <td><textarea  rows="5" cols="20" name="descripcion"></textarea></td>       
       </tr>       	                 
       <tr align="right">
        	<td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="submit" name="validar" value="Enviar"></td>
       </tr>       
	    </table>	    
	</form>   
	</fieldset>
    
    
</body>
</html>