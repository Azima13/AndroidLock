package com.azima.lockscreenp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.azima.lockscreenp2.utils.LockScreen;
import com.azima.lockscreenp2.utils.LockWindowAccessibilityService;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        LockScreen.getInstance().init(this,true);
        if(LockScreen.getInstance().isActive()){
            toggleButton.setChecked(true);
        }else{
            toggleButton.setChecked(false);

        }


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked){

                    LockScreen.getInstance().active();
                }else{
                    LockScreen.getInstance().deactivate();
                }
            }
        });

    }






}
