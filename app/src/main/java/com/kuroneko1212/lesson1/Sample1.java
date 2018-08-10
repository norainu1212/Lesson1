package com.kuroneko1212.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sample1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout (this);
            ll.setOrientation(LinearLayout.VERTICAL);
            setContentView(ll);

        TextView tv = new TextView(this);
        tv.setText("いらっしゃいませ。");
        Button bt = new Button(this);
        bt.setText("購入");

        ll.addView(tv);
        ll.addView(bt);
        //setContentView(R.layout.activity_main);
    }
}
