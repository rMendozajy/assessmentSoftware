package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import proyecto.bean.SoftwareBean;
import proyecto.bean.UsuarioBean;
import proyecto.conexion.DBConnection;

public class SqlUsuarioDAO implements UsuarioDAO{
	
	private Connection getConnection(){
		//conectandonos con el gestor de base de datos
			DBConnection conex = new DBConnection();
			
			return conex.getConnection(DBConnection.MYSQL);
	}

	public UsuarioBean LogueoUsuarios(String login, String pwd) throws Exception {
		
		String sql="select * from usuario where C_Usuario='"+login+"'and N_UsuarioPassword='"+pwd+"'";
		
		Connection conex = getConnection();
		Statement stm = conex.createStatement();
		UsuarioBean bean = null;
		ResultSet rs = stm.executeQuery(sql);		
		while(rs.next()){
			bean = new UsuarioBean();
			bean.setLogin(rs.getString(1));
			bean.setPassword(rs.getString(2));
			bean.setTipoUsuario(rs.getString(3));
			bean.setNombre(rs.getString(4));
			bean.setApellido_p(rs.getString(5));
		}	

		rs.close();
		conex.close();
		return bean;
		}

	
	public void delUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

	
	public void newUsuario(UsuarioBean bean) {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO usuario VALUES (?,?,?,?,?,?,?,?,?,?)";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			pstm.setString(1,bean.getLogin());
			pstm.setString(2,bean.getPassword());
			pstm.setString(3,bean.getTipoUsuario());
			pstm.setString(4,bean.getNombre());
			pstm.setString(5,bean.getApellido_p());
			pstm.setString(6,bean.getApellido_m());
			pstm.setString(7,bean.getDepartamento());
			pstm.setString(8,bean.getProvincia());
			pstm.setString(9,bean.getEmail());
			pstm.setString(10,bean.getFechNac());			
			
			System.out.println(pstm);
			
			int ex = pstm.executeUpdate();
			
			if (ex == 1 ){
				System.out.println("Se registro correctamente");
			} else {
				System.out.println("No se puedo registrar");
			}			
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}
		
		
	}

	public ArrayList listadousuarios() throws Exception {
		
		//1. Definicion de clases y/o variables
		UsuarioBean bean;
		ArrayList lista = new ArrayList();
		String sql;
		//2. Invoco los objetos de conexion y ejecucion del SQL
		sql="select * from usuario";
		Connection con=getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		ResultSet rs=stm.executeQuery();
		while (rs.next()){
			bean=new UsuarioBean();
			bean.setLogin(rs.getString(1));
			bean.setPassword(rs.getString(2));
			bean.setTipoUsuario(rs.getString(3));
			bean.setNombre(rs.getString(4));
			bean.setApellido_p(rs.getString(5));
			bean.setApellido_m(rs.getString(6));			
			lista.add(bean);			
		}
		
		System.out.println("El DAO lleno la lista");
		System.out.println(lista);		
			
		return lista;
	}

	
	public void updUsuario(UsuarioBean bean) {
		// TODO Auto-generated method stub
		
	}

}
