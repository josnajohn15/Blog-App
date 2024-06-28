package com.example.blog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Delete extends AppCompatActivity {
    EditText ed1,ed3;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete);
        ed1=(EditText) findViewById(R.id.bname);
        ed3=(EditText) findViewById(R.id.aname);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.back);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String getOwner=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getOwner,Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Info.class);
                startActivity(i);
            }
        });

    }
}
