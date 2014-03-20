package br.com.scl.view;

import sistem2.informatica.sclrotas.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class FragmentMenuActivity extends Fragment {
	
	GridView grid;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Teste", "Testando");
   
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onActivityCreated(savedInstanceState);
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
    	View view = inflater.inflate(R.layout.menu_activity, container, false);
    	ImageAdapter adapter = new ImageAdapter(getActivity());
    	grid = (GridView) view.findViewById(R.id.gridView1);
    	grid.setAdapter(adapter);
     	grid.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3) {
				Toast.makeText(getActivity(), ""+ position, Toast.LENGTH_SHORT).show();
				switch (position) {
				case 0:
					Produtores();
					break;					
				
				case 1:
					
					break;
				default:
					break;
				}
				
			}
    		
		});
    	
    	return view;
    }
    
    public void Produtores(){
		Intent intent = new Intent(getActivity(), ProdutoresActivity.class);
		startActivity(intent);
    }
}
