package com.yang.demo;


import android.util.Log;

import com.yang.workflow.Work;

public class WorkB extends Work {


    @Override
    public void call(Object p) {
        Log.i("WorkFlow", " WorkB call: " );
    }
}
