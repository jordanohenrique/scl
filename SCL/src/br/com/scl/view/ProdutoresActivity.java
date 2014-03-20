package br.com.scl.view;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.scl.PO.POProdutor;
import br.com.scl.conexao.Conexao;
import sistem2.informatica.sclrotas.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProdutoresActivity extends Activity {

    String guidString;
    String sql;
    List<POProdutor> listProdutores = new ArrayList<POProdutor>();
	POProdutor FPOProdutores;
	ContentValues values = new ContentValues();
	SQLiteDatabase database;
	Cursor cursor;
	
	EditText edtNome, edtCpf, edtIE, edtLogradouro,edtNumero, edtBairro, edtCidade,
			 edtUF, edtCep, edtFone, edtCelular, edtCodigo;
	Button btnSalvar, btnPesquisar;	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtores);
        
        ComponentesTela();
        
        database = Conexao.getInstance(getApplicationContext()).getWritableDatabase();
        
        btnSalvar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				SetaInstanciaControles();
			}
		});
        
        btnPesquisar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				SetaControleInstancia();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.produtores, menu);
        return true;
    }
    
    public void SetaInstanciaControles(){
    	
    	try {
			
        	database.isOpen();
        	values.put("ProCodigo", edtCodigo.getText().toString());
        	values.put("ProNome", edtNome.getText().toString());
        	values.put("ProCpf", edtCpf.getText().toString());
        	values.put("ProInsEstadual", edtIE.getText().toString());
        	values.put("ProLogradouro", edtLogradouro.getText().toString());
        	values.put("ProNumero", edtNumero.getText().toString());
        	values.put("ProBairro", edtBairro.getText().toString());
        	values.put("ProCidade", edtCidade.getText().toString());
        	values.put("ProUF", edtUF.getText().toString());
        	values.put("ProCEP", edtCep.getText().toString());
        	values.put("ProCelular", edtFone.getText().toString());
        	values.put("ProTelefone", edtCelular.getText().toString());
        	values.put("ProGUID", GUID());
        	
        	database.insert("Produtores", null, values);
        	database.close();
        	Toast.makeText(getApplicationContext(), "Dados gravados com sucesso!", Toast.LENGTH_SHORT).show();
        	
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "Erro ao gravar dados!", Toast.LENGTH_SHORT).show();
		}

    }
    
    public Cursor ExecutaSql(String sql)
    {
    	database.isOpen();
    	
    	cursor = database.rawQuery(sql, null);
    		
    	return cursor;
    }

    public void SetaControleInstancia(){
    	
    	if(edtCodigo.getText().toString().trim().length() > 0){
    		sql = "SELECT * from Produtores where ProId = "+Integer.parseInt(edtCodigo.getText().toString());
    		ExecutaSql(sql);
    		if(cursor.moveToFirst()){

    			edtCodigo.setText(cursor.getString(cursor.getColumnIndex("ProCodigo")).toString());
    			edtNome.setText(cursor.getString(cursor.getColumnIndex("ProNome")).toString());
    			edtCpf.setText(cursor.getString(cursor.getColumnIndex("ProCpf")).toString());
    			edtIE.setText(cursor.getString(cursor.getColumnIndex("ProInsEstadual")).toString());
    			edtLogradouro.setText(cursor.getString(cursor.getColumnIndex("ProLogradouro")).toString());
    			edtNumero.setText(cursor.getString(cursor.getColumnIndex("ProNumero")).toString());
    			edtBairro.setText(cursor.getString(cursor.getColumnIndex("ProBairro")).toString());
    			edtCidade.setText(cursor.getString(cursor.getColumnIndex("ProCidade")).toString());
    			edtUF.setText(cursor.getString(cursor.getColumnIndex("ProUF")).toString());
    			edtCep.setText(cursor.getString(cursor.getColumnIndex("ProCEP")).toString());
    			edtCelular.setText(cursor.getString(cursor.getColumnIndex("ProCelular")).toString());
    			edtFone.setText(cursor.getString(cursor.getColumnIndex("ProTelefone")).toString());
    		}
    		else{
    			Toast.makeText(getApplicationContext(), "Valores não encontrados!", Toast.LENGTH_SHORT).show();
    		}
    	}
    	else{
    		Toast.makeText(getApplicationContext(), "Valores estão nulos!", Toast.LENGTH_SHORT).show();
    	}
    }

    public void ComponentesTela(){
    	
    	//ProdutoresActivity
    	edtCodigo = (EditText)findViewById(R.id.edtCodigo);
    	edtNome = (EditText)findViewById(R.id.edtNome);
    	edtCpf = (EditText)findViewById(R.id.edtCPF);
    	edtIE = (EditText)findViewById(R.id.edtInsEstadual);
    	edtLogradouro = (EditText)findViewById(R.id.edtLogradouro);
    	edtNumero = (EditText)findViewById(R.id.edtNumero);
    	edtBairro = (EditText)findViewById(R.id.edtBairro);
    	edtCidade = (EditText)findViewById(R.id.edtCidade);
    	edtUF = (EditText)findViewById(R.id.edtUf);
    	edtCep = (EditText)findViewById(R.id.edtCep);
    	edtFone = (EditText)findViewById(R.id.edtFone);
    	edtCelular = (EditText)findViewById(R.id.edtCelular);
    	
    	btnSalvar = (Button)findViewById(R.id.btnSalvar);
    	btnPesquisar = (Button)findViewById(R.id.btnPesquisar);
    	
    }
    
    private String GUID(){
    UUID guid = UUID.randomUUID();
    guidString = guid.toString().replaceAll("-","");
    
    return guidString;
    }
}
