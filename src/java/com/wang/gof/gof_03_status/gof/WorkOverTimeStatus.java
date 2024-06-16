package com.wang.gof.gof_03_status.gof;

/**
 * 状态5
 * 加班, 疲劳至极
 */
public class WorkOverTimeStatus extends AbstractStatus{
    private AbstractStatus nextStatus;
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        if (hour < 21){
            System.out.println("加班中, 疲劳至极");
            return;
        }
        nextStatus.getStatus(hour,workIsFinished);
    }

    public WorkOverTimeStatus() {
        this.nextStatus = new WorkSleepStatus();
    }
}
