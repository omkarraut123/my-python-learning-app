package com.omkar.python;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Datastructure extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure);

        listView4=(ListView)findViewById(R.id.data_structure);
        listView4.setOnItemClickListener(this);
        String str[] =new String[]{"Introduction to Trees","Trees Terminology","List Representation of Trees","Nodes and Refernces","Tree Traversal","Introduction to Graphs","Graphs Terminology",
                "The Graph Abstract Data Type","Graph Adjacency Matrix","Graph Adjacency List"};
        ArrayAdapter<String> arrayAdapter4=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,str);
        listView4.setAdapter(arrayAdapter4);


    }

    @Override
    public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {

        String string=(String)listView4.getItemAtPosition(i);
       // Toast.makeText(this,"Clicked "+string,Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,datastructure1.class);
        intent.putExtra("title",string);
        startActivity(intent);

    }
}
