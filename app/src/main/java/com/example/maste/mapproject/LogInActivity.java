package com.example.maste.mapproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LogInActivity extends Activity implements View.OnClickListener {

    private Button enter;
    private TextView registration;
    private LinearLayout vkButton;

    boolean checked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        enter = (Button) findViewById(R.id.enter_button);
        registration = (TextView) findViewById(R.id.registration_button);
        vkButton = (LinearLayout) findViewById(R.id.vk_button);

        enter.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    enter.setBackgroundResource(R.drawable.enter_button_clicked);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    enter.setBackgroundResource(R.drawable.enter_button);
                }
                return true;
            }
        });
        vkButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    vkButton.setAlpha((float) 0.5);//нажатие
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    vkButton.setAlpha((float) 0.85);
                }
                return true;
            }
        });
        //
        registration.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.registration_button:
                break;

        }
    }
}
