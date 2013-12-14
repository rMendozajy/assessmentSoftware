package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import proyecto.bean.SoftwareBean;
import proyecto.bean.UsuarioBean;
import proyecto.conexion.DBConnection;

public class SqlDocenteDAO implements DocenteDAO{

	private Connection getConnection(){
		//conectandonos con el gestor de base de datos
			DBConnection conex = new DBConnection();
			
			return conex.getConnection(DBConnection.MYSQL);
	}
	
	public ArrayList listarEstado(String codUsuario,String ActualYear) throws Exception {
		
		//1. Definicion de clases y/o variables
		SoftwareBean bean;
		ArrayList lista = new ArrayList();
		String sql;
		//2. Invoco los objetos de conexion y ejecucion del SQL
		sql="SELECT * FROM software S join software_has_usuario SU on (S.idSoftware = SU.Software_idSoftware) join usuario U on (SU.Docente_C_Usuario = U.C_Usuario) where U.C_Usuario='"+codUsuario+"' AND YEAR(FechaRegSoftware)='"+ActualYear+"' ";
	    Connection con = getConnection();
	    PreparedStatement stm=con.prepareStatement(sql);
		ResultSet rs=stm.executeQuery();
		while (rs.next()){
			bean=new SoftwareBean();
			bean.setNombre(rs.getString(4));
			bean.setTema(rs.getString(6));
			bean.setTipo(rs.getString(7));
			bean.setGrado(rs.getString(8));
			bean.setEstado(rs.getString(10));
			lista.add(bean);			
		}
		
		System.out.println("El DAO lleno la lista");
		System.out.println(lista);		
			
		return lista;
	}

	public ArrayList listarHistorial(String codUsuario) throws Exception {
		
		//1. Definicion de clases y/o variables
		SoftwareBean bean;
		ArrayList lista = new ArrayList();
		String sql;
		//2. Invoco los objetos de conexion y ejecucion del SQL
		sql="SELECT * FROM software S join software_has_usuario SU on (S.idSoftware = SU.Software_idSoftware) join usuario U on (SU.Docente_C_Usuario = U.C_Usuario) where U.C_Usuario='"+codUsuario+"'";
	    Connection con = getConnection();
	    PreparedStatement stm=con.prepareStatement(sql);
		ResultSet rs=stm.executeQuery();
		while (rs.next()){
			bean=new SoftwareBean();
			bean.setNombre(rs.getString(4));
			bean.setTema(rs.getString(6));
			bean.setTipo(rs.getString(7));
			bean.setGrado(rs.getString(8));
			bean.setEstado(rs.getString(10));
			lista.add(bean);			
		}
		
		System.out.println("El DAO lleno la lista");
		System.out.println(lista);		
			
		return lista;
	}
	
	

}
