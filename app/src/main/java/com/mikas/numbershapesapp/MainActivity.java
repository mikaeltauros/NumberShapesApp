package com.mikas.numbershapesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void testNumber (View view){

        String message = "";
        EditText userNumber = (EditText) findViewById(R.id.userNumber);

        Log.i("UserNumber", userNumber.getText().toString());

        try {
            NumberCheck myNumber = new NumberCheck(Integer.parseInt(userNumber.getText().toString()));

            if (myNumber.isSquare() && myNumber.isTriangular()){
                message = myNumber.getNumber() + "is both Triangular and Square!";
            }else if (myNumber.isSquare()){
                message = myNumber.getNumber() + "is Square, but not Triangle!";
            }else if (myNumber.isTriangular()){
                message = myNumber.getNumber() + "is Triangle, but not Square!";
            }else{
                message = myNumber.getNumber() + "is neither Square nor Triangle!";
            }

        }catch (NumberFormatException e){
            message = "Please enter a number!";
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
