package com.example.hr_mobileservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(v);
            }
        });
    }

    public void nextPage(View myView){

        EditText in1 = (EditText) findViewById(R.id.editText);
        Intent myIntent = new Intent(this,Main2Activity.class);
        myIntent.putExtra("ID",Integer.parseInt(in1.getText().toString()));

        startActivity(myIntent);
    }
}
