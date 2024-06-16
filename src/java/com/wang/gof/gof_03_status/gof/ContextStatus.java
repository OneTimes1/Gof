package com.wang.gof.gof_03_status.gof;

/**
 * 状态上下文
 */
public class ContextStatus {
    private AbstractStatus status;

    public void getStatus(double hour, boolean workIsFinished){
        status.getStatus(hour,workIsFinished);
    }

    public void getStatus(double hour){
        status.getStatus(hour);
    }

    public ContextStatus() {
        this.status = new MorningStatus();
    }
}
