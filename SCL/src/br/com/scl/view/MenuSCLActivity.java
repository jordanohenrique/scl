package br.com.scl.view;


import sistem2.informatica.sclrotas.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;


public class MenuSCLActivity extends Activity {

	ImageButton btColeta, btSincronizar, btConfigurar, btDescarga;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btColeta = (ImageButton) findViewById(R.id.button1);
        btSincronizar = (ImageButton) findViewById(R.id.button2);
        btConfigurar = (ImageButton) findViewById(R.id.button6);
        btDescarga = (ImageButton) findViewById(R.id.button5);
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scl, menu);
        return true;
    }
    
}
