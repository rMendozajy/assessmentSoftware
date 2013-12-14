package proyecto.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{
	
	String login;
	String password;
	String mensaje;
	
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
		
		//1. Invocamos a la clase ActionErrors para validar los campos
		ActionErrors errors=new ActionErrors();
		if(login==null||login.trim().length()==0){
			errors.add("login",new ActionMessage("errors.login","Login"));
			
		}
		if(password==null||password.trim().length()==0){
			errors.add("password",new ActionMessage("errors.password","Password"));
			
		}
		
		
		return errors;
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

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
	
	
	

}
