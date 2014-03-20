package br.com.scl.DA;

public class DARota {

	private static DARota instance;
	
	public static DARota getInstance(){
		if(instance != null)
			instance = new DARota();
		
		return instance;
	}
}
