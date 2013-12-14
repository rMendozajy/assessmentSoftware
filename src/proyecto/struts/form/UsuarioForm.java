package proyecto.struts.form;

import org.apache.struts.action.ActionForm;

public class UsuarioForm extends ActionForm{
	
	String tipo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	String login;
	String password;
	String nombre;
	String apellido_p;
	String apellido_m;
	String email;
	String fechNac;
	String departamento;
	String provincia;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_p() {
		return apellido_p;
	}
	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}
	public String getApellido_m() {
		return apellido_m;
	}
	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechNac() {
		return fechNac;
	}
	public void setFechNac(String fechNac) {
		this.fechNac = fechNac;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
