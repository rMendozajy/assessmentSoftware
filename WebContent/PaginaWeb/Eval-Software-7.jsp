<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<html>
<head>
<title>Especialista</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" type="text/javascript" src="js/valida-eval.js"></script>
<script type="text/javascript">
	function enviar(){
		if (confirm('¿ Esta seguro que desea terminar de evaluar ?')){
			var i;
			var pos;
			for(i=0;i<document.form1.estado.length;i++){
				if(document.form1.estado[i].checked){	
						pos = i+1;
						break;
				}else{
						pos= -1;
				}
			}	
			if(pos>=0){
			document.form1.acc.value ='re_cam_rechazado';		
			}else{
			document.form1.acc.value ='re_cam_evaluado';
			}
			document.form1.submit();
		}	
	}
	</script>
</head>

<body class="fondo1">

<fieldset style="width: 650px">
	<legend class="h3"><bean:message key="lista.evalsoft"/></legend>	
	<br><br>
	<form action="especialista.do" method="post" name="form1" >	
	<input type="hidden" name="acc" value="">	
	<input type="hidden" name="codSoftware" value="<bean:write name="codSoftware" property="codSoftware"/>">
		<input type="hidden" name="login" value="<bean:write name="login" property="login"/>">
		<table align="left" style="margin-left: 50px" width="550px">
  			<tr>  				
    			<td><br><br><h1><bean:message key="lista.aspe4"/></h1><input type="hidden" name="flageval" value="0"></td>
    		</tr>    		
    		<tr>  				
    			<td><br><h4><bean:message key="lista.item7"/></h4><input type="hidden" name="estoyEn" value="item001"></td>
    		</tr>
    		<tr>  				
    			<td><h5><bean:message key="lista.matesoftedu"/></h5></td>
    		</tr>
			<tr>
				<td style="border-style: solid">
				<bean:message key="lista.noereje1"/><br><br>	
				<br></td>
				<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
	
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.noereje2"/><br><br>
					
				<br></td>
				<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.noereje3"/><br><br><br></td>
			<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
			
				<bean:message key="lista.noereje4"/><br><br>
				<br></td>
				<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
			<br></td>
			<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				<bean:message key="lista.noereje6"/><br><br><br></td>
				<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
	
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.noereje7"/><br><br><br></td>
			<td style="border-style: solid"> <input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				
				<bean:message key="lista.noereje8"/><br><br><br></td>
			<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
				<td style="border-style: solid">
				<bean:message key="lista.noereje9"/><br><br></td>
			<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>
			
			<tr>
			<td style="border-style: solid">
			
				<bean:message key="lista.noereje10"/><br><br><br></td>
				<td style="border-style: solid"><input type="checkbox" name="estado"></td>
			</tr>	
			<tr align="right">
           		<td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="button" name="validar" value="Registar" onclick="return enviar()"></td>
            </tr>				
		</table>
	</form>
</fieldset>
</body>
</html>