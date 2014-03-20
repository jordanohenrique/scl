package br.com.scl.DA;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DAConfiguracao {

	private SQLiteDatabase dataBase;
	private Cursor cursor;
	
	private static DAConfiguracao instance;
	
	public static DAConfiguracao getInstance(){
		if(instance != null)
			instance = new DAConfiguracao();
		
		return instance;
	}	
}
