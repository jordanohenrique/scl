package br.com.scl.DA;

public class DAProdutor {

	private static DAProdutor instance;
	
	public static DAProdutor getInstance(){
		if(instance != null)
			instance = new DAProdutor();
		
		return instance;
	}
}
