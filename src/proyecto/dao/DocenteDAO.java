package proyecto.dao;

import java.util.ArrayList;

public interface DocenteDAO {
	
	public ArrayList listarEstado(String codUsuario,String ActualYear) throws Exception;
	
	public ArrayList listarHistorial(String codUsuario) throws Exception;

}
