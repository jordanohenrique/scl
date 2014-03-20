package br.com.scl.DA;

public class DAAnalise {

	private static DAAnalise instance;
	
	public static DAAnalise getInstance(){
		if(instance != null)
			instance = new DAAnalise();
		
		return instance;
	}
}
