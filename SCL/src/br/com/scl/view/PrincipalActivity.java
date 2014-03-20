package br.com.scl.view;

import sistem2.informatica.sclrotas.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PrincipalActivity extends Activity {

	ImageButton btLogar, btCancelar;
	EditText edLogin, edSenha;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        
        edLogin =(EditText)findViewById(R.id.edLogin);
        edSenha =(EditText)findViewById(R.id.edSenha);
        
        btLogar = (ImageButton)findViewById(R.id.btLogar);
        btCancelar =(ImageButton)findViewById(R.id.btsair);
        
        btLogar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Menu();
			}
		});
        
        btCancelar.setOnLongClickListener(new OnLongClickListener() {
			
			public boolean onLongClick(View v) {
				onDestroy();
				return false;
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    public void Menu(){
    
    	if(edSenha.getText().toString().equals("admin")){
    		edSenha.setText("");
    		Intent intent = new Intent(this, MenuSCLActivity.class);
    		startActivity(intent);
    	}
    	else{
    		Toast.makeText(getApplicationContext(), "Senha Incorreta!", Toast.LENGTH_SHORT).show();
    		edSenha.setText("");
    	}
    }
    
}
