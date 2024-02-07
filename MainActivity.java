package com.jp.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

 Spinner spinner;

 ArrayList<String> arrId=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);

        arrId.add("Select an Id proof");
        arrId.add("Aadhar Card ");
        arrId.add("Pan Card ");
        arrId.add("Ration Card ");
        arrId.add("Voter Card ");
        arrId.add("ATM Card ");
        arrId.add("Aad Card ");

        ArrayAdapter<String> spinner1=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrId);
        spinner.setAdapter(spinner1);




    }
}



