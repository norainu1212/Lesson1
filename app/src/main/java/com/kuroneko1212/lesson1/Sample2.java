package com.kuroneko1212.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sample2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout (this);
            ll.setOrientation(LinearLayout.VERTICAL);
            setContentView(ll);

        Button[] bt = new Button[10];

        for(int i=0; i < bt.length; i++) {
            bt[i] = new Button(this);
            bt[i].setText(Integer.toString(i));
            bt[i].setText(String.valueOf(i));
            bt[i].setText(i + "");

            ll.addView(bt[i]);
        }
        //setContentView(R.layout.activity_main);
    }
}
