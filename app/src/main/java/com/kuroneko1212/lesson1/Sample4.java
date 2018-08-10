package com.kuroneko1212.lesson1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Sample4 extends Activity {
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

        ll.addView(tv);
        ll.addView(bt);

        bt.setOnClickListener(new SampleClickListener());
    }
    class SampleClickListener implements  View.OnClickListener {
        public void onClick(View v) {
            tv.setText("ありがとうございます。");
        }
    }
}
