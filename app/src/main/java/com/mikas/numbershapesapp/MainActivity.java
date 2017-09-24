package com.mikas.numbershapesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void testNumber (View view){

        EditText userNumber = (EditText) findViewById(R.id.userNumber);
        Log.i("userNumber", userNumber.getText().toString());

        Number myNumber = new Number(20);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
