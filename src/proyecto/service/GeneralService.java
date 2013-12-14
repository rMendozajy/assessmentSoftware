package proyecto.service;

import java.util.ArrayList;

import proyecto.bean.EvaluaBean;
import proyecto.bean.SoftwareBean;
import proyecto.dao.DAOFactory;
import proyecto.dao.EspecialistaDAO;
import proyecto.dao.DocenteDAO;
import proyecto.dao.ResponsableDAO;
import proyecto.dao.UsuarioDAO;

public class GeneralService {
	
	DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	ResponsableDAO daoR=fabrica.getResponsableDAO();
	EspecialistaDAO daoE=fabrica.getEspecialistaDAO();
	UsuarioDAO daoU=fabrica.getUsuarioDAO();
	DocenteDAO daoD = fabrica.getDocenteDAO();
	
	public ArrayList getEspecialistas() throws Exception{
		
		ArrayList list = daoR.getEspecialistas();
		
		return list;
	}
	
	public ArrayList getDocentes() throws Exception{
		
		ArrayList list = daoR.getDocentes();
		
		return list;
	}
	
	public ArrayList getSoftwares() throws Exception{
	
		ArrayList lista = daoR.getSoftware();
		
		return lista;
	}
	
	public ArrayList getSoftwares2() throws Exception{
		
		ArrayList lista = daoR.getSoftwares2();
		
		return lista;
	}
	
	public void AsignaSoftware(String codSoft,String codEspec){
		
		daoR.AsignarSoftware(codSoft, codEspec);
	}
	
	public void AsignaAutorSoftware(String codSoft,String codAutor){
		
		daoR.AsignaAutorSoftware(codSoft, codAutor);
	}
	
	public ArrayList getSoftwares_Especialista(String codEspec) throws Exception{
		ArrayList lista = daoE.getSoftware(codEspec);
		return lista;
	}
	public ArrayList getNotas1(String estoyEn) throws Exception{
		ArrayList lista = daoE.getNotas1(estoyEn);
		return lista;
	}
    public void EvalSoftware(EvaluaBean bean, int flag) throws Exception{
		
		daoE.evaluaItem(bean,flag);
	}
	public void estadRechazado(EvaluaBean bean) throws Exception{
		
		daoE.cambiarEstRecha(bean);
	}
	public void estadRevisado(EvaluaBean bean) throws Exception{
		
		daoE.cambiarEstEval(bean);
	}	

	public void RegSoft(SoftwareBean soft) throws Exception{
		
		daoR.RegistrarSoftware(soft);
	}
	
	public ArrayList listarUser()throws Exception{
		
		return daoU.listadousuarios();		
		
	}
	public ArrayList listarEstado(String codUsuario,String ActualYear) throws Exception
	{
		ArrayList lista = daoD.listarEstado(codUsuario,ActualYear);
		return lista;
		
	}
	
	public ArrayList Historial(String codUsuario) throws Exception
	{
		ArrayList lista = daoD.listarHistorial(codUsuario);
		return lista;
		
	}
	
	public ArrayList listarSoftware(String codEspec) throws Exception
	{
		ArrayList lista = daoE.listarSoftware(codEspec);
		return lista;
	}

}
