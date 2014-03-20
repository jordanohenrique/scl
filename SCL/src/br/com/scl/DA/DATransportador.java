package br.com.scl.DA;

public class DATransportador {
	
	private static DATransportador instance;
	
	public static DATransportador getInstance(){
		if(instance != null)
			instance = new DATransportador();
		
		return instance;
	}

}
