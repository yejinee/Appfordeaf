package com.example.kimyj.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Project_middle extends AppCompatActivity {
    EditText idText, passwordText;
    Button loginButton;
    TextView move_registerPage, move_findIDPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_middl);
        idText = (EditText) findViewById(R.id.idText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        loginButton = (Button) findViewById(R.id.loginButton);
        move_registerPage = (TextView) findViewById(R.id.move_registerPage);
        move_findIDPage = (TextView) findViewById(R.id.move_findIDPage);
        //LOGIN하면 메인메뉴페이지 이동
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Project_middle.this, Main_Menu_Activity.class);
                startActivity(intent);
            }
        });
        //회원가입 버튼 선택시 회원가입 페이지로 이동
        move_registerPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Project_middle.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        //ID,Password 찾기 페이지로 이동
        move_findIDPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });



    }
}
