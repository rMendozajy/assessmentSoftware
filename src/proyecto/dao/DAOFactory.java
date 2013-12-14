package proyecto.dao;

public abstract class DAOFactory {
	
	public static final int Mysql = 1;
	public static final int Oracle = 2;
	
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract ResponsableDAO getResponsableDAO();
	public abstract EspecialistaDAO getEspecialistaDAO();
	public abstract DocenteDAO getDocenteDAO();

	
	public static DAOFactory getDAOFactory(int whichFactory){
		
		switch (whichFactory){
		case Mysql: return new MySqlDAOFactory();
		default: return null;		
		}
	}
	

}
