package com.yang.workflow;


public abstract class Work<Param, Result> {
    private Param mParam;
    private boolean canceled;

    protected void _Call(){
        call(mParam);
    }

    public abstract void call(Param p);

    public void cancel(){

    }

    public void end(Result r){

    }
}
