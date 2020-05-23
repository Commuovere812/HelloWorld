package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.listView.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnListView;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnProgressBar;
    private Button mBtnSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView=findViewById(R.id.btn_textView);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton=findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText=findViewById(R.id.btn_editText);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnListView=findViewById(R.id.btn_ListView);
        mBtnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton=findViewById(R.id.btn_radioButton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnCheckBox=findViewById(R.id.btn_checkbox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });
        mBtnProgressBar=findViewById(R.id.btn_progressbar);
        mBtnProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProgressActivity.class);
                startActivity(intent);
            }
        });
        mBtnSpinner=findViewById(R.id.btn_spinner);
        mBtnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}
