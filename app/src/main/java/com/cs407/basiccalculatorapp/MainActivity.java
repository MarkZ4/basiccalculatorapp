package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void add(View view){
        EditText int1 = (EditText) findViewById(R.id.editTextText2);
        EditText int2 = (EditText) findViewById(R.id.editTextText);
        Integer a = Integer.parseInt(int1.getText().toString()) + Integer.parseInt(int2.getText().toString());
        goToActivity(a.toString());
    }
    public void sub(View view){
        EditText int1 = (EditText) findViewById(R.id.editTextText2);
        EditText int2 = (EditText) findViewById(R.id.editTextText);
        Integer a = Integer.parseInt(int1.getText().toString()) - Integer.parseInt(int2.getText().toString());
        goToActivity(a.toString());
    }
    public void multi(View view){
        EditText int1 = (EditText) findViewById(R.id.editTextText2);
        EditText int2 = (EditText) findViewById(R.id.editTextText);
        Integer a = Integer.parseInt(int1.getText().toString()) * Integer.parseInt(int2.getText().toString());
        goToActivity(a.toString());
    }
    public void div(View view){
        EditText int1 = (EditText) findViewById(R.id.editTextText2);
        EditText int2 = (EditText) findViewById(R.id.editTextText);
        if (Integer.parseInt(int2.getText().toString())==0) {
            goToActivity("Error, cannot divide by 0");
        }
        Integer a = Integer.parseInt(int1.getText().toString()) / Integer.parseInt(int2.getText().toString());
        goToActivity(a.toString());
    }
    public void goToActivity(String i) {
        Intent intent = new Intent(this, result.class);
        intent.putExtra("message", i);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}