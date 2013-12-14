package proyecto.struts.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import proyecto.service.GeneralService;

public class ActionDocente extends DispatchAction{

	public ActionForward estado(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception { 
		Calendar fecha = new GregorianCalendar();
		int year = fecha.get(Calendar.YEAR);
				
		String codUsuario = request.getParameter("codigo");
		GeneralService servicio=new GeneralService();
		ArrayList lista=new ArrayList();
		System.out.println("entroaction");
		lista=servicio.listarEstado(codUsuario,Integer.toString(year));
		System.out.println("pasoService");
		//Lo envio al jsp		
		request.setAttribute("estados",lista);
		return mapping.findForward("listaE");
	}
	
	
	public ActionForward historial(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String codUsuario = request.getParameter("codigo");
		GeneralService servicio=new GeneralService();
		ArrayList lista=new ArrayList();
		System.out.println("entroaction");
		lista=servicio.Historial(codUsuario);
		System.out.println("pasoService");
		//Lo envio al jsp		
		request.setAttribute("historialS",lista);
		return mapping.findForward("listaH");	
	}
}
