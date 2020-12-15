package com.example.test1_;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView id_lv;
    List<people> list;
    PeopleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        list.add(new people("田渤龙",19));
        list.add(new people("张洪福",19));
        id_lv.setAdapter(adapter);
    }

    private void initView() {
        id_lv = (ListView) findViewById(R.id.id_lv);
        list=new ArrayList<>();
        adapter=new PeopleAdapter(list,this);
    }
}