package proyecto.struts.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LanguageAction extends Action{

   
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	
	HttpSession sesion=request.getSession(true);
	String opcion=request.getParameter("opcion");
	sesion.setAttribute(Globals.LOCALE_KEY, new Locale(opcion)); 
	return mapping.findForward("test1");
}	  
}
