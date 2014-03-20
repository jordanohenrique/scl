package br.com.scl.DA;

public class DAArmazenamento {
	
	private static DAArmazenamento instance;
	
	public static DAArmazenamento getInstance(){
		if(instance != null)
			instance = new DAArmazenamento();
		
		return instance;
	}

}
