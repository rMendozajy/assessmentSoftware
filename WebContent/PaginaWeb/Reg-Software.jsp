<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<title>Registro Del Software</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
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
	<legend class="h3"><bean:message key="lista.regsoft"/></legend>
	<br><br>
	<form action="responsable.do" method="post" id="formID">
	<input type="hidden" name="acc" value="regsoft">
	<table align="center">
	   <tr>
			<td><h1><bean:message key="listareg1"/></h1><br><br></td>	       
       </tr>
       <tr>
	       	<td></td>
	        <td><p><bean:message key="listareg2"/></p></td>
	        <td><input class="validate[required,custom[onlyLetterNumber]]" type="text" name="nombre_s" id="nombre_s" size="30"></td>
       </tr>
       <tr>
	        <td></td>
	        <td><p><bean:message key="listareg3"/></p></td>
	        <td><textarea  rows="5" cols="20" name="descripcion_s" id="descripcion_s" class="validate[required]"></textarea></td>       
       </tr>
       <tr>
	       	<td></td>
	        <td><p><bean:message key="listareg4"/></p></td>
	        <td><select name="tipoSoftware" id="tipoSoftware" class="validate[required]">
         	<option value=""><bean:message key="lista.seleccione"/></option>
         	<option value="aplicacion"><bean:message key="lista.apli"/></option>
         	<option value="calculo"><bean:message key="lista.calc"/></option>
         	<option value="diseño asistido"><bean:message key="lista.dis"/></option>
         	<option value="control numerico"><bean:message key="lista.control"/></option>
         	</select></td>     
       </tr>	
       <tr>
	       	<td></td>
	        <td><p><bean:message key="listareg5"/></p></td>
	        <td><select name="tema" id="tema" class="validate[required]">
         	<option value=""><bean:message key="lista.seleccione"/></option>
         	<option value="Cultural"><bean:message key="lista.cultural"/></option>
         	<option value="Educativo"><bean:message key="lista.educativo"/></option>
         	</select></td>       
       </tr>	
       <tr>
	       	<td></td>
	        <td><p><bean:message key="lista.educ"/></p></td>
	        <td><select name="educa" id="educa" class="validate[required]">
         	<option value=""><bean:message key="lista.seleccione"/></option>
         	<option value="primaria"><bean:message key="lista.primaria"/></option>
         	<option value="secundaria"><bean:message key="lista.secundaria"/></option>
         	</select></td>       
       </tr>	
       <tr>
       		<td></td>
	        <td><p><bean:message key="lista.grado"/></p></td>
	        <td><select name="grado" id="grado" class="validate[required]">
         	<option value=""><bean:message key="lista.seleccione"/></option>
         	<option value="1">1</option>
         	<option value="2">2</option>
         	<option value="3">3</option>
         	<option value="4">4</option>
         	<option value="5">5</option>
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