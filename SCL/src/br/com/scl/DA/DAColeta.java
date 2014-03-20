package br.com.scl.DA;

public class DAColeta {

	private static DAColeta instance;
	
	public static DAColeta getInstance(){
		if(instance != null)
			instance = new DAColeta();
		
		return instance;
	}
}
