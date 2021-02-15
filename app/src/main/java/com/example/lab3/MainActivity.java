package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button click;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=findViewById(R.id.click);
        name=findViewById(R.id.name);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            i.putExtra("msg1",name.getText().toString());
            startActivity(i);
            }
        });
    }
}