package com.example.testloaclaarsecond;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.SizeUtils;
import com.example.localone.DataUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mMethodTv;
    String TAG="周杨，林晓旭，易霖";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        mMethodTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int xcq = DataUtils.getVoiceLineWight(10000);
                Log.d(TAG, "onClick: "+xcq);

            }
        });

    }

    private void initView() {
        mMethodTv = (TextView) findViewById(R.id.methodTv);
    }
}
