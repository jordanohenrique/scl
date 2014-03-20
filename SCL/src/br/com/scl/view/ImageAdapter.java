package br.com.scl.view;

import sistem2.informatica.sclrotas.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{

	
	private Context mContext;
	 private Integer[] mThumbIds = {
	     R.drawable.user, R.drawable.coleta, R.drawable.edit,
	     R.drawable.home,R.drawable.file, R.drawable.date,
	     R.drawable.world, R.drawable.stop, R.drawable.home,
	     R.drawable.world, R.drawable.stop, R.drawable.home}; 
	
	 public ImageAdapter(Context c){
		 mContext = c;
	 }
	 
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mThumbIds[position];
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
	     
		if (convertView == null) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
			imageView.setAdjustViewBounds(false);
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			//imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}
    imageView.setImageResource(mThumbIds[position]);
    return imageView;
	}
	

}
