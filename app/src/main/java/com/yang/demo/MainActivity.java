package com.yang.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yang.workflow.WorkFlow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startWork();
            }
        });
    }

    private void startWork() {
        new WorkFlow()
                .next(new WorkA())
                .next(new WorkB())
                .start();

    }
}
