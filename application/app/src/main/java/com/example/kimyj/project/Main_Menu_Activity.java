package com.example.kimyj.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main_Menu_Activity extends AppCompatActivity {
    Button lectureBtn,gpsBtn,settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu_);
        getSupportActionBar().setTitle("");     //액션바 설정
        lectureBtn=(Button)findViewById(R.id.lectureBtn);
        gpsBtn=(Button)findViewById(R.id.lectureBtn);
        settingBtn=(Button)findViewById(R.id.lectureBtn);
        //강의 버튼 누르면 페이지 이동
        lectureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //GPS버튼 누르면 페이지 이동
        gpsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //설정 버튼 누르면 페이지 이동
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    //액션바 메뉴에 아이템 생성
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list_menu,menu);
        return true;
    }

    // 액션바 아이템 선택 시 녹음 페이지로 이동
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //마이크 아이템 눌렸을때
        if( id == R.id.newPost ){
            Intent intent = new Intent(Main_Menu_Activity.this, STT_Main_Activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
