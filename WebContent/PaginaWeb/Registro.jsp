<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

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


<link rel="stylesheet" href="../css/validationEngine.jquery.css" type="text/css"/>
        
<script src="../js/jquery-1.6.min.js" type="text/javascript"></script>
<script src="../js/languages/jquery.validationEngine-es.js" type="text/javascript" charset="utf-8"></script>
<script src="../js/jquery.validationEngine.js" type="text/javascript" charset="utf-8"></script>
        
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
<script type="text/javascript" language="javascript" src="../js/ajax.js"></script>

</head>
<body class="fondo1">    
 
 <form action="usuario.do" method="post" id="formID">
	<input type="hidden" name="acc" value="nuevo">
	<fieldset>
	<legend class="h3" align="left"><bean:message key="lista.reg"/></legend>
	<br><br>
	  <table align="center">
        <tr>        
         <td><h1><bean:message key="lista.seltip"/></h1><br><br> </td>
         <td></td>
         <td><select name="tipo" id="tipo" class="validate[required]">
         <option value=""><bean:message key="lista.seleccione"/></option>
         <option value="responsable"><bean:message key="lista.resp"/></option>
         <option value="especialista"><bean:message key="lista.Espe"/></option>
         <option value="docente"><bean:message key="lista.doce"/></option>
         </select></td>
       <tr>
       <tr>
         <td><h1><bean:message key="lista.ingcuet"/></h1><br><br> </td>
       <tr>
       <tr>
       <td></td>
	     <td><!-- -->
	     <p><a onmouseover="domTT_activate(this, event, 'caption', 'Usuario', 'content', 'Ingrese un usuario [solo letras y numeros]', 'trail', true, 'lazy', true);"><bean:message key="lista.usua"/></a></p>
	     </td>
         <td><input class="validate[required,custom[onlyLetterNumber]]" type="text" name="login" id="login" size="30"></td>
       </tr>
       <tr>
         <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Password', 'content', 'Ingrese un password entre 6 y 12 caracteres [solo letras y numeros]', 'trail', true, 'lazy', true);"><bean:message key="lista.contra"/></a></p></td>
         <td><input class="validate[required,custom[onlyLetterNumber],minSize[3],maxSize[12]" type="password" id="password" name="password" size="20"></td>
       </tr>
        <tr>
         <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Password', 'content', 'Ingrese un password entre 6 y 12 caracteres [solo letras y numeros]', 'trail', true, 'lazy', true);"><bean:message key="lista.contraConfirm"/></a></p></td>
         <td><input class="validate[required,equals[password]]" type="password" name="password2" id="password2" size="20"></td>
       </tr>
       <tr>
         <td><h1><bean:message key="lista.ingper"/></h1><br><br> </td>
       <tr>
         <td></td>
	     <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Nombre', 'content', 'Este es un campo de mucha relevancia ingrese su Nombre', 'trail', true, 'lazy', true);"><bean:message key="lista.nombr"/></a> </p></td>
         <td><input class="validate[required,custom[onlyLetterSp]]" type="text" name="nombre" id="nombre" size="30"></td>
       </tr>
       <tr>
       	<td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Apellido Paterno', 'content', 'Este es un campo de mucha relevancia ingrese su Apellido Paterno', 'trail', true, 'lazy', true);"><bean:message key="lista.apelpa"/></a></p></td>
         <td><input class="validate[required,custom[onlyLetterSp]]" type="text" name="apellido_p" id="apellido_p" size="20"></td>
       </tr>
       <tr>
       	 <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'Apellido Materno', 'content', 'Este es un campo de mucha relevancia ingrese su Apellido Materno', 'trail', true, 'lazy', true);"><bean:message key="lista.apelma"/></a></p></td>
         <td><input class="validate[required,custom[onlyLetterSp]]" type="text" name="apellido_m" id="apellido_m" size="20"></td>
       </tr>
       <tr>
       	 <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'email', 'content', 'Este es un campo de mucha relevancia ingrese su email', 'trail', true, 'lazy', true);"><bean:message key="lista.correo"/></a></p></td>
         <td><input class="validate[required,custom[email]]" type="text" name="email" id="email" size="20"></td>
       </tr>
       <tr>
       	 <td></td>
         <td><p><a onmouseover="domTT_activate(this, event, 'caption', 'fecha_Nac', 'content', 'Este es un campo de mucha relevancia ingrese su Fecha de Nacimiento', 'trail', true, 'lazy', true);"><bean:message key="lista.fechaNac"/><br><bean:message key="lista.formatF"/></a></p></td>
         <td><input class="validate[required,custom[date]]" type="text" name="fechNac" id="Fecha_Nac" size="20"></td>
       </tr>
  <!-- Aquí se debe poner el departamento, rpovincia y cuidad con -->  
       <tr>
	       <td></td>
	       <td><label for="provincia"><bean:message key="lista.depta"/></label></td>
	       <td><select  name="departamento" id="provincia" class="validate[required]">
	       		<option value="">Cargando...</option>
	       </select></td>
       </tr> 
       
       <tr>
	       <td></td>
	       <td style="padding-top: 10px"><label for="municipio"><bean:message key="lista.provi"/></label></td>
	       <td style="padding-top: 10px"><select name="provincia" id="municipio" class="validate[required]">
	          <option value=""><bean:message key="lista.selec"/></option>
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