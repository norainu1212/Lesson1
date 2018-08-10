package com.kuroneko1212.lesson1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sample4b extends Activity {
   TextView tv;
    Button bt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);

        tv = new TextView(this);
        tv.setText("いらっしゃいませ。");
        bt = new Botton(this);
        bt.setText("購入");
        bt2 = new Botton(this);
        bt2.setText("戻す");

        ll.addView(tv);
        ll.addView(bt);
        ll.addView(bt2);

        bt.setOnClickListener(new SampleClickListener());
    }
    class SampleClickListener implements  View.OnClickListener {
        public void onClick(View v) {
            String tag = v.getTag();
            if(id == 1)
            tv.setText("ありがとうございます。");
        }
    }
}
