package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private ImageButton mBtn4;
    private ImageButton mBtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mBtn3=findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"I was clicked!",Toast.LENGTH_LONG).show();
            }
        });
        mBtn4=findViewById(R.id.imageButton1);
        mBtn4.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"I am ImageButton1-foreground!",Toast.LENGTH_LONG).show();
            }
        });
        mBtn5=findViewById(R.id.imageButton2);
        mBtn5.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"I am ImageButton2-background!",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"I am here!",Toast.LENGTH_SHORT).show();
    }
}
