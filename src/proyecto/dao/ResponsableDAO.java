package proyecto.dao;

import java.util.ArrayList;

import proyecto.bean.SoftwareBean;

public interface ResponsableDAO {
	
	public ArrayList getEspecialistas() throws Exception;
	
	public ArrayList getSoftware() throws Exception; 
	
	public ArrayList getSoftwares2() throws Exception;
	
	public ArrayList getDocentes() throws Exception;
	
	public void AsignarSoftware(String codSoftware,String codEspecialista);
	
	public void AsignaAutorSoftware(String codSoftware, String codAutor);
	
	public void RegistrarSoftware(SoftwareBean bean);
	

}
