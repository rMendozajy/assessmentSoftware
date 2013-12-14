package proyecto.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import proyecto.service.GeneralService;


public class ListarActionUsuarioDT extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		GeneralService servicio=new GeneralService();
		ArrayList lista=new ArrayList();
		System.out.println("entroaction");
		lista=servicio.listarUser();
		System.out.println("pasoService");
		//Lo envio al jsp		
		request.setAttribute("usuariosdt",lista);
		return mapping.findForward("dt");
	}

}
