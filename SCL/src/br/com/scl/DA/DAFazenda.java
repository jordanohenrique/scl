package br.com.scl.DA;

public class DAFazenda {
	
	private static DAFazenda instance;
	
	public static DAFazenda getInstance(){
		if(instance != null)
			instance = new DAFazenda();
		
		return instance;
	}

}
