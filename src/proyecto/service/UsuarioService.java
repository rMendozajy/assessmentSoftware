package proyecto.service;

import proyecto.bean.UsuarioBean;
import proyecto.dao.DAOFactory;
import proyecto.dao.UsuarioDAO;

public class UsuarioService {

	DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	UsuarioDAO dao=fabrica.getUsuarioDAO();
	
	public void newUsuario(UsuarioBean bean) throws Exception{
		dao.newUsuario(bean);
	}
}
