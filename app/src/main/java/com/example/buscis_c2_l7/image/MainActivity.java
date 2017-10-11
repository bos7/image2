package com.example.buscis_c2_l7.image;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity
implements OnClickListener{

    private EditText userInput;
    private EditText passInput;
    private TextView userText;
    private TextView passtext;
    private TextView message;


    private Button logButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.userInput);
        passInput = (EditText) findViewById(R.id.passInput);
        userText = (TextView) findViewById(R.id.userText);
        passtext = (TextView) findViewById(R.id.passtext);
        message = (TextView) findViewById(R.id.message);

        logButton = (Button) findViewById(R.id.logButton);
        logButton.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText et = (EditText) findViewById(R.id.passInput);
        String password = et.getText().toString();
        TextView me = (TextView) findViewById(R.id.message);



        et.getEditableText().toString();
        if (password.equals("password")) {
          me.setText("Right!");


        }else{
            me.setText("Wrong!");

        }
    }


}
