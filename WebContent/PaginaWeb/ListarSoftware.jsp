<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<fieldset>
	<legend class="h3" align="left">Listado Software Aprobados</legend>
	<br><br>
<table align="center" border="2" style="border-style: outset">

<tr><td><h1>Nombre</h1></td><td><h1>Tema</h1></td> <td><h1>Tipo</h1></td> <td><h1>Fecha</h1></td> <td><h1>Nota</h1></td> <td><h1>Estado</h1></td>  </tr>
<logic:iterate id="softwares" name="software">
<tr>

<td><p><bean:write name="softwares" property="login"/></p></td>
<td><p><bean:write name="softwares" property="codPreg1"/></p></td>
<td><p><bean:write name="softwares" property="codPreg2"/></p></td>
<td><p><bean:write name="softwares" property="codPreg3"/></p></td>
<td><p><bean:write name="softwares" property="codPreg4"/></p></td>
<td><p><bean:write name="softwares" property="codPreg5"/></p></td>

</tr>
</logic:iterate>

</table>
</fieldset>

</body>
</html>