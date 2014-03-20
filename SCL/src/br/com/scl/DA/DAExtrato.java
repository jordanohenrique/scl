package br.com.scl.DA;

public class DAExtrato {

	private static DAExtrato instance;
	
	public static DAExtrato getInstance(){
		if(instance != null)
			instance = new DAExtrato();
		
		return instance;
	}
}
