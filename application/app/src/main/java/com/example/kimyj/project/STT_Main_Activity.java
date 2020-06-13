package com.example.kimyj.project;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class STT_Main_Activity extends AppCompatActivity {
    TextView speech_out_text;  //녹음하고 띄워주는 창
    Button finish_speech_button,start_speech_button,stop_speech_button;
    //정지, 녹음시작, 일시정지 버튼
    String speech_text; //녹음한 내용 저장될 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stt__main_);
        speech_out_text=(TextView)findViewById(R.id.speech_out_text);
        finish_speech_button=(Button)findViewById(R.id.finish_speech_button);
        start_speech_button=(Button)findViewById(R.id.start_speech_button);
        stop_speech_button=(Button)findViewById(R.id.stop_speech_button);
        //정지버튼을 눌렀을 때 강의 내용 저장할것인지 알림 대화상자 띄움
        //중간발표: 정지버튼 눌렀을 때 강의 출력할 것 인지
        finish_speech_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog=createDialog(); //알림대화상자 생성
                dialog.show();
            }
        });
        //시작버튼 눌렀을 때 음성인식 시작
        start_speech_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //일시정지 버튼 눌렀을 시 음성인식 일시 정지
        stop_speech_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    //정지- 알림 대화상자 창 내용
    private  AlertDialog createDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
       // builder.setTitle("강의 내용 띄우기");
        builder.setMessage(" 강의 내용을 화면에 띄우시겠습니까?");
        //녹음 내용 저장할것인지 물었을 때
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                speech_out_text.setText(speech_text); //강의한거 넣어줌
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog=builder.create();
        return dialog;
    }

    }

