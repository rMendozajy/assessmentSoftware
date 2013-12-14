package proyecto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.beanutils.Converter;
import org.apache.taglibs.standard.tag.common.xml.ParseSupport;

import proyecto.bean.EvaluaBean;
import proyecto.bean.SoftwareBean;
import proyecto.bean.TemporalNotasBean;
import proyecto.bean.UsuarioBean;
import proyecto.conexion.DBConnection;

public class SqlEspecialistaDAO implements EspecialistaDAO{
	
	public ArrayList getNotas1 (String estoyEn) throws  Exception{
		
		ArrayList lista = new ArrayList();
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TemporalNotasBean bean = null;
		String sql = "select Puntaje, TipoPuntaje from puntaje where Item_idItem = '"+estoyEn+"'";
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("entro");
			while (rs.next()){
			 bean = new TemporalNotasBean();
			 bean.setPuntaje(Double.parseDouble(rs.getString(1)));
			 bean.setNpuntaje(rs.getString(2));
			 lista.add(bean);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}	
		rs.close();
		return lista;	
		
	}
	
	public ArrayList getSoftware(String codEspec) throws Exception {
		
		ArrayList lista = new ArrayList();
		System.out.println(codEspec);
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		SoftwareBean bean = null;
		
		String sql = "SELECT * FROM software WHERE Especialista_C_Usuario='"+codEspec+"' AND EstadoSoftware='Pendiente'";
		
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
		rs.close();
		return lista;
	}

	public void evaluaItem(EvaluaBean bean, int flager) throws Exception {
		String fecha;
		Calendar dd= GregorianCalendar.getInstance();
		int dia = dd.get(Calendar.DAY_OF_MONTH);
		int mes = dd.get(Calendar.MONTH)+1;
		System.out.println(mes);
		int anio = dd.get(Calendar.YEAR);
		if(dia >= 10)
		 fecha = anio+""+"0"+mes+""+dia;
		else
		 fecha = anio+""+"0"+mes+""+"0"+dia;	
		System.out.println(fecha);
		Connection conex = null;
		ResultSet rs= null;	
		System.out.println(bean.getCodSoftware());
		String sql = "SELECT Evaluacion_idEvaluacion FROM software WHERE idSoftware='"+bean.getCodSoftware()+"'";	
		try {
			conex = DBConnection.getConnection(DBConnection.MYSQL);					
			PreparedStatement pstm = conex.prepareStatement(sql);	
			rs = pstm.executeQuery();			
			
			while(rs.next()){
				if(flager!=0){
				String sqlsaso = "UPDATE evaluacion SET FechaRegEvaluacion='"+fecha+"' WHERE idEvaluacion='"+rs.getString(1)+"'";
				
				PreparedStatement pstm111 = conex.prepareStatement(sqlsaso);
				pstm111.executeUpdate();
				}
				if(bean.getCodPreg1()!=null){
					String sql1 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg1()+"','"+rs.getString(1)+"','"+bean.getNota1()+"')";
					PreparedStatement pstm1 = conex.prepareStatement(sql1);
					pstm1.executeUpdate();
				}
				if(bean.getCodPreg2()!=null){
					String sql2 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg2()+"','"+rs.getString(1)+"','"+bean.getNota2()+"')";
					PreparedStatement pstm2 = conex.prepareStatement(sql2);
					pstm2.executeUpdate();
				}
				if(bean.getCodPreg3()!=null){
					String sql3 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg3()+"','"+rs.getString(1)+"','"+bean.getNota3()+"')";
					PreparedStatement pstm3 = conex.prepareStatement(sql3);
					pstm3.executeUpdate();
				}
				if(bean.getCodPreg4()!=null){
					String sql4 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg4()+"','"+rs.getString(1)+"','"+bean.getNota4()+"')";
					PreparedStatement pstm4 = conex.prepareStatement(sql4);
					pstm4.executeUpdate();
				}
				if(bean.getCodPreg5()!=null){
					String sql5 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg5()+"','"+rs.getString(1)+"','"+bean.getNota5()+"')";
					PreparedStatement pstm5 = conex.prepareStatement(sql5);
					pstm5.executeUpdate();
				}
				if(bean.getCodPreg6()!=null){
					String sql6 = "INSERT INTO pregunta_has_evaluacion VALUES('"+bean.getCodPreg6()+"','"+rs.getString(1)+"','"+bean.getNota6()+"')";
					PreparedStatement pstm6 = conex.prepareStatement(sql6);		
					pstm6.executeUpdate();
				}
			}
			System.out.println("paso eval");
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conex);
		}	
		
	}

	
	public void insertartrigger(EvaluaBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	public void cambiarEstEval(EvaluaBean bean) throws Exception {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	
		String sql = "UPDATE software S JOIN evaluacion E on (S.Evaluacion_idEvaluacion=E.idEvaluacion) SET EstadoSoftware='Aprobado' WHERE S.idSoftware='"+bean.getCodSoftware()+"' AND E.NotaDeEvaluacion>70 ";	
		String sql2="UPDATE software SET EstadoSoftware='Desaprobado' WHERE idSoftware='"+bean.getCodSoftware()+"'";
		
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			System.out.println(pstm);
			int ex = pstm.executeUpdate();
			if (ex == 1 ){
				System.out.println("El software esta aprobado");
			} else {
				PreparedStatement pstm2 = cnx.prepareStatement(sql2);
				pstm2.executeUpdate();
				System.out.println("software desaprobado");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}	
	}

	public void cambiarEstRecha(EvaluaBean bean) throws Exception {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	
		String sql = "UPDATE software SET EstadoSoftware='Rechazado' WHERE idSoftware='"+bean.getCodSoftware()+"'";	
		try {
			cnx = DBConnection.getConnection(DBConnection.MYSQL);
			pstm = cnx.prepareStatement(sql);
			System.out.println(pstm);
			int ex = pstm.executeUpdate();
			if (ex == 1 ){
				System.out.println("Se actualizo correctamente");
			} else {
				System.out.println("No se puedo actualizar");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeStatement(pstm);
			DBConnection.closeConnection(cnx);
		}	
		
	}

	public ArrayList listarSoftware(String codEspec) throws Exception {
		
		//1. Definicion de clases y/o variables
		EvaluaBean bean;
		ArrayList lista = new ArrayList();
		Connection cnx = null;
		String sql;
		String sql2;
		//2. Invoco los objetos de conexion y ejecucion del SQL
		sql="SELECT S.Nombre_Software,S.Tema,S.TipoSoftware,DATE(S.FechaRegSoftware),E.NotaDeEvaluacion,S.EstadoSoftware " +
				"FROM evaluacion E join software S on(E.idEvaluacion=S.Evaluacion_idEvaluacion) JOIN usuario U on (S.Especialista_C_Usuario=U.C_Usuario) WHERE S.Especialista_C_Usuario='"+codEspec+"'";
		cnx = DBConnection.getConnection(DBConnection.MYSQL);
		PreparedStatement stm=cnx.prepareStatement(sql);
		ResultSet rs=stm.executeQuery();
				
		while (rs.next()){
			bean=new EvaluaBean();
			bean.setLogin(rs.getString(1));	
			bean.setCodPreg1(rs.getString(2));
			bean.setCodPreg2(rs.getString(3));
			bean.setCodPreg3(rs.getString(4));
			bean.setCodPreg4(rs.getString(5));
			bean.setCodPreg5(rs.getString(6));
			lista.add(bean);			
		}
		
		System.out.println("El DAO lleno la lista");
		System.out.println(lista);		
			
		return lista;
	}
	

}
