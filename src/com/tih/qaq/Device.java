package com.tih.qaq;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Device extends Fragment{
    private View v;
    public static Device newInstance(int index) {
    	Device f = new Device();

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
 v = inflater.inflate(R.layout.fragment_main, container, false);
 TextView text = (TextView)v.findViewById(R.id.textView5);
 TextView status = (TextView)v.findViewById(R.id.textView4);
 if(Device_access.access())
	 text.setText("啦啦~已連線");
 else
	 text.setText("QAQ沒連線到");
 if(Device_access.access())
	 status.setText("On");
 else
	 status.setText("Off");
 return v;
    }
    

}
