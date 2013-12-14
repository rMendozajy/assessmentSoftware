<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Responsable</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/validationEngine.jquery.css" type="text/css"/>
        
<script src="js/jquery-1.6.min.js" type="text/javascript"></script>
<script src="js/languages/jquery.validationEngine-es.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.validationEngine.js" type="text/javascript" charset="utf-8"></script>
        
<script>
            jQuery(document).ready(function(){
                // binds form submission and fields to the validation engine
                jQuery("#formID").validationEngine();
            });
            
            /**
             *
             * @param {jqObject} the field where the validation applies
             * @param {Array[String]} validation rules for this field
             * @param {int} rule index
             * @param {Map} form options
             * @return an error string if validation failed
             */
            function checkHELLO(field, rules, i, options){
                if (field.val() != "HELLO") {
                    // this allows to use i18 for the error msgs
                    return options.allrules.validate2fields.alertText;
                }
            }
</script>
</head>


<body class="fondo1">

<fieldset>
	<legend class="h3"><bean:message key="lista.asigautor"/></legend>
	<br><br>
	<form action="responsable.do" method="post" id="formID">
	<input type="hidden" name="acc" value="asignaD">
	<table align="center">
	  	 <tr>
         <td><h1><bean:message key="lista.asigautorSof"/></h1><br><br> </td>
       <tr>
	  	<tr>
	  		<td></td>
	        <td><p><bean:message key="lista.docente"/><br></p></td>     
	        <td><select name="codUsuario" id="codUsuario" class="validate[required]">
	        	<option value=""><bean:message key="lista.elija"/></option>
	        	<logic:iterate id="docentes" name="listadoc">
		      	  <option value="<bean:write name="docentes" property="login"/>">          		
		          		<bean:write name="docentes" property="nombre"/> <bean:write name="docentes" property="apellido_p"/>
		          		<bean:write name="docentes" property="apellido_m"/>  		
		         </logic:iterate>	        	     	
	        </select></td>
	    </tr>
	    <tr>
	    	<td></td>
	        <td><p><bean:message key="lista.elijasoft"/> <br></p></td>     
	       <td><select name="codSoftware" id="codSoftware" class="validate[required]">
	       		<option value=""><bean:message key="lista.elija"/></option>
	        	<logic:iterate id="softwares" name="listasoft">		      	  
		          <option value="<bean:write name="softwares" property="codigo"/>">          		
		          		<bean:write name="softwares" property="nombre"/> 		
		         </logic:iterate>	        	     	
	        </select></td>
	    </tr>    
	     <tr align="right">
         <td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="submit" name="validar" value="Registar"></td>
       </tr>
	</table>
	</form>
	</fieldset>
</body>
</html>