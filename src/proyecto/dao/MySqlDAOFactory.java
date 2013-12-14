package proyecto.dao;

import proyecto.dao.SqlUsuarioDAO;
import proyecto.dao.UsuarioDAO;

public class MySqlDAOFactory extends DAOFactory{

	
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new SqlUsuarioDAO();
	}

	public ResponsableDAO getResponsableDAO() {
		// TODO Auto-generated method stub
		return new SqlResponsableDAO();
	}

	public EspecialistaDAO getEspecialistaDAO() {
		// TODO Auto-generated method stub
		return new SqlEspecialistaDAO();
	}

	public DocenteDAO getDocenteDAO() {
		// TODO Auto-generated method stub
		return new SqlDocenteDAO();
	}


}
