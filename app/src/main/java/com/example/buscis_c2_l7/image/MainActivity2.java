package com.example.buscis_c2_l7.image;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public TextView welcomeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.ex_message);

       // welcomeText = (TextView) findViewById(R.id.welcomeText);
        TextView welcome = (TextView) findViewById(R.id.welcomeText);

        welcome.setText(message);


    }
}
