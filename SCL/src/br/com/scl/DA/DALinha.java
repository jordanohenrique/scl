package br.com.scl.DA;

public class DALinha {

	private static DALinha instance;
	
	public static DALinha getInstance(){
		if(instance != null)
			instance = new DALinha();
		
		return instance;
	}
}
