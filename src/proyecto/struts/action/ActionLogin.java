package proyecto.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import proyecto.bean.UsuarioBean;
import proyecto.service.LoginService;
import proyecto.struts.form.LoginForm;

public class ActionLogin extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LoginForm form1=(LoginForm) form;
		String login= form1.getLogin();
		String pwd=form1.getPassword();
		
		UsuarioBean user;
		LoginService servicio = new LoginService();
		
		user = servicio.LogueoUser(login, pwd);
		request.setAttribute("user", user);
		
		if(user!=null){
			
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("nombre", user.getNombre());		
			sesion.setAttribute("tipoUsuario", user.getTipoUsuario());
			if(user.getTipoUsuario().equals("administrador")){
				return mapping.findForward("admin"); 
			}
			if(user.getTipoUsuario().equals("responsable")){
				return mapping.findForward("respo"); 
			}
			if(user.getTipoUsuario().equals("especialista")){
				return mapping.findForward("espec"); 
			}
			if(user.getTipoUsuario().equals("docente")){
				return mapping.findForward("docen"); 
			}
		}else{
				System.out.println("Ingreso al else");
				ActionMessages mensaje = new ActionMessages();
				mensaje.add("mensaje",new ActionMessage("errors.loginError","El login"));
		}
		return mapping.findForward("error"); 
	  }
	}


