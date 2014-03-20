package br.com.scl.DA;

public class DAViagem {

	private static DAViagem instance;
	
	public static DAViagem getInstance(){
		if(instance != null)
			instance = new DAViagem();
		
		return instance;
	}
}
