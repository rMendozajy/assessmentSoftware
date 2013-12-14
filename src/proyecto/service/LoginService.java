package proyecto.service;

import proyecto.bean.UsuarioBean;
import proyecto.dao.DAOFactory;
import proyecto.dao.UsuarioDAO;

public class LoginService {
	
	DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	UsuarioDAO dao=fabrica.getUsuarioDAO();
	
	public UsuarioBean LogueoUser(String login,String pwd) throws Exception
	{
		UsuarioBean bean = dao.LogueoUsuarios(login, pwd);
		return bean;
	}
}
