package com.pranav.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
 Button btn3;
 EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn3=findViewById(R.id.btn3);
        editText3=findViewById(R.id.edText3);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText3.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity3.this, "Enter a valid Surname !", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    String s;
                    s=editText3.getText().toString().trim();
                    Intent intent=new Intent(Activity3.this,com.pranav.multipleactivities.MainActivity.class);
                    intent.putExtra("surname",s);
                    startActivity(intent);

                }
            }
        });

    }
}
