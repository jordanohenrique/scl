package br.com.scl.DA;

public class DADescarga {
	
	private static DADescarga instance;
	
	public static DADescarga getInstance(){
		if(instance != null)
			instance = new DADescarga();
		
		return instance;
	}

}
