<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<title>RegistroDocente</title>
<link href="../css/example.css" rel="stylesheet" type="text/css" />
   <script type="text/javascript" language="javascript" src="../qqt/domLib.js"></script>
   <script type="text/javascript" language="javascript" src="../qqt/fadomatic.js"></script>
   <script type="text/javascript" language="javascript" src="../qqt/domTT.js"></script>
   <script>
var domTT_styleClass = 'domTTOverlib';
var domTT_oneOnly = true;
    </script>
<link href="../css/style.css" rel="stylesheet" type="text/css" />

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
 <form action="#." method="get" id="formID">
	<fieldset>
	<legend class="h3"><bean:message key="lista.regDo"/></legend>
	<br><br>
	  <table align="center">
      
       <tr>
         <td><h1><bean:message key="lista.ingdat"/></h1><br><br> </td>
       <tr>
       <tr>
       <td></td>
	     <td><!-- -->
	     <p><a onmouseover="domTT_activate(this, event, 'caption', 'Usuario', 'content', 'Este es un campo de mucha relevancia ingrese su usuario', 'trail', true, 'lazy', true);"><bean:message key="lista.usua"/></a></p>
	     </td>
         <td><input class="textfield" type="text" name="usuario" size="30"></td>
       </tr>
       <tr>
         <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Password', 'content', 'Este es un campo de mucha relevancia ingrese su password', 'trail', true, 'lazy', true);"><bean:message key="lista.contra"/></a></p></td>
         <td><input class="textfield" type="password" name="pwd" size="20"></td>
       </tr>
       <tr>
         <td><h1><bean:message key="lista.ingdatper"/></h1><br><br> </td>
       <tr>
         <td></td>
	     <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Nombre', 'content', 'Este es un campo de mucha relevancia ingrese su Nombre', 'trail', true, 'lazy', true);"><bean:message key="lista.nombr"/></a> </p></td>
         <td><input class="textfield" type="text" name="nombre" size="30"></td>
       </tr>
       <tr>
       	<td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Apellido Paterno', 'content', 'Este es un campo de mucha relevancia ingrese su Apellido Paterno', 'trail', true, 'lazy', true);"><bean:message key="lista.apelpa"/></a></p></td>
         <td><input class="textfield" type="text" name="ap" size="20"></td>
       </tr>
       <tr>
       	 <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Apellido Materno', 'content', 'Este es un campo de mucha relevancia ingrese su Apellido Materno', 'trail', true, 'lazy', true);"><bean:message key="lista.apelma"/></a></p></td>
         <td><input class="textfield" type="text" name="am" size="20"></td>
       </tr>
       <!-- Aquí se debe poner el departamento, rpovincia y cuidad con -->  
       <tr>
	       <td></td>
	       <td><label for="provincia"><bean:message key="lista.depta"/></label></td>
	       <td><select  name="Departamento" id="provincia">
	       		<option value="0"><bean:message key="lista.cargando"/></option>
	       </select></td>
       </tr> 
       
       <tr>
	       <td></td>
	       <td style="padding-top: 10px"><label for="municipio"><bean:message key="lista.provi"/></label></td>
	       <td style="padding-top: 10px"><select name="Provincia" id="municipio">
	          <option value="0"><bean:message key="lista.selec"/></option>
	       </select></td>
       </tr>      
                 
       <tr align="right">
         <td  style="padding-top: 20px" colspan="3"><input class="send_btn2" type="submit" name="validar" value="Registar"></td>
       </tr>
       
    </table>  
    </fieldset>
	</form>  	
</body>
</html>