package com.wang.gof.gof_03_status.gof;

/**
 * 状态2
 * 饿了, 午饭, 犯困, 要休息一下
 */
public class NoonStatus extends AbstractStatus{
    private AbstractStatus nextStatus;
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        if (hour < 13){
            System.out.println("饿了, 午饭, 犯困, 要休息一下");
            return;
        }
        nextStatus.getStatus(hour,workIsFinished);
    }

    public NoonStatus() {
        this.nextStatus = new AfternoonStatus();
    }
}
