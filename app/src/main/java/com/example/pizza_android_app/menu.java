package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class menu extends AppCompatActivity {
ListView list;
Spinner spin;
String data[]={"Fride Rice","Veg manchurian","Paneer","Aussie Barbecue Veg","Tandoori Roti","Allu Paratha","Paneer Makhani","Sweets","COld Drink","coofee"};
String data1[]={"Amit","Varun","Happy","Shivani","Sohan","Raman","kiran","Xyz","ABC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        list=(ListView)findViewById(R.id.listview);

        ArrayAdapter adapter= new ArrayAdapter(menu.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter1=new ArrayAdapter(menu.this, android.R.layout.simple_list_item_1,data1);
        spin.setAdapter(adapter);

    }
}
