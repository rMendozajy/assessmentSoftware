package proyecto.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;



public class SoftwareForm extends ActionForm{
	
	String codSoftware;
	String nombre_s;
	String descripcion_s;
	String tipoSoftware;
	String codUsuario;
	String grado;
	String tema;
	String educa;
	
	public String getCodSoftware() {
		return codSoftware;
	}
	public void setCodSoftware(String codSoftware) {
		this.codSoftware = codSoftware;
	}
	public String getNombre_s() {
		return nombre_s;
	}
	public void setNombre_s(String nombre_s) {
		this.nombre_s = nombre_s;
	}
	public String getDescripcion_s() {
		return descripcion_s;
	}
	public void setDescrpcion_s(String descrpcion_s) {
		this.descripcion_s = descrpcion_s;
	}
	public String getTipoSoftware() {
		return tipoSoftware;
	}
	public void setTipoSoftware(String tipoSoftware) {
		this.tipoSoftware = tipoSoftware;	}
	
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getEduca() {
		return educa;
	}
	public void setEduca(String educa) {
		this.educa = educa;
	}
	

	
	
}
