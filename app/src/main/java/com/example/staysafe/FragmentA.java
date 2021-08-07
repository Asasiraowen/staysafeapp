package com.example.staysafe;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class FragmentA extends HereVaccinatedPeople {
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Owen", "Xerxes", "Hillary", "Fred", "Patie", "Sumayiya", "Wills"};

   public FragmentA(){
    //wsedrftgyhujiklkjhg
   }
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        lv=view.findViewById(R.id.idListview);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        return view;
    }
}
