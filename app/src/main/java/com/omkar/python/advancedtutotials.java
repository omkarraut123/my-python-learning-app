package com.omkar.python;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class advancedtutotials extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advancedtutotials);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView2=(ListView)findViewById(R.id.activity_listview2);
        listView2.setOnItemClickListener(this);
        String s2[] =new String[]{"Input from user","Functions","Classes and Objects","Modules","Garbage Collection","File IO","Exception handling","Overriding","Operator Overloading","Multithreading",
                "Polymorphism","Enum","Python Database Access","Dealing with imperfection","Python Glossary","String Methods","Recursive Functions"};
        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,s2);
        listView2.setAdapter(arrayAdapter2);



    }

    @Override
    public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {
        String value2=(String)listView2.getItemAtPosition(i);
        Toast.makeText(this,"Clicked "+value2,Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,advanceDataActivity.class);
        intent.putExtra("title",value2);
        startActivity(intent);





    }
}
