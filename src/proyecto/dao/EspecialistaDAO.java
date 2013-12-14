package proyecto.dao;

import java.util.ArrayList;

import proyecto.bean.EvaluaBean;


public interface EspecialistaDAO {

	public ArrayList getSoftware(String codEspec) throws Exception;
	public ArrayList getNotas1(String estoyEn) throws Exception;
	public void evaluaItem(EvaluaBean bean, int flag) throws Exception;
	public void insertartrigger(EvaluaBean bean) throws Exception;
	public void cambiarEstEval(EvaluaBean bean) throws Exception;
	public void cambiarEstRecha(EvaluaBean bean) throws Exception;
	public ArrayList listarSoftware(String codEspec) throws Exception;
	
}
