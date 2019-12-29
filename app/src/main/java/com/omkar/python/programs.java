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

public class programs extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView3;
    String file;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView3=(ListView)findViewById(R.id.program_listview);
        listView3.setOnItemClickListener(this);
        String s3[] =new String[]{"Find the Area of Rectangle Using Classes","Swap Two number without using a Temporary variable","Reverse a Given Number",
                "Check whether given number is positive or nigative","Calculate Average of Numbers in a Given List","Print Odd Numbers Within a Given Range",
                "Read Two Numbers and Print Their Quotient and Remainder","Find Sum of Digits in a Number","Find Smallest Divisor of an Integer"
        ,"Count the Number of Digits in a Number","Check if a Number is a Palindrome","Print all Integer that are not Divisible by Either 2 or 3 and Lie between 1 and 50"
        ,"Read a Number n and Print the Series 1+2+....+n=","Read a Number n and Print the Natural Numbers Summation Pattern","Program to Print Identity Matrix",
       "Check Whether a Given Year is a Leap Year" };
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,s3);
        listView3.setAdapter(arrayAdapter);

    }

    @Override
    public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {

        String value3= (String)listView3.getItemAtPosition(i);

switch (value3){

    case "Find the Area of Rectangle Using Classes" :
        file="rect";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
             break;
    case "Swap Two number without using a Temporary variable":
       file="swap";
            intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Reverse a Given Number":
        file="reverse";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Check whether given number is positive or nigative":
        file="PorN";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Calculate Average of Numbers in a Given List":
         file="7";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;

    case "Print Odd Numbers Within a Given Range":
        file="11";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Read Two Numbers and Print Their Quotient and Remainder":
        file="9";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;

    case "Find Sum of Digits in a Number":
        file="12";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Find Smallest Divisor of an Integer":
        file="13";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Count the Number of Digits in a Number":
        file="14";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Check if a Number is a Palindrome":
        file="15";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Print all Integer that are not Divisible by Either 2 or 3 and Lie between 1 and 50":
        file="16";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;

    case "Read a Number n and Print the Series 1+2+....+n=":
        file="17";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Read a Number n and Print the Natural Numbers Summation Pattern":
        file="18";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Program to Print Identity Matrix":
        file="19";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;
    case "Check Whether a Given Year is a Leap Year":
        file="24";
        intent=new Intent(this,pragramDataActivity.class);
        intent.putExtra("title",file);
        startActivity(intent);
        break;


}


    }
}
