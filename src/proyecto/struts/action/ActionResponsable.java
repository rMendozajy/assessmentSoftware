package proyecto.struts.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;




import proyecto.bean.SoftwareBean;
import proyecto.service.GeneralService;
import proyecto.struts.form.SoftwareForm;


public class ActionResponsable extends DispatchAction{

	public ActionForward espec(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		ArrayList listaesp = new ArrayList(); 
		listaesp = servicio.getEspecialistas();
		System.out.println("entro al espec");
		request.setAttribute("listaesp", listaesp);
		
		
		return mapping.findForward("designaE");
	}
	
	public ActionForward soft(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		ArrayList listasoft = new ArrayList(); 
		listasoft = servicio.getSoftwares();
		System.out.println("entro al soft");
		request.setAttribute("listasoft", listasoft);
		
		
		return mapping.findForward("cargaDato");
	}
	
	public ActionForward soft2(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		ArrayList listasoft = new ArrayList(); 
		listasoft = servicio.getSoftwares2();
		System.out.println("entro al soft2");
		request.setAttribute("listasoft", listasoft);
		
		
		return mapping.findForward("cargaDato2");
	}
	
	public ActionForward doce(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		ArrayList listadoc = new ArrayList(); 
		listadoc = servicio.getDocentes();
		System.out.println("entro al doce");
		request.setAttribute("listadoc", listadoc);
		
		
		return mapping.findForward("designaD");
	}
	
	public ActionForward asignaE(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		GeneralService servicio = new GeneralService();
		SoftwareForm frm = (SoftwareForm)form;
		
		String codS = frm.getCodSoftware();
		String codE = frm.getCodUsuario();
		
		servicio.AsignaSoftware(codS, codE);
		System.out.println("paso la asignacion");
		
		
		return mapping.findForward("lista");
	}
	
	public ActionForward asignaD(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		GeneralService servicio = new GeneralService();
		SoftwareForm frm = (SoftwareForm)form;
		
		String codS = frm.getCodSoftware();
		String codD = frm.getCodUsuario();
		
		servicio.AsignaAutorSoftware(codS,codD);
		System.out.println("paso la asignacion");
		
		
		return mapping.findForward("lista2");
	}
	
	public ActionForward regsoft(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		GeneralService servicio = new GeneralService();
		SoftwareBean bean= new SoftwareBean();
		SoftwareForm softform= (SoftwareForm) form;
		Calendar fecha = new GregorianCalendar();
		int mes = fecha.get(Calendar.MONTH)+1;
		String fechaR = fecha.get(Calendar.YEAR)+"-"+mes+"-"+fecha.get(Calendar.DATE);
		System.out.println(fechaR);
		//Lleno el bean
		if(softform.getNombre_s()==null){
			System.out.println("fallo");
			return mapping.findForward("regisoft");}
		
		bean.setNombre(softform.getNombre_s());
		bean.setDescripcion(softform.getDescripcion_s());
		bean.setTema(softform.getTema());
		bean.setTipo(softform.getTipoSoftware());
		bean.setGrado(softform.getGrado());
		bean.setEducacion(softform.getEduca());
		bean.setFechaReg(fechaR);
		System.out.println("Es"+softform.getNombre_s()+ softform.getDescripcion_s()+ softform.getTema());
		//inserto
		
		servicio.RegSoft(bean);
			 System.out.println("Inserto datos software!");
		
		
		return mapping.findForward("regisoft");
	}
	
	
}
