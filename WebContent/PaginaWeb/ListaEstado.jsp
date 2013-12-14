<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<fieldset>
	<legend class="h3" align="left"><bean:message key="lista.listE"/></legend>
	<br><br>
<table align="center" border="2" style="border-style: outset">

<tr><td><h1>Nombre</h1></td><td><h1>Tema</h1></td> <td><h1>Tipo</h1></td> <td><h1>Grado</h1></td> <td><h1>Estado</h1></td>  </tr>
<logic:iterate id="estado" name="estados">
<tr>

<td><p><bean:write name="estado" property="nombre"/></p></td>
<td><p><bean:write name="estado" property="tema"/></p></td>
<td><p><bean:write name="estado" property="tipo"/></p></td>
<td><p><bean:write name="estado" property="grado"/></p></td>
<td><p><bean:write name="estado" property="estado"/></p></td>

</tr>
</logic:iterate>

</table>
</fieldset>

</body>
</html>