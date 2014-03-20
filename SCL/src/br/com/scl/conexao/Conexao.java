package br.com.scl.conexao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Conexao extends SQLiteOpenHelper{
	
	final static String Banco = "SCLRotas.db";
	
	public static Conexao instance;
	public static Conexao getInstance(Context ctx){
		if (instance == null){
			instance = new Conexao(ctx);
		}
		return instance;
	}	
	
	public Conexao(Context contexto)
	{
		super(contexto, Banco, null, 1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	
		
	}
	
	public SQLiteDatabase getDataBase(){
		
		return this.getWritableDatabase();
	}
}


