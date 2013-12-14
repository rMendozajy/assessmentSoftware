package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import proyecto.bean.SoftwareBean;
import proyecto.bean.UsuarioBean;
import proyecto.conexion.DBConnection;

public class SqlResponsableDAO implements ResponsableDAO {

	private Connection getConnection(){
		//conectandonos con el gestor de base de datos
			DBConnection conex = new DBConnection();
			
			return conex.getConnection(DBConnection.MYSQL);
	}
	
	public void AsignarSoftware(String codSoftware, String codEspecialista) {
		
		Connection conex = null;
		PreparedStatement pstm = null;
		PreparedStatement pstm2 = null;
		ResultSet rs = null;
		String sql1 = "INSERT INTO evaluacion VALUES ('E"+codSoftware+"',0,null)";
		String sql = "UPDATE software SET Especialista_C_Usuario='"+codEspecialista+"', Evaluacion_idEvaluacion='E"+codSoftware+"', EstadoSoftware='Pendiente' WHERE idSoftware='"+codSoftware+"'";
		 
		
		try {
			conex = DBConnection.getConnection(DBConnection.MYSQL);
			pstm2 = conex.prepareStatement(sql1);			
			pstm = conex.prepareStatement(sql);			
			int ex = pstm.executeUpdate();
			if (ex == 1 ){
				pstm2.executeUpdate();
				System.out.println("Se asigno correctamente");
			} else {
				System.out.println("No se puedo asignar");
			}	
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conex);
		}	
		
	}

	public ArrayList getEspecialistas() throws Exception {
		
		ArrayList list = new ArrayList();
		
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		UsuarioBean bean = null;
		
		String sql = "SELECT * FROM usuario WHERE N_TipoUsuario='especialista'";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("entro");
			while (rs.next()){
			 bean = new UsuarioBean();
			 bean.setLogin(rs.getString(1));
			 bean.setNombre(rs.getString(4));
			 bean.setApellido_p((rs.getString(5)));
			 bean.setApellido_m((rs.getString(6)));			 
			 list.add(bean);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}		
		
		return list;
	}

	public ArrayList getSoftware() throws Exception {
		
		ArrayList lista = new ArrayList();
		
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		SoftwareBean bean = null;
		
		String sql = "SELECT * FROM software WHERE Especialista_C_Usuario IS NULL";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("entro");
			while (rs.next()){
			 bean = new SoftwareBean();
			 bean.setCodigo(rs.getString(1));
			 bean.setNombre(rs.getString(4));
			 lista.add(bean);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}		
		
		return lista;
	}

	public ArrayList getDocentes() throws Exception {
		
		ArrayList list = new ArrayList();
		
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		UsuarioBean bean = null;
		
		String sql = "SELECT * FROM usuario WHERE N_TipoUsuario='docente'";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("entro");
			while (rs.next()){
			 bean = new UsuarioBean();
			 bean.setLogin(rs.getString(1));
			 bean.setNombre(rs.getString(4));
			 bean.setApellido_p((rs.getString(5)));
			 bean.setApellido_m((rs.getString(6)));			 
			 list.add(bean);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}		
		
		return list;		
	}
	
	public ArrayList getSoftwares2() throws Exception {
		ArrayList lista = new ArrayList();
		
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		SoftwareBean bean = null;
		
		String sql = "SELECT * FROM software WHERE EstadoSoftware='Registrado'";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("entro");
			while (rs.next()){
			 bean = new SoftwareBean();
			 bean.setCodigo(rs.getString(1));
			 bean.setNombre(rs.getString(4));
			 lista.add(bean);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}		
		
		return lista;
	}
	
	public void AsignaAutorSoftware(String codSoftware, String codAutor) {
		
		Connection conex = null;
		PreparedStatement pstm = null;
		System.out.println(codSoftware);
		ResultSet rs = null;
		String sql = "INSERT INTO software_has_usuario VALUES ('"+codSoftware+"','"+codAutor+"')";				
		
		try {
			conex = DBConnection.getConnection(DBConnection.MYSQL);						
			pstm = conex.prepareStatement(sql);			
			int ex = pstm.executeUpdate();
			if (ex == 1 ){
				System.out.println("Se asigno autor correctamente");
			} else {
				System.out.println("No se puedo asignar");
			}	
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conex);
		}	
		
		
	}

	
	public void RegistrarSoftware(SoftwareBean bean) {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO software VALUES (null,null,null,'"+bean.getNombre()+"','"+bean.getDescripcion()+"','"+bean.getTema()+"','"+bean.getTipo()+"','"+bean.getEducacion()+"','"+bean.getGrado()+"','Registrado','"+bean.getFechaReg()+"')";
		//INSERT INTO software VALUES (null,null,null,'SsytemMate','fdsfsd','Educativo','Educativo',4,null,null)
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);			
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
	
	

}
