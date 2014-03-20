package br.com.scl.DA;

public class DAAmostra {
	
	private static DAAmostra instance;
	
	public static DAAmostra getInstance(){
		if(instance != null)
			instance = new DAAmostra();
		
		return instance;
	}

}
