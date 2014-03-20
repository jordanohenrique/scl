package br.com.scl.DA;

public class DAExame {

	private static DAExame instance;
	
	public static DAExame getInstance(){
		if(instance != null)
			instance = new DAExame();
		
		return instance;
	}
}
