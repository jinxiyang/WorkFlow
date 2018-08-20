package com.yang.demo;


import android.util.Log;

import com.yang.workflow.Work;

public class WorkA extends Work {


    @Override
    public void call(Object p) {
        Log.i("WorkFlow", " WorkA call: " );
    }
}
