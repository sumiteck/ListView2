package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listview);
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Ashok");
        myFamily.add("Shama");
        myFamily.add("Chand");
        myFamily.add("Ashok");
        myFamily.add("Shama");
        myFamily.add("Chand");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, myFamily);
        listView.setAdapter(arrayAdapter);
    }
}
