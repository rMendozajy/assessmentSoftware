package proyecto.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import proyecto.bean.UsuarioBean;
import proyecto.service.GeneralService;
import proyecto.service.UsuarioService;
import proyecto.struts.form.UsuarioForm;


public class ActionUsuario extends DispatchAction{

	
	public ActionForward nuevo(ActionMapping mapping, ActionForm frm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		UsuarioService servicio = new UsuarioService();
		UsuarioBean bean= new UsuarioBean();
		UsuarioForm alumform= (UsuarioForm) frm;
		//Lleno el bean
		
		bean.setLogin(alumform.getLogin());
		bean.setPassword(alumform.getPassword());
		bean.setTipoUsuario(alumform.getTipo());
		bean.setNombre(alumform.getNombre());
		bean.setApellido_p(alumform.getApellido_p());
		bean.setApellido_m(alumform.getApellido_m());
		bean.setEmail(alumform.getEmail());
		bean.setFechNac(alumform.getFechNac());
		bean.setDepartamento(alumform.getDepartamento());
		bean.setProvincia(alumform.getProvincia());
		//inserto
		servicio.newUsuario(bean);
		System.out.println("Inserto datos!");
		
		
		
		return mapping.findForward("listo");
	}
	
	
	
	
}
