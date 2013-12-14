package proyecto.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import proyecto.bean.EvaluaBean;
import proyecto.bean.UsuarioBean;
import proyecto.service.GeneralService;
import proyecto.struts.form.EvaluaForm;

public class ActionEspecialista extends DispatchAction{
	
	public ActionForward list(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String codEspec = request.getParameter("codigo");
		
		GeneralService servicio=new GeneralService();
		ArrayList lista=new ArrayList();
		System.out.println("entroaction");
		lista=servicio.listarSoftware(codEspec);
		System.out.println("pasoService");
		//Lo envio al jsp		
		request.setAttribute("software",lista);
		return mapping.findForward("lista");
	}	
	
	
	public ActionForward soft(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UsuarioBean beann = new UsuarioBean();
		GeneralService servicio = new GeneralService();
		beann.setLogin(request.getParameter("codigo"));
		String codEspec  = request.getParameter("codigo");
		ArrayList listasoft = servicio.getSoftwares_Especialista(codEspec);
		request.setAttribute("listasoft", listasoft);	
		String estoyEn = request.getParameter("estoyEn");
		ArrayList listanotas1 = servicio.getNotas1(estoyEn);
		System.out.println(codEspec);
		System.out.println(estoyEn);
		request.setAttribute("getNotas1", listanotas1);
		request.setAttribute("login", beann);		
		return mapping.findForward("listar");	
	}
	
	public ActionForward re_cam_rechazado(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		UsuarioBean beann = new UsuarioBean();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setLogin(frm.getLogin());		
		servicio.estadRechazado(bean);	
		ArrayList listasoft = servicio.getSoftwares_Especialista(beann.getLogin());
		request.setAttribute("listasoft", listasoft);	
		ArrayList listanotas1 = servicio.getNotas1(frm.getEstoyEn());
		System.out.println(beann.getLogin());
		System.out.println(frm.getEstoyEn());
		request.setAttribute("login", beann);	
		request.setAttribute("getNotas1", listanotas1);
		return mapping.findForward("apli");	
	}
	public ActionForward re_cam_evaluado(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		UsuarioBean beann = new UsuarioBean();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		bean.setCodSoftware(frm.getCodSoftware());
		beann.setLogin(frm.getLogin());
		servicio.estadRevisado(bean);
		ArrayList listasoft = servicio.getSoftwares_Especialista(beann.getLogin());
		System.out.println(beann.getLogin());
		request.setAttribute("listasoft", listasoft);	
		ArrayList listanotas1 = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas1);
		request.setAttribute("login", beann);
		return mapping.findForward("apli");	
	}
	public ActionForward eval1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GeneralService servicio = new GeneralService();
		UsuarioBean beann = new UsuarioBean();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		bean.setFlageval(frm.getFlageval());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn()+ "waaaaaaaaaaaaaaaaaaaaaa");
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin());
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 2");
		return mapping.findForward("page2");
	}
	
	public ActionForward eval2(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		System.out.println("parte 2");
		GeneralService servicio = new GeneralService();
		UsuarioBean beann = new UsuarioBean();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
	
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn());
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin());
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 3");
		return mapping.findForward("page3");
	}
	
	public ActionForward eval3(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		UsuarioBean beann = new UsuarioBean();
		System.out.println("parte 3");
		GeneralService servicio = new GeneralService();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
	
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn()+ "waaaaaaaaaaaaaaaaaaaaaa44");
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin()+ " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA PASE USERRR");
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 4");
		return mapping.findForward("page4");
	}
	
	public ActionForward eval4(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UsuarioBean beann = new UsuarioBean();
		System.out.println("parte 3");
		GeneralService servicio = new GeneralService();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
	
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn()+ "waaaaaaaaaaaaaaaaaaaaaa555");
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin()+ " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA PASE USERRR");
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 5");
		return mapping.findForward("page5");
	}
	
	public ActionForward eval5(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UsuarioBean beann = new UsuarioBean();
		System.out.println("parte 4");
		GeneralService servicio = new GeneralService();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
	
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn()+ "waaaaaaaaaaaaaaaaaaaaaa666");
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin()+ " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA PASE USERRR");
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 6");
		return mapping.findForward("page6");
	}
	public ActionForward eval6(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UsuarioBean beann = new UsuarioBean();
		System.out.println("parte 5");
		GeneralService servicio = new GeneralService();
		EvaluaBean bean = new EvaluaBean();
		EvaluaForm frm = (EvaluaForm)form;
		beann.setLogin(frm.getLogin());
		bean.setCodSoftware(frm.getCodSoftware());
		bean.setCodPreg1(frm.getCodPreg1());
		bean.setNota1(frm.getNota1());
	
		bean.setCodPreg2(frm.getCodPreg2());
		bean.setNota2(frm.getNota2());
		bean.setCodPreg3(frm.getCodPreg3());
		bean.setNota3(frm.getNota3());
		bean.setCodPreg4(frm.getCodPreg4());
		bean.setNota4(frm.getNota4());
		bean.setCodPreg5(frm.getCodPreg5());
		bean.setNota5(frm.getNota5());
		bean.setCodPreg6(frm.getCodPreg6());
		bean.setNota6(frm.getNota6());
		servicio.EvalSoftware(bean,frm.getFlageval());
		System.out.println(frm.getEstoyEn()+ "waaaaaaaaaaaaaaaaaaaaaa777");
		ArrayList listanotas = servicio.getNotas1(frm.getEstoyEn());
		request.setAttribute("getNotas1", listanotas);
		System.out.println(listanotas);
		request.setAttribute("codSoftware", bean);
		request.setAttribute("login", beann);
		System.out.println(beann.getLogin()+ " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA PASE USERRR");
		System.out.println(bean.getCodSoftware() + " ESTE ES EL COD PASADO 7");
		return mapping.findForward("page7");
	}
	
	
}
