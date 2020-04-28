package com.example.popactivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private Button test;
    private PopUpWindow popupWindow;
    private LayoutInflater layoutInflater;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test = (Button) findViewById(R.id.button)

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layoutInflater = (LayoutInflater) getApplicationContext.getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.test,null);

             popupWindow = new PopupWindow(container,400,400,true);
             popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY,500,500);
            }
        }


    }
}
