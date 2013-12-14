<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

 
 <link href="css/maven-base.css" rel="stylesheet" type="text/css" />
 <link href="css/maven-theme.css" rel="stylesheet" type="text/css" />
 <link href="css/site.css" rel="stylesheet" type="text/css" />
 <link href="css/screen.css" rel="stylesheet" type="text/css" />
 

<!-- valores posibles de table class :isis, its, mars, simple, report, mark  -->	

<body>

<fieldset>
	<legend class="h3" align="left"><bean:message key="lista.listU"/></legend>
	<br><br>
<table align="center" border="2" style="border-style: outset" >

<tr> <td><h1><bean:message key="lista.login"/></h1></td> <td><h1><bean:message key="lista.nombr"/></h1></td> <td><h1><bean:message key="lista.tip"/></h1></td><td><h1><bean:message key="lista.apelpa"/></h1></td><td><h1><bean:message key="lista.apelma"/></h1></td></tr>
<logic:iterate id="users" name="usuariosdt">
<tr>

<td><p><bean:write name="users" property="login"/></p></td>
<td><p><bean:write name="users" property="nombre"/></p></td>
<td><p><bean:write name="users" property="apellido_p"/></p></td>
<td><p><bean:write name="users" property="apellido_m"/></p></td>
<td><p><bean:write name="users" property="tipoUsuario"/></p></td>
<td><p><bean:write name="users" property="fechNac"/></p></td>
</tr>
</logic:iterate>

</table>
</fieldset>

</body>
</html>