package com.wang.gof.gof_03_status.gof;

public abstract class AbstractStatus {

    public abstract void getStatus(double hour, boolean workIsFinished);

    public void getStatus(double hour){
        getStatus(hour,false);
    }
}
