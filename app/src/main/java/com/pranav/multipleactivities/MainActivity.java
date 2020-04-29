package com.pranav.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edText;
    Button btActivity2,btActivity3;
    TextView tvSurname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText=findViewById(R.id.edtext);
        btActivity2=findViewById(R.id.btActivity2);
        btActivity3=findViewById(R.id.btActivity3);
        tvSurname=findViewById(R.id.tvSurname);
        tvSurname.setVisibility(View.INVISIBLE);
        btActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edText.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter a valid Name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String t=edText.getText().toString().trim();

                    Intent intent=new Intent(MainActivity.this,
                            com.pranav.multipleactivities.Activity2.class);

                    intent.putExtra("name",t);
           startActivity(intent);

                }

            }
        });

        btActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inte=new Intent(MainActivity.this,com.pranav.multipleactivities.Activity3.class);
                startActivity(inte);

            }
        });


        String t=getIntent().getStringExtra("surname");
        tvSurname.setText(t);

        tvSurname.setVisibility(View.VISIBLE);
    }
}
