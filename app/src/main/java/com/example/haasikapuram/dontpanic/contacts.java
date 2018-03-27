package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class contacts extends AppCompatActivity {
Button b1;
    Button b2;
    Button b3;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("CONTACTS");
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i1=new Intent(contacts.this,NewContactActivity.class);
                startActivity(i1);

            }
        });

        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i2=new Intent(contacts.this,DataListActivity.class);
                startActivity(i2);

            }
        });

        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i3=new Intent(contacts.this,delete.class);
                startActivity(i3);

            }
        });
    }

}
