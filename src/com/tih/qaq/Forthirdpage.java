package com.tih.qaq;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Forthirdpage extends Fragment{
	private View v;
    public static Forthirdpage newInstance(int index) {
    	Forthirdpage f = new Forthirdpage();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }
 
    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
  // TODO Auto-generated method stub
 super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
 Bundle savedInstanceState) {
 // TODO Auto-generated method stub
 v = inflater.inflate(R.layout.lvqaq, container, false);
 TextView text = (TextView)v.findViewById(R.id.text_view);
 text.setText("Page" + getShownIndex()+"third");
 return v;
    }

}
