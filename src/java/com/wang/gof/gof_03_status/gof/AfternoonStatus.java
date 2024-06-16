package com.wang.gof.gof_03_status.gof;

/**
 * 状态3
 * 下午工作精神抖擞
 */
public class AfternoonStatus extends AbstractStatus{

    private AbstractStatus nextStatus;
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        if (hour < 17) {
            System.out.println("下午工作精神抖擞");
            return;
        }
        nextStatus.getStatus(hour,workIsFinished);
    }

    public AfternoonStatus() {
        this.nextStatus = new WorkFinishStatus();
    }
}
