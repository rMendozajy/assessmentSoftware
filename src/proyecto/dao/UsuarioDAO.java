package proyecto.dao;

import java.util.ArrayList;

import proyecto.bean.UsuarioBean;

public interface UsuarioDAO {

	public UsuarioBean LogueoUsuarios(String User, String pwd)throws Exception;	
	
	public void newUsuario(UsuarioBean bean)throws Exception;
	
	public void updUsuario(UsuarioBean bean) throws Exception;
	
	public void delUsuario(int id) throws Exception;
	
	public ArrayList listadousuarios()throws Exception;
}
