package br.com.scl.view;


import sistem2.informatica.sclrotas.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class FragmentMenuTela2Activity extends Fragment {
	
	private GridView grid;

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
    	View view = inflater.inflate(R.layout.menutela2_activity, container, false);
    	ImageAdapter adapter = new ImageAdapter(getActivity());
    	grid = (GridView) view.findViewById(R.id.gridView);
    	grid.setAdapter(adapter);
    	
    	return view;
    }
    
}
